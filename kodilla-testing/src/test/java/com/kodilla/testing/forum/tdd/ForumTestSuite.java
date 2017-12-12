package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    // checking if after new post the quantity of post is 1
    @Test
    public void testAddPost(){
        // given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");

        // when
        forumUser.addPost("somebody","My first post");

        // then
        Assert.assertEquals(1,forumUser.getPostsQuantity());
    }

    // checking of after new comment the quantity of comments is 1
    @Test
    public void testAddComment(){
        // given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post","somebody");

        // when
        forumUser.addComment(thePost,"somebody","My first comment");

        // then
        Assert.assertEquals(1,forumUser.getCommentsQuantity());
    }

    //checking if retrieved post is the same as the post inserted in the class
    @Test
    public void testGetPost() {
        // given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post", "somebody");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        // when
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        // then
        Assert.assertEquals(thePost, retrievedPost);
    }

    //checking if retrieved comment is the same as the comment inserted in the class
    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post", "somebody");
        ForumComment theComment = new ForumComment(thePost, "My first comment",
                "somebody");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    // checking if attempt of remove non-existent post will finish of "false" result
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post", "somebody");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    // checking if attempt of remove non-existent comment will finish of "false" result
    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("my first comment", "somebody");
        ForumComment theComment = new ForumComment(thePost, "my first comment",
                "somebody");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    // checking if  the selected post from the class has been removed
    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post", "somebody");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    // checking if  the selected comment from the class has been removed
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("somebody", "John Smith");
        ForumPost thePost = new ForumPost("My first post", "somebody");
        ForumComment theComment = new ForumComment(thePost, "My first comment",
                "somebody");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}

