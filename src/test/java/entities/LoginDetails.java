package entities;

/**
 * Created by navyab on 2/1/16.
 */
public class LoginDetails {
    private String loginUrl;
    private String username;
    private String password;


    public LoginDetails(String LoginUrl, String Username, String Password) {


        this.loginUrl=LoginUrl;
        this.username=Username;
        this.password=Password;


    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() { return password; }




}
