public class userService {

    public User createUser (String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName("Ivara");
        user.setLasName("Prime");
        return user;
    }
}



