import userServiceExercise.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserService userService = new UserService();

        User[] users = new User[13];
        for (int i = 0; i < 13; i++){
            users[i] = userService.createUser("user" + (i+1), "password" + (i+1), "name" + (i+1));

            System.out.println(Arrays.toString(users));
        }
    }
}