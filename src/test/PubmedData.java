package test;

import java.util.ArrayList;
import java.util.List;

public class PubmedData {
	History History;
	String PublicationStatus = "aheadofprint";
	ArticleIdList ArticleIdList;
}

class History {
	List<PubMedPubDate> PubMedPubDate = new ArrayList<PubMedPubDate>();
}

class PubMedPubDate {
	int Year;
	int Month;
	int Day;
	int Hour;
	int Minute;
	String PubStatus;

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		Hour = hour;
	}

	public int getMinute() {
		return Minute;
	}

	public void setMinute(int minute) {
		Minute = minute;
	}

	public String getPubStatus() {
		return PubStatus;
	}

	public void setPubStatus(String pubStatus) {
		PubStatus = pubStatus;
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

class ArticleIdList {
	List<ArticleId> ArticleId = new ArrayList<ArticleId>();
}

class ArticleId {
	String ArticleId = "";
}