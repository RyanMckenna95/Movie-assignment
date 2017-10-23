package models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class Rating {
	public long userID;
	public long movieID;
	public String rating;
	static long counter=01;
	
	public Rating(long userID,long movieID,String rating)
	{
		this.userID=userID;
		this.movieID=movieID;
		this.rating=rating;
	}
	
	public String toString()
	{
		return toStringHelper(this).addValue(userID)
				.addValue(movieID)
				.addValue(rating)
				.toString();
	}
	
	public int hashCode()
	{
		return Objects.hashCode(this.userID,this.movieID,this.rating);
	}

}
