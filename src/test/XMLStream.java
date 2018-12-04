package test;

import java.io.File;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XMLStream {


	public static void main(String[] args) throws FileNotFoundException {

		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("Author", Author.class);
		xstream.alias("authors", Author.class);
		xstream.alias("PubmedArticleSet", PubmedArticleSet.class);
		xstream.alias("MedlineCitation", MedlineCitation.class);
		xstream.alias("PubmedArticle", PubmedArticle.class);
		xstream.alias("AffiliationInfo", AffiliationInfo.class);
		xstream.alias("Keyword", Keyword.class);
		xstream.alias("PubMedPubDate", PubMedPubDate.class);
		xstream.alias("ArticleId", ArticleId.class);

		xstream.useAttributeFor(MedlineCitation.class,"Status");
		xstream.useAttributeFor(MedlineCitation.class,"Owner");
		xstream.useAttributeFor(JournalIssue.class,"CitedMedium");
		xstream.useAttributeFor(ArticleDate.class,"DateType");
		xstream.useAttributeFor(KeywordList.class,"Owner");
		xstream.useAttributeFor(PubMedPubDate.class,"PubStatus");


		xstream.addImplicitCollection(ArticleIdList.class, "ArticleId");
		xstream.addImplicitCollection(History.class, "PubMedPubDate");
		xstream.addImplicitCollection(KeywordList.class, "Keyword");
		xstream.addImplicitCollection(Author.class, "AffiliationInfo");
		xstream.addImplicitCollection(AuthorList.class, "authors");
		xstream.addImplicitCollection(PubmedArticle.class, "MedlineCitation");
		xstream.addImplicitCollection(PubmedArticleSet.class, "PubmedArticle");

		PubmedArticleSet readobject = (PubmedArticleSet) xstream
				.fromXML(new File("pumbed_result.xml"));

		String xml = xstream.toXML(readobject);
		System.out.println((xml));
		

	}
}
