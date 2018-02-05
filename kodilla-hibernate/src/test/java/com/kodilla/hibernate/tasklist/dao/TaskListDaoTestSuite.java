package com.kodilla.hibernate.tasklist.dao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        TaskList taskList = new TaskList("ToDoList","Things to do");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.delete(id);
    }
}
