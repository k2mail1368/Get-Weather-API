
package day1.examples;

import java.io.*;
import java.net.*;

public class Exampletwodim {

	   public static String getHTML(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }
	
	public static void main(String[] args) {
		//args[0] if passed via cli
		String url = "http://api.openweathermap.org/data/2.5/weather?zip=07054&APPID=7445cc8fd6187760cfe7190b49948578";
	    try {
	    	String result = getHTML(url);
	    	System.out.println(result);
	    }
	    catch (Exception ex) {
	    	System.out.println(ex.getMessage());
	    }
	}

}
