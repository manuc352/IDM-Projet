package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.Json;
import org.xtext.example.mydsl.myDsl.JsonOperation;

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
		for (JsonOperation op : ops) {
			if (op instanceof Fichier) {
				Fichier f = (Fichier) op;
				jsonFilename = f.getFileID();
			}
		}
		System.out.println(jsonFilename);
		String pythonCode = "import pandas as pd\n" + 
				"df = pd.read_json(\"" + jsonFilename + "\")\n" +
				"print(df)";	
		
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
		
		Process p = Runtime.getRuntime().exec("python " + PYTHON_OUTPUT);
	    
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