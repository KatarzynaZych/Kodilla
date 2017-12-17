package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.*;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        LocalDateTime now = LocalDateTime.now();

        Map<Integer, ForumUser> results = forum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().getYear() < (now.getYear()-20))
                .filter(forumUser-> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("Forum Users Map : ");
        results.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
