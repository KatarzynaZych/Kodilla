package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex; // ‘M’/’F’
    private final LocalDate userDateOfBirth;
    private final int postCount;


    public ForumUser(final int userId,final String userName,final char userSex,final LocalDate userDateOfBirth,final int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "User{" +
                " userId = " + userId + '\'' +
        " userName = " + userName + '\'' +
        " userSex = " + userSex + '\'' +
        " userDateOfBirth = " + userDateOfBirth + '\'' +
        " postCount = " + postCount + '\'' +
                '}';
    }

}
