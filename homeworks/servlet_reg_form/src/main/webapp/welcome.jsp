<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="parts/head.jsp" %>



<h5> Welcome <c:if test="${sessionScope.userEmail ne null}">${sessionScope.userEmail}</c:if>
    <c:if test="${sessionScope.userEmail eq null}">Guest</c:if>
</h5>



<%@ include file="parts/tail.jsp" %>
