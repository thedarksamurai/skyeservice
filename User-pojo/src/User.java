public class User {
    private String username;
    private String password;
    private String firstName;
    private String lasName;
    private int unsuccessfulLoginAttempts;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getUnsuccessfulLoginAttempts() {
        return unsuccessfulLoginAttempts;
    }

    public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
        this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
    }
}
