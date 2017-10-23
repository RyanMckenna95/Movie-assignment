package models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class User {
	
	public String firstName;
	public String lastName;
	public int age;
	public String gender;
	public String occupation;
	static long counter=01;
	public long userID;
	public String zipCode;
	
	public User(String firstName,String lastName, int age, String gender,String occupation,String zipCode )
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.gender=gender;
		this.occupation=occupation;
		this.zipCode=zipCode;
		this.userID=counter++;
	}
	
	public String toString()
	{
		return toStringHelper(this).addValue(userID)
				.addValue(firstName)
				.addValue(lastName)
				.addValue(age)
				.addValue(gender)
				.addValue(occupation)
				.addValue(zipCode)
				.toString();
	}
	
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.lastName, this.firstName, this.age, this.gender, this.occupation,this.zipCode);  
	  }

}
