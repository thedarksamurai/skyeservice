public class User {
    private String userName;
    private String password;
    private String name;

    public User (String[] values){
        this.userName = values[0];
        this.password = values[1];
        this.name = values[2];
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "User [username=" + userName + "password=" + password + "name=" + name + "]";
    }
}
