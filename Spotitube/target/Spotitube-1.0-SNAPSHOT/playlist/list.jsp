<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list</title>
</head>
<body>
<h1>playlist/list</h1>

<div>
    <ul>
        <c:forEach var="playlist" items="${playlists}">
            <li><span>${playlist.name}</span> <a href="/playlist/${playlist.name}">View</a></li>
        </c:forEach>
    </ul>
</div>
<div>
    <a href="/playlist/create">Create playlist</a>
</div>
</body>
</html>