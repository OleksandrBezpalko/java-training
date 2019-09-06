<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Restaurant portal</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/restaurant/"><i class="fas fa-home"></i> </a>
            </li>
            <li class="nav-item"><a class="nav-link"
                                    href="${pageContext.request.contextPath}/restaurant/">All dishes </a>
            </li>
            <li class="nav-item"><a class="nav-link"
                                    href="${pageContext.request.contextPath}/">Order menu </a>
            </li>
            <li class="nav-item"><a class="nav-link"
                                    href="${pageContext.request.contextPath}/">Admin menu </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">Edit</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">User list </a>
            </li>

        </ul>

        <div class="navbar-text mr-3"> ${sessionScope.userEmail}</div>

<c:if test="${sessionScope.userEmail ne null}">
        <div class="mr-3">
            <form action="${pageContext.request.contextPath}/restaurant/logout" method="post">
                <button type="submit" class="btn btn-primary">Log out  <i class="fas fa-sign-out-alt"></i>
                </button>
            </form>
        </div>
</c:if>
    </div>
</nav>
