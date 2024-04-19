package curs15;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 * 
 * [{ 	name = "ion",
 * 		email = "ion@gmail.com"
 *   },
 *   { 	name = "ion",
 * 		email = {
 * 				 homeEmail = "ceva",
 * 				 workEnmail = [{}, {}]
 * 				}
 * 
 *   }
 *   ] --> un JSON array
 * 
 */


public class JsonFileProcessor {
	
	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Oana");
		obj.put("email", "oana@oana.net");
		
		try(FileWriter file = new FileWriter("test.json")){
			file.write(obj.toJSONString());
			
		}catch (IOException e) {
			System.out.println("Nu am putut scrie fisierul");
		}						
	}
	
	public void readJsonFile(String key) {
		try(FileReader file = new FileReader("test.json")){
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(file);
			
			String value = (String) jsonObj.get(key);
			System.out.println(value);
			
		}catch(Exception e) {
			System.out.println("Nu am putut citi fisierul!");			
		}
	}
}