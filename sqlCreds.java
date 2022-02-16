package cs3560FinalProject;

public class sqlCreds {
	private static String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net/heroku_a191d5076c9f6e9";
	private static String username = "b22163d58326e0";
	private static String pass = "64acaecf";
	
	public String getUrl() {
		return url;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPass() {
		return pass;
	}
}
