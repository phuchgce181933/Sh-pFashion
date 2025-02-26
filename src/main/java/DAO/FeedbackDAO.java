/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Feedback;
import Util.DBContext;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FeedbackDAO extends DBContext {
    public boolean insertFeedback(Feedback feedback) {
        String sql = "INSERT INTO Feedback (UserID, PID, Rating) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, feedback.getUserId());
            ps.setInt(2, feedback.getProductId());
            ps.setInt(3, feedback.getRating());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            Logger.getLogger(FeedbackDAO.class.getName()).log(Level.SEVERE, "Database Error!", e);
            return false;
        }
    }

    public List<Feedback> getAllFeedback() {
    List<Feedback> list = new ArrayList<>();
    String sql = "SELECT FeedbackID, UserID, PID, Rating FROM Feedback";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Feedback fb = new Feedback(
                rs.getInt("FeedbackID"),
                rs.getInt("UserID"),
                rs.getInt("PID"),
                rs.getInt("Rating")
            );
            list.add(fb);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}
   
}