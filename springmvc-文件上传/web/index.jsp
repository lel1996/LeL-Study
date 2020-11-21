<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lierlin
  Date: 2020/11/19
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="doUpload" method="post" enctype="multipart/form-data">
  <table>
    <tr>
      <td>文件名字：</td>
      <td><input type="text" name="name"> </td>
    </tr>
    <tr>
      <td>文件上传：</td>
      <td><input type="file" name="file"> </td>
    </tr>
    <tr>

      <td><input type="submit" >上传 </td>
    </tr>
  </table>
  </form>
  </body>
</html>
