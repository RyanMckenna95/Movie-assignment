package models;
import static com.google.common.base.MoreObjects.toStringHelper;

public class Movie {
	
	public String title;
	public int year;
	public String url;
	static long counter=01;
	public long movieID;
	
	public Movie(String title,int year,String url)
	{
		this.title=title;
		this.year=year;
		this.url=url;
		this.movieID=counter++;
	}
	
	@Override
	public String toString()
	{
		return toStringHelper(this).addValue(movieID)
				.addValue(title)
				.addValue(year)
				.addValue(url)
				.toString();
	}
}
