package test;

import java.util.*;

class PubmedArticleSet {

	List<PubmedArticle> PubmedArticle = new ArrayList<PubmedArticle>();

	public List<PubmedArticle> getPubmedArticle() {
		return PubmedArticle;
	}

	public void setPubmedArticle(List<PubmedArticle> pubmedArticle) {
		PubmedArticle = pubmedArticle;
	}

}

class PubmedArticle extends PubmedArticleSet {

	List<MedlineCitation> MedlineCitation = new ArrayList<MedlineCitation>();
	PubmedData PubmedData;

	public List<MedlineCitation> getMedlineCitation() {
		return MedlineCitation;
	}

	public void setMedlineCitation(List<MedlineCitation> medlineCitation) {
		MedlineCitation = medlineCitation;
	}

	public PubmedData getPubmedData() {
		return PubmedData;
	}

	public void setPubmedData(PubmedData pubmedData) {
		PubmedData = pubmedData;
	}

}
