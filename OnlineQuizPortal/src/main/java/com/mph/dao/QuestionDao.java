package com.mph.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mph.model.Question;
import com.mph.utils.DBConnection;

public class QuestionDao {

   public boolean addQuestion(Question question) {

       String sql = "INSERT INTO questions "
                  + "(question_text, option_a, option_b, option_c, option_d, correct_option) "
                  + "VALUES (?, ?, ?, ?, ?, ?)";

       try (
           Connection con = DBConnection.getConnection();
           PreparedStatement ps = con.prepareStatement(sql)
       ) {

           ps.setString(1, question.getQuestionText());
           ps.setString(2, question.getOptionA());
           ps.setString(3, question.getOptionB());
           ps.setString(4, question.getOptionC());
           ps.setString(5, question.getOptionD());
           ps.setString(6, question.getCorrectOption());

           int rows = ps.executeUpdate();
           return rows > 0;

       } catch (Exception e) {
           e.printStackTrace();
       }

       return false;
   }
}