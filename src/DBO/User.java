package DBO;

public class User {
	
	 private String Login ;
	    private String passwd ;

	    public User(String Login, String passwd) {
	        this.Login = Login;
	        this.passwd = passwd;
	    }

	    
	    
	    public String getLogin() {
	        return Login;
	    }

	    public void setLogin(String Login) {
	        this.Login = Login;
	    }

	    public String getPasswd() {
	        return passwd;
	    }

	    public void setPasswd(String passwd) {
	        this.passwd = passwd;
	    }
	    
	    
}
