<#macro page>
    <!DOCTYPE html>
    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
          xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>DataBase</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

    </head>
    <body>
    <#nested>
    </body>
    </html>
</#macro>