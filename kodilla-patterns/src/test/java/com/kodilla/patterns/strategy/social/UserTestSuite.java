package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;
public class UserTestSuite {


        @Test
        public void testDefaultSharingStrategies() {
            //Given

            User twitterUser = new Millenials("Twitter");
            User facebookUser = new YGeneration("Facebooker");
            User snapchatUser = new ZGeneration("Snapchatter");


            //When
            String millenialsShare = twitterUser.sharePost();
            System.out.println("Millenials " + millenialsShare);

            String yGenerationShare = facebookUser.sharePost();
            System.out.println("Ygeneration " + yGenerationShare);

            String zGenerationShare = snapchatUser.sharePost();
            System.out.println("Zgeneration " + zGenerationShare);

            //Then
            Assert.assertEquals("share post on Facebook.",yGenerationShare);
            Assert.assertEquals("share post on Twitter.",millenialsShare);
            Assert.assertEquals("share post on Snapchat.",zGenerationShare);

        }

        @Test
        public void testIndividualSharingStrategy() {
            //Given
            User millenialsUser = new YGeneration("Facebooker");

            //When
            String millenialsShare = millenialsUser.sharePost();
            System.out.println("Millenial not always " + millenialsShare);

            millenialsUser.setSocialPublisher(new SnapchatPublisher());
            millenialsShare = millenialsUser.sharePost();

            System.out.println("Millenial not always " + millenialsShare);

            //Then
            Assert.assertEquals("share post on Snapchat." , millenialsShare);
        }
}
