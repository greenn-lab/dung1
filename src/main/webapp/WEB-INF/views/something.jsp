<!DOCTYPE html><%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="ko">
<head>
    <title>Main</title>
</head>
<body>
<h1>It's ${hi} something special!</h1>

<section>
    <table>
        <tbody>
            <c:forEach items="${tables}" var="table" varStatus="i">
                <tr>
                    <th>${i.index}</th>
                    <td>${table.TABLE_NAME}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>

</body>
</html>
