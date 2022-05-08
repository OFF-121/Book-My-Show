package account;

import java.util.Scanner;

import movie.MovieList;

public class User {

	private String id="";
	private String userName="";
	private String password="";
	
	
	public String getId() {
		return id;
	}
    public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}

   public void setId(String id) {
		this.id = id;
	}
   public void setUserName(String userName) {
		this.userName = userName;
	}
   public void setPassword(String password) {
		this.password = password;
	}


	public User(String id,String userName,String password) {
		setId(id);
		setUserName(userName);
		setPassword(password);
	}
	
	public User() {
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		int res=0;
		
		for(char c:userName.toCharArray()) res+=c;
		for(char c:password.toCharArray()) res+=c;
		
		return 1010101^res;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public boolean equals(Object obj) {
		User user=(User)obj;
		if(user.userName.equals(userName) && user.password.equals(password)) return true;
		return false;
	}

}


