<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page isELIgnored="false"%>  
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8" />
    <title>login</title>
    <style>
        .error {
            padding: 15px;
            margin-bottom: 20px;
            border-radius: 4px;
            color: #a94442;
            background-color: #f2dede;
            border: 1px solid #ebccd1;
        }
        .msg {
            padding: 15px;
            margin-bottom: 20px;
            border-radius: 4px;
            color: #31708f;
            background-color: #d9edf7;
            border: 1px solid #bce8f1;
        }
        #login-box {
            width: 300px;
            padding: 20px;
            margin: 100px auto;
            background: #fff;
            -webkit-border-radius: 2px;
            -moz-border-radius: 2px;
            border: 1px solid #000;
        }
        .hide {
            display: none;
        }
        .show {
            display: block;
        }
    </style>
</head>
<body>
    <div id="login-box">
        <h1>Spring Security </h1>
<%--         <div class="error" th:class="${error}? 'show error' : 'hide'" th:text="${error}"></div>
        <div class="msg" th:class="${msg}? 'show msg' : 'hide'" th:text="${msg}"></div> --%>
        <form name='loginForm' action="" method='POST'>
            <table>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <tr>
                    <td>UserName</td>
                    <td><input type='text' name='username' /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type='password' name='password' /></td>
                </tr>
                <tr>
                    <td colspan='2'>
                        <input type="submit" value="submit" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>