package test;

import java.util.ArrayList;
import java.util.List;

public class Author {
	String LastName;
	String ForeName;
	String Initials;
	List<AffiliationInfo> AffiliationInfo = new ArrayList<AffiliationInfo>();

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getForeName() {
		return ForeName;
	}

	public void setForeName(String foreName) {
		ForeName = foreName;
	}

	public String getInitials() {
		return Initials;
	}

	public void setInitials(String initials) {
		Initials = initials;
	}

	public List<AffiliationInfo> getAffiliationInfo() {
		return AffiliationInfo;
	}

	public void setAffiliationInfo(List<AffiliationInfo> affiliationInfo) {
		AffiliationInfo = affiliationInfo;
	}

}
