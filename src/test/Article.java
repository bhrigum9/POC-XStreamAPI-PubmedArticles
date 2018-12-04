package test;

class Article {
	Journal Journal;
	String ArticleTitle;
	Pagination Pagination;
	String ELocationID;
	Abstract Abstract;
	AuthorList AuthorList;
	String Language;
	PublicationTypeList PublicationTypeList;
	ArticleDate ArticleDate;

	public Journal getJournal() {
		return Journal;
	}

	public void setJournal(Journal journal) {
		Journal = journal;
	}

	public String getArticleTitle() {
		return ArticleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		ArticleTitle = articleTitle;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination pagination) {
		Pagination = pagination;
	}

	public String getELocationID() {
		return ELocationID;
	}

	public void setELocationID(String eLocationID) {
		ELocationID = eLocationID;
	}

	public Abstract getAbstract() {
		return Abstract;
	}

	public void setAbstract(Abstract abstract1) {
		Abstract = abstract1;
	}

	public AuthorList getAuthorList() {
		return AuthorList;
	}

	public void setAuthorList(AuthorList authorList) {
		AuthorList = authorList;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public PublicationTypeList getPublicationTypeList() {
		return PublicationTypeList;
	}

	public void setPublicationTypeList(PublicationTypeList publicationTypeList) {
		PublicationTypeList = publicationTypeList;
	}

	public ArticleDate getArticleDate() {
		return ArticleDate;
	}

	public void setArticleDate(ArticleDate articleDate) {
		ArticleDate = articleDate;
	}
}

//----------------------------tagJournal------------

class Journal {
	String ISSN;
	String Title;
	String ISOAbbreviation;
	JournalIssue JournalIssue;

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getISOAbbreviation() {
		return ISOAbbreviation;
	}

	public void setISOAbbreviation(String iSOAbbreviation) {
		ISOAbbreviation = iSOAbbreviation;
	}

	public JournalIssue getJournalIssue() {
		return JournalIssue;
	}

	public void setJournalIssue(JournalIssue journalIssue) {
		JournalIssue = journalIssue;
	}
}


//------------------------JournalIssue-----------------------------

class JournalIssue {
	PubDate PubDate;
	String CitedMedium;
	
	public PubDate getPubDate() {
		return PubDate;
	}

	public void setPubDate(PubDate pubDate) {
		PubDate = pubDate;
	}

	public String getCitedMedium() {
		return CitedMedium;
	}

	public void setCitedMedium(String citedMedium) {
		CitedMedium = citedMedium;
	}

	
}


//-----------------------------------------PubDate-------------------------------

class PubDate {
	int Year;
	String Month;
	int Day;

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}
}

