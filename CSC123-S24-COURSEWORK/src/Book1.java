public class Book1 
{
		private String ISBN;
		private int numOfPages;
		private String authorName;
		private int amazonRank;
		
		public Book1(String authorName, String ISBN, int numOfPages)
		{
			this.authorName = authorName;
			this.ISBN = ISBN;
			this.numOfPages=numOfPages;
		}
		public String getAuthor()
		{
			return authorName;
		}
		public int getAmazonRank()
		{
			return amazonRank;
		}
		public int getNumberOfPages()
		{
			return numOfPages;
		}
		public void setAmazonRank(int amazonRank)
		{
			this.amazonRank = amazonRank;
		}
		public String toString()
		{
			return "Title: "+ authorName+", Pages: "+numOfPages+", Rank: " + amazonRank;
		}
	
		public boolean equals(Book1 h) 
		{
			return getAuthor().equals(h.getAuthor()) && getAmazonRank() == h.getAmazonRank() && getNumberOfPages() == h.getNumberOfPages();
	    }
		public Book1 createCopy()
		{
			Book1 h = new Book1(authorName, ISBN, numOfPages);
			return h;
		}
		

	

}
