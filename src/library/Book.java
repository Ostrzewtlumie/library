package library;

public class Book {
	private  String authorN, title;
	private String publicY;
	public Book(String aauthorN,String atitle,String apublicY )
	{
		authorN=aauthorN;
		title=atitle;
		publicY=apublicY;
	}
	
	public String getName()
	{
		return authorN;
	}
	public String getTitle()
	{
		return title;
	}
	public String getPublic()
	{
		return publicY;
	}
	public void setName(String aauthorN)
	{
		authorN=aauthorN;
	}
	public void setTitle(String atitle)
	{
		title=atitle;
	}
	public void setPublic(String apublicY)
	{
		publicY=apublicY;
	}
}
