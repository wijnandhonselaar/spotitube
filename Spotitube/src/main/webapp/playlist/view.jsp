<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Wijnand
  Date: 8-10-2015
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${playlist.name}</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<div class="row col-sm-offset-1">
<h1>${playlist.name}</h1>

<h3>Owner: ${playlist.owner}</h3>
</div>
<div class="row col-sm-offset-1 playlistControl">
    <ul class="list-inline">
        <li class="col-sm-offset-9 col-sm-1"><a class="btn btn-block btn-primary" href="/playlist/edit?playlist-name=${playlist.name}">Edit</a></li>
        <li class="col-sm-1"><a class="btn btn-block btn-danger" href="/playlist/delete?playlist-name=${playlist.name}">Delete</a></li>
    </ul>
</div>
<div class="row col-sm-10 col-sm-offset-1">
<form method="post" action="/playlist/update-availability?playlist-name=${playlist.name}">
    <table class="table table-striped table-bordered">
        <tr>
            <th>Performer</th>
            <th>Title</th>
            <th>Url to track</th>
            <th>Duration</th>
            <th>Available offline</th>
        </tr>
        <C:forEach var="track" items="${playlist.tracks}">
            <tr>
                <td>${track.performer}</td>
                <td>${track.title}</td>
                <td><a href="${track.url}">link</a> </td>
                <td>${track.duration}</td>
                <td>
                    <input type="checkbox" disabled="disabled" value="${track.available}" checked="${track.available}" name="available"/>
                </td>
            </tr>
        </C:forEach>
    </table>
</form>
</div>
</body>
</html>
