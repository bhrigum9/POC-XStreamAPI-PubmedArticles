import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

class Date {
    int year;
    int month;
    int day;

}
@XStreamAlias("PumbedArticle")
class PumbedArticle{
	String xml=null;
}
@XStreamAlias("Article")
class Article{
	 String Article="Oncotarget";
	 String Journal="";
	
}
class ISSN extends Article
{
	 String JournalIssue="";
	
}
public class Xstream {
    public static void main(String[] args) {

        XStream xstream = new XStream();
        PumbedArticle pumbedarticle=new PumbedArticle();
        Date date = new Date();
        Article art=new Article();
        ISSN issn=new ISSN();   
        date.year = 2016;
        date.month = 1;
        date.day = 26;
        
        
       
        xstream.alias("PumbedArticle", PumbedArticle.class);
        xstream.alias("DateCreated", Date.class);
        xstream.alias("Article PubModel=Print-Electronic", Article.class);

        String decl = "\n";
        String xml = xstream.toXML(pumbedarticle);
        String xml1 = xstream.toXML(date);
        Date newdate = (Date)xstream.fromXML(xml1);
        newdate.month = 1;
        newdate.day = 27;
        String xml2 = xstream.toXML(newdate);
        String xml3 = xstream.toXML(art);
        String xml4 = xstream.toXML(issn);
        System.out.print(decl +xml1+decl+xml2+decl+xml3+decl+xml4+decl+ xml );
    }
}
