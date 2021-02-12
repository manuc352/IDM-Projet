package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Clear;
import org.xtext.example.mydsl.myDsl.Delete;
import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.Json;
import org.xtext.example.mydsl.myDsl.JsonOperation;
import org.xtext.example.mydsl.myDsl.Pair;
import org.xtext.example.mydsl.myDsl.Search;

import com.google.common.io.Files;

public class PythonCompiler {
	
	private Json _model;

	PythonCompiler(Json model) {	
		
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
		//JsonOperation truc = _model.get;
		// code generation
		List<JsonOperation> ops = _model.getOperations();
		String jsonFilename ="";
		String filePath="C:\\Users\\Emmanuel Chauvel\\Desktop\\";
		
		Pair valuesToAdd = null;
		String searchString = "";
		Pair pairToDelete = null;
		FileWriter file;
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;
		String inputPath = ".//input//";
		String outputPath = "./output_python/";
		for (JsonOperation op : ops) {
			if (op instanceof Fichier) {
				Fichier f = (Fichier) op;
				jsonFilename = f.getFileID();
				inputPath+=jsonFilename+".json";
				outputPath+=jsonFilename+".json";
			}
			else if (op instanceof Add) {
				valuesToAdd = ((Add) op).getPair();
				System.out.println();
			}
			else if (op instanceof Search) {
				searchString = ((Search) op).getKey();
			}
			else if (op instanceof Delete) {
				pairToDelete = ((Delete) op).getPair();
			}
			else if (op instanceof Clear) {
				jsonFilename=op.getFileID();
			}
		}
		//System.out.println(jsonFilename);
		String pythonCode = "import pandas as pd\n" +
				"import json\n"+
				"with open(r\""+inputPath+"\", \'r') as f:\r\n"+
				"		data = json.load(f)\n"+
				"		if \""+searchString+"\" in f.read():\n"+
				" 			print(\""+searchString+" is present\")\n"+
				"with open(r\""+outputPath+"\", 'w') as f:\r\n"
				+ "    entry = {\""+valuesToAdd.getKey()+"\":\""+ valuesToAdd.getValue()+"\"}\r\n"
				+ "    data.update(entry)\r\n"
				+ "    f.seek(0)\n"
				+ "    f.write(str(data))"
				+ "";
		
		
		
		
		// serialize code into Python filename
		String PYTHON_OUTPUT = "python_code.py";			
		/*
		FileWriter fw = new FileWriter(PYTHON_OUTPUT);
		fw.write(pythonCode);
		fw.flush();
		fw.close();	
		*/
		// or shorter
		Files.write(pythonCode.getBytes(), new File(PYTHON_OUTPUT));
		
		// execute the generated Python code
		// roughly: exec "python foo.py"
		
		Process p = Runtime.getRuntime().exec("py " + PYTHON_OUTPUT);
	    
		// output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));
	
	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}
	

}