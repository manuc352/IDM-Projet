package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Clear;
import org.xtext.example.mydsl.myDsl.Delete;
import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.Json;
import org.xtext.example.mydsl.myDsl.JsonOperation;
import org.xtext.example.mydsl.myDsl.Pair;
import org.xtext.example.mydsl.myDsl.Search;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JavaCompiler {
	private Json _model;

	JavaCompiler(Json model) {	
		
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
		String outputPath = "./output_java/";
		for (JsonOperation op : ops) {
			if (op instanceof Fichier) {
				Fichier f = (Fichier) op;
				jsonFilename = f.getFileID();
				inputPath+=jsonFilename+".json";
				Object obj;
				try {
					obj = parser.parse(new FileReader(inputPath));
					jsonObject = (JSONObject) obj;
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if (op instanceof Add) {
				valuesToAdd = ((Add) op).getPair();
				jsonObject.put(valuesToAdd.getKey(), valuesToAdd.getValue());
				file = new FileWriter(outputPath+jsonFilename+".json");
				file.write(jsonObject.toJSONString());
				file.close();
			}
			else if (op instanceof Search) {
				searchString = ((Search) op).getKey();
				//System.out.println(jsonObject.get(searchString));
			}
			else if (op instanceof Delete) {
				pairToDelete = ((Delete) op).getPair();
				jsonObject.remove(pairToDelete.getKey(), pairToDelete.getValue());
				System.out.println(pairToDelete.getKey());
				file = new FileWriter(outputPath+jsonFilename+".json");
				file.write(jsonObject.toJSONString());
				file.close();
				
			}
			else if (op instanceof Clear) {
				jsonFilename=op.getFileID();
				jsonObject.clear();
				file = new FileWriter(outputPath+jsonFilename+".json");
				file.write(jsonObject.toJSONString());
				file.close();
				
			}
		}
	
		
		//file = new FileWriter("C:\\Users\\Emmanuel Chauvel\\Desktop\\f1.json");
		//String resourceName = "C:\\Users\\Emmanuel Chauvel\\Desktop\\f1.json";
		//InputStream is = JSONString.class.getResourceAsStream(resourceName);
		//JSONObject jsonObject = new JSONObject(is);
		//jsonObject.append(valuesToAdd.getKey(), valuesToAdd.getValue());
		
	}
	


}
