package com.user;

public class UserMain {
    public static void main(String[] args) {

        //CONSTRUCTOR OVERLOADIMNG
        User user1 = new User("Stephanie",30);
        User user2 = new User("Einahpets");

        System.out.println("Name is for first obj: "+user1.getName());
        System.out.println("\nName is for 2nd obj: "+user2.getName());
        System.out.println(user2.getAge());
    }
}
