package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(100,"Zorro", 'M', LocalDate.of(1970,1,18), 157));
        theForumUserList.add(new ForumUser(101,"SpiderMan", 'M', LocalDate.of(2000,2,18), 1007));
        theForumUserList.add(new ForumUser(102,"Batman", 'M', LocalDate.of(1987,4,18), 15));
        theForumUserList.add(new ForumUser(106,"Lady Deadpool", 'F', LocalDate.of(1987,4,18), 15));
        theForumUserList.add(new ForumUser(103,"Flesh", 'M', LocalDate.of(1968,6,18), 0));
        theForumUserList.add(new ForumUser(105,"SuperMan", 'M', LocalDate.of(1960,7,18), 507));
        theForumUserList.add(new ForumUser(104,"WonderWoman", 'F', LocalDate.of(1988,9,18), 7));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
