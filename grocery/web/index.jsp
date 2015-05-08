<%--
  Created by IntelliJ IDEA.
  User: Armando
  Date: 5/7/15
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title></title>
  </head>
  <title>CS157B Project by Eight</title>
  <body>
    <h1>Welcome to Our Grocery Store</h1>
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                       url="jdbc:mysql://localhost:3306/grocery"
                       user="root"  password=""/>
    <sql:query dataSource="${db}" var="result">
        SELECT * from product;
    </sql:query>
    <table border="1" width="100%">
        <%--<tr>--%>
            <%--<th>Emp ID</th>--%>
            <%--<th>First Name</th>--%>
            <%--<th>Last Name</th>--%>
            <%--<th>Age</th>--%>
        <%--</tr>--%>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.product_key}"/></td>
                <td><c:out value="${row.description}"/></td>
                <td><c:out value="${row.brand}"/></td>
                <td><c:out value="${row.weight}"/></td>
            </tr>
        </c:forEach>
    </table>
    <%--<select>--%>
      <%--<option value="">Volvo</option>--%>
      <%--<option value="saab">Saab</option>--%>
      <%--<option value="opel">Opel</option>--%>
      <%--<option value="audi">Audi</option>--%>
    <%--</select>--%>
    <%--<button type="button">Roll Up</button>--%>
    <%--<button type="button">Drill Down</button>--%>
    <%--<button type="button">Slice</button>--%>
    <%--<button type="button">Dice</button>--%>
  </body>
</html>
