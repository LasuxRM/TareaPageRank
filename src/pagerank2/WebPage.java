package pagerank2;

public class WebPage {
	
	//private String DomainName;
	private double LinkIn;
	private double LinkOut;
	
	private double NewPageRank;
	private double OldPageRank;
	
	
	public WebPage(double linkIn, double linkOut) {
		super();
		//DomainName = name;
		LinkIn = linkIn;
		LinkOut = linkOut;
		
		NewPageRank = 0;
		OldPageRank = 0;
	}
	
//	public String getName() {
//		return DomainName;
//	}
//	public void setName(String name) {
//		DomainName = name;
//	}

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
	
	

}
