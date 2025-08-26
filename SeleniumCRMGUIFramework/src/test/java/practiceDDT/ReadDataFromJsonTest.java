package practiceDDT;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonTest {

	public static void main(String[] args) throws IOException, ParseException {
		
		//steps1: parse JSon physical file into Java Object using JsonParser class
		FileReader fileReader=new FileReader("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\ReadJson.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(fileReader);
	
		//step2: convert java object into JSonObject using down casting
		JSONObject map=(JSONObject) obj;
		
		//step3 : get the value from json file using key
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeout"));		
		
	}

}


