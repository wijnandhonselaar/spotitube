<%--
  Created by IntelliJ IDEA.
  User: Wijnand
  Date: 8-10-2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<h1>/playlist/create</h1>

<form class="row col-sm-offset-3 col-sm-6" method="post" name="playlistForm">
    <div class="">
        <label class="col-sm-6" for="owner">Owner</label>
        <input class="col-sm-6" id="owner" name="owner">
    </div>
    <div class="">
        <label class="col-sm-6" for="name">Name</label>
        <input class="col-sm-6" id="name" name="name">
    </div>
    <div class="">
        <button type="submit" class="btn btn-succes btn-block">Create</button>
    </div>
</form>
</body>
</html>
