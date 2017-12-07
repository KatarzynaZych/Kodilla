package com.kodilla.testing.user;

import com.kodilla.testing.user.SimpleUser;

import java.net.SocketPermission;

public class TestingMain {

    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }
    }
}
