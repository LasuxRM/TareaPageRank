package pagerank2;

import java.util.ArrayList;

public class WebPage {
	
	private String DomainName;
	private double LinkIn;
	private double LinkOut;
	
	private double NewPageRank;
	private double OldPageRank;
	
	private ArrayList<String> ListaLinks = new ArrayList<String>();
	
	public WebPage(String domainName, double linkIn, double linkOut) {
		super();
		DomainName = domainName;
		LinkIn = linkIn;
		LinkOut = linkOut;
		
		NewPageRank = 0;
		OldPageRank = 0;
		
	}
	
	
	public String getDomainName() {
		return DomainName;
	}
	public void setDomainName(String name) {
		DomainName = name;
	}

	public double getLinkIn() {
		return LinkIn;
	}
	public void setLinkIn(double linkIn) {
		LinkIn = linkIn;
	}

	public double getLinkOut() {
		return LinkOut;
	}
	public void setLinkOut(double linkOut) {
		LinkOut = linkOut;
	}

	public double getNewPageRank() {
		return NewPageRank;
	}
	public void setNewPageRank(double newPageRank) {
		NewPageRank = newPageRank;
	}

	public double getOldPageRank() {
		return OldPageRank;
	}
	public void setOldPageRank(double oldPageRank) {
		OldPageRank = oldPageRank;
	}

	public ArrayList<String> getListaLinks() {
		return ListaLinks;
	}
	public void AddElementToList(String s) {
		ListaLinks.add(s);
	}
	
	

}
