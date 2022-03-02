package utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
	
	static FileInputStream oFile;
	
	public static String getValueFromPropertyFile(String sFileName,String skey) throws Exception {
		String sFile="./data/"+sFileName+".properties";
		String oValue=null;
		oFile=new FileInputStream(sFile);
		Properties oBen=new Properties();
		oBen.load(oFile);
		oValue=oBen.getProperty(skey);
		return oValue;
	}
}