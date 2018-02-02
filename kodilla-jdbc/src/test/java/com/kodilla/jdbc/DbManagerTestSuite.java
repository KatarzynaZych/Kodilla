package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

//    @Test
//    public void testSelectUsersAndPosts()throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "SELECT * FROM ISSUESS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        String newSqlQuery = "SELECT * FROM USERS";
//        Statement newStatement = dbManager.getConnection().createStatement();
//        ResultSet nRS = newStatement.executeQuery(newSqlQuery);
//
//        //Then
//
//        ArrayList<Integer> userIdAssignedto = new ArrayList<>();
//        while(rs.next()) {
//            userIdAssignedto.add(rs.getInt("USER_ID_ASSIGNEDTO"));
//            }
//        System.out.println(userIdAssignedto);
//        Map<Integer, Long> result = userIdAssignedto.stream()
//                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(result);
//
//        int counter = 0;
//        while(nRS.next()) {
//            if (result.get(nRS.getInt("ID"))>1){
//            System.out.println(nRS.getString("FIRSTNAME") + " " +
//                    nRS.getString("LASTNAME"))  ;
//            counter++ ;
//            }
//        }
//
//        //Then
//        rs.close();
//        nRS.close();
//        statement.close();
//        newStatement.close();
//        Assert.assertEquals(3, counter);
//    }
}

//    SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS ISSUES_NUMBER
//    FROM USERS U, ISSUESS I
//    WHERE U.ID = I.USER_ID_ASSIGNEDTO
//    GROUP BY U.ID
//    HAVING COUNT(*) > 1;
