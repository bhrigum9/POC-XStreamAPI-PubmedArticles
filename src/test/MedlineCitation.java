package test;

import java.util.*;

public class MedlineCitation {
	int PMID;
	DateCreated DateCreated;
	DateRevised DateRevised;
	Article Article;
	MedlineJournalInfo MedlineJournalInfo;
	KeywordList KeywordList;
	private String Status,Owner;
	private int Version;


	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}



	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public int getPMID() {
		return PMID;
	}

	public void setPMID(int pMID) {
		PMID = pMID;
	}

	public DateCreated getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(DateCreated dateCreated) {
		DateCreated = dateCreated;
	}



	public DateRevised getDateRevised() {
		return DateRevised;
	}

	public void setDateRevised(DateRevised dateRevised) {
		DateRevised = dateRevised;
	}

	public Article getArticle() {
		return Article;
	}

	public void setArticle(Article article) {
		Article = article;
	}

	public MedlineJournalInfo getMedlineJournalInfo() {
		return MedlineJournalInfo;
	}

	public void setMedlineJournalInfo(MedlineJournalInfo medlineJournalInfo) {
		MedlineJournalInfo = medlineJournalInfo;
	}

	public KeywordList getKeywordList() {
		return KeywordList;
	}

	public void setKeywordList(KeywordList keywordList) {
		KeywordList = keywordList;
	}

}





// ---------------tag PAgination-------------------

class Pagination {
	public String getMedlinePgn() {
		return MedlinePgn;
	}

	public void setMedlinePgn(String medlinePgn) {
		MedlinePgn = medlinePgn;
	}

	String MedlinePgn;
}

// -----------------------------------------Abstract--------------------------

class Abstract {
	String AbstractText;
	String NlmCategory;
	
	public String getNlmCategory() {
		return NlmCategory;
	}

	public void setNlmCategory(String nlmCategory) {
		NlmCategory = nlmCategory;
	}

	public String getAbstractText() {
		return AbstractText;
	}

	public void setAbstractText(String abstractText) {
		AbstractText = abstractText;
	}
}

// ------------------tag AuthorList-----------

class AuthorList {
	List<Author> authors = new ArrayList<Author>();

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}

// ----------------tag// PublicationList------

class PublicationTypeList {
	String PublicationType;

	public String getPublicationType() {
		return PublicationType;
	}

	public void setPublicationType(String publicationType) {
		PublicationType = publicationType;
	}
}

// -----------------Article Date-------------------

class ArticleDate {
	int Year;
	int Month;
	int Day;
	String DateType;

	public String getDateType() {
		return DateType;
	}

	public void setDateType(String dateType) {
		DateType = dateType;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}
}

// ----------------Medline Journal Info---------------------
class MedlineJournalInfo {
	String MedlineTA;
	int NlmUniqueID;
	String ISSNLinking;

	public String getMedlineTA() {
		return MedlineTA;
	}

	public void setMedlineTA(String medlineTA) {
		MedlineTA = medlineTA;
	}

	public int getNlmUniqueID() {
		return NlmUniqueID;
	}

	public void setNlmUniqueID(int nlmUniqueID) {
		NlmUniqueID = nlmUniqueID;
	}

	public String getISSNLinking() {
		return ISSNLinking;
	}

	public void setISSNLinking(String iSSNLinking) {
		ISSNLinking = iSSNLinking;
	}
}

// ----------keyword List---------------------------------------------

class KeywordList {
	List<Keyword> Keyword = new ArrayList<Keyword>();
	String Owner;

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public List<Keyword> getKeyword() {
		return Keyword;
	}

	public void setKeyword(List<Keyword> keyword) {
		Keyword = keyword;
	}
}
