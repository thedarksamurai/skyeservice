public class Main {
    public static void main(String[] args) {
        System.out.println("Hello operator, ordis is happy to see you.");
        userService UserService = new userService();
        User ivaraUser = UserService.createUser("ivaraPrime@warframe.com", "Prime9020");
        System.out.println(ivaraUser);
    }
}