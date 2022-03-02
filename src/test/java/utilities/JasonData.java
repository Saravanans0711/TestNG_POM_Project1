package utilities;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonData {

	public static void main(String[] args) throws Exception, ParseException {
	String sFileLocation="./data/Sample1.json";
	FileReader oRead=new FileReader(sFileLocation);
	JSONParser parse=new JSONParser();
	Object parse2 = parse.parse(oRead);
	JSONObject obj=(JSONObject)parse2;
	String oUName=(String)obj.get("UserName");
	String oPwd=(String)obj.get("Password");
	System.out.println("Name is:"+oUName);
	System.out.println("Password is:"+oPwd);
}}