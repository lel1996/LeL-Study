<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<div>
    <center>
        <body>
        <h1>hello,carson!welcome to this page!</h1>
        <br/>
        <br/>
    </center>
</div>
<form align="center" method="post" action="doUpload" enctype="multipart/form-data">
    <table width="100%">
        <tr>
            <td align="right">File Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td align="right">Select File</td>
            <td ><input type="file" name="file"/></td>

        </tr>
        <tr>
            <td align="right"><input type="submit" /></td>
        </tr>
</form>
</body>

</html>