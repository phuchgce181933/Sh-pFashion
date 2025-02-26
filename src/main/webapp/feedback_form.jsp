<%-- 
    Document   : feedback_form
    Created on : Feb 26, 2025, 1:36:18 PM
    Author     : ASUS
--%>

<form action="createFeedback" method="post">
    <label>User ID:</label>
    <input type="text" name="userId" required><br>

    <label>Product ID:</label>
    <input type="text" name="productId" required><br>

    <label>Rating (1-5):</label>
    <input type="number" name="rating" min="1" max="5" required><br>

    <button type="submit">Submit Feedback</button>
</form>

<% if (request.getAttribute("error") != null) { %>
    <p style="color: red;"><%= request.getAttribute("error") %></p>
<% } %>