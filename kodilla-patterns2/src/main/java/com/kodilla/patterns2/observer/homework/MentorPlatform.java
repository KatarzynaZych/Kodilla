package com.kodilla.patterns2.observer.homework;

public class MentorPlatform implements Observer {

    private final String mentorName;
    private int updateHomeworkCount;

    public MentorPlatform(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentPlatform studentPlatform) {
        System.out.println(mentorName + " has added new task on the StudentPlatform. " + "\n" + "The new task: " + studentPlatform.getHomework() + "\n" + "Now you have " + studentPlatform.getHomeworkList().size() + " tasks to check.");
        updateHomeworkCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateHomeworkCount() {
        return updateHomeworkCount;
    }
}
