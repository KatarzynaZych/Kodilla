package com.kodilla.patterns2.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");

        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help me withfor loop?");
        javaHelpForum.addPost("Better try to use while loop in this case");
        javaToolsForum.addPost("Help pls, MySql db dosen't work");
        javaHelpForum.addPost("Why while, is it better?");
        javaToolsForum.addPost("When I try to log...");
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
