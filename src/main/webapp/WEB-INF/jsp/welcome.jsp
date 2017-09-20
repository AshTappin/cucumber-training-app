<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp" />

<body>
  <div class="jumbotron">
    <div class="container">
      <h1 class="display-3" id="welcomeText">Hello ${name}!</h1>
      <p class="lead">Create your own ToDos and view them!</p>
      <p class="lead">
        <a class="btn btn-primary btn-lg" href="/list-todos" role="button">View my todos</a>
      </p>
    </div>

  </div>

  <c:if test="${not empty todos}">
    <table class="table">
      <thead>
        <tr>
          <th>What to do</th>
          <th>Date to be done by</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="element">
          <tr>
            <td>${element.description}</td>
            <td>${element.dateToBeDoneBy}</td>
            <td>${element.status}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </c:if>

</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp" />
</html>