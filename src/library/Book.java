package library;

public class Book {
	private  String authorN, authorS, title;
	private int publicY;
	public Book(String aauthorN,String aauthorS,String atitle,int apublicY )
	{
		authorN=aauthorN;
		authorS=aauthorS;
		title=atitle;
		publicY=apublicY;
	}
	
	public String getName()
	{
		return authorN;
	}
	public String getSecondName()
	{
		return authorS;
	}
	public String getTitle()
	{
		return title;
	}
	public int getPublic()
	{
		return publicY;
	}
	public void setName(String aauthorN)
	{
		authorN=aauthorN;
	}
	public void setSecondNAme(String aauthorS)
	{
		authorS=aauthorS;
	}
	public void setTitle(String atitle)
	{
		title=atitle;
	}
	public void setPublic(int apublicY)
	{
		publicY=apublicY;
	}
}