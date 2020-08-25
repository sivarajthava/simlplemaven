  package com.tcs.fresco;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.SAXException;

public class IntegratorStep2 {
	public static String[] getJacocoRep() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		System.out.println("Retrieving Test Coverage data----------------");
		
		//Get the jacoco report html file
		String val=null;
	 	   File jacocoRep = new File("./target/site/jacoco/index.html");
	 	   Document doc=Jsoup.parse(jacocoRep, "UTF-8");
	 	   Element table = doc.select("table").get(0);
	 	   Elements rows = table.select("tfoot");
	 	   Element row = rows.get(0);
	 	   Elements cols = row.select("td");
	 	   for(int i=0;i< cols.size();i++) {
	    	 if (cols.get(i).text().contains("of")) {
		         System.out.println(cols.get(i).text());
		         val=cols.get(i).text();
		         break;
		     }
	 	   }
	    	 String [] str=val.split("of");
	    	 System.out.println(str[0]);
	    	 return str;
	}
}
