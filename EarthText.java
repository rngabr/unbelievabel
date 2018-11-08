/* Celeste Tubon
     November 8, 2017
     Purpose: determines how to translate a message
     Inputs: none
     Output: the messages
*/
import java.io.*;
import java.util.*;
public class EarthText implements EarthCellPhone{
	private String languageType;
	private String fileName;
	private String trfile;
	EarthText(){
		languageType = "Earth";
		fileName = "Earth.txt";
	}
	//SEXY GUYS CAME TO MY WORK TODAY LOLLLL
	public void sendMessage(String lan, String newfilename) throws InvalidLanguageException, IOException{//send messages
		languageType = lan;
		trfile = newfilename;
		if (languageType.compareTo("Earth")==0){
			System.out.println("Sending Message from Earth Language to Earth Language.");
			AlienText translate = new AlienText(languageType,trfile);
			translate.translateText(languageType,fileName);
			translate.sendText(languageType,trfile);
			
		}
		if (languageType.compareTo("Klingon")==0){
			System.out.println("Sending Message from Earth Language to Klingon.");
			AlienText translate = new AlienText(languageType,trfile);
			translate.translateText(languageType,fileName);
			translate.sendText(languageType,trfile);
		}
		if (languageType.compareTo("Vulcan")==0){
			System.out.println("Sending Message from Earth Language to Vulcan.");
			AlienText translate = new AlienText(languageType,trfile);
			translate.translateText(languageType,fileName);
			translate.sendText(languageType,trfile);
		}
		if (languageType.compareTo("Ferengi")==0){
			System.out.println("\nSending Message from Earth Language to Ferengi.");
			AlienText translate = new AlienText(languageType,trfile);
			translate.translateText(languageType,fileName);
			translate.sendText(languageType,trfile);
		}
		if (languageType.compareTo("non-fed")==0){
			System.out.println("Not Supported by the Adapter.");
		}
		
	}
	public void readMessage(String lan, String filen){
		languageType = lan;
		fileName = filen;
		if (languageType.compareTo("Earth")==0){//FOR EARTH MESSAGES
			try {
				FileReader reader = new FileReader(fileName);
				int character;
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}
	@Override
	public String toString(){
		return "EarthText: \nLanguage: "+languageType+"\nFile Name: "+fileName;
	}
}
