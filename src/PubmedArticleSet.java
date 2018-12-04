


import java.io.File;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;


public class PubmedArticleSet{
	 String PubmedArticle;
	public static void main(String[] args) throws FileNotFoundException
	{
		XStream xstream = new XStream();
		xstream.alias("PubmedArticleSet", PubmedArticleSet.class);
		xstream.alias("PubmedArticle", PubmedArticle.class);
		//PubmedArticleSet pb=new PubmedArticleSet();
		Object readobject;
	 
	 String nl="\n";
	 
		 readobject=(PubmedArticleSet)xstream.fromXML(new File("new.xml"));
		 String xml = xstream.toXML(readobject);

	System.out.println(nl+xml);
	
	}

}


class  PubmedArticle
{
	/*private String Title="";
	private String ISOAbbreviation="";
	private String PubmedArticleSet="";*/
	
	
	
	/*public static void loadXml() throws Exception{
	XStream xstream=new XStream();
	xstream.processAnnotations(PubmedArticleSet.class);
	Object readobject= xstream.fromXML(new File("xmls/new.xml"));
	System.out.println("read object from file :"+ readobject );
}
*/
	
	/*FileReader fileReader = new FileReader("new.xml"); 
	XStream xstream = new XStream();   
	xstream.alias("PumbedArticle", PubmedArticleSet.class);
	PubmedArticleSet loadedConfig = (PubmedArticleSet) xstream.fromXML(fileReader);
	 System.out.print(loadedConfig);*/
	
}



