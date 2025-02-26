<%-- 
    Document   : view_feedback.jsp
    Created on : Feb 26, 2025, 1:42:45 PM
    Author     : ASUS
--%>

<%@page import="Models.Feedback"%>
<%@page import="DAO.FeedbackDAO"%>
<%@ page import="java.util.List" %>
<%@ page import="Models.Feedback" %>
<%@ page import="DAO.FeedbackDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Feedback</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2 style="text-align:center;">Feedback List</h2>
    <table>
        <tr>
            <th>Feedback ID</th>
            <th>User ID</th>
            <th>Product ID</th>
            <th>Rating</th>
        </tr>
        <%
            FeedbackDAO feedbackDAO = new FeedbackDAO();
            List<Feedback> feedbackList = feedbackDAO.getAllFeedback();

            for (Feedback fb : feedbackList) {
        %>
        <tr>
            <td><%= fb.getFeedbackId() %></td>
            <td><%= fb.getUserId() %></td>
            <td><%= fb.getProductId() %></td>
            <td><%= fb.getRating() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
