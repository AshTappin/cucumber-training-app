<html>
<jsp:include page="/WEB-INF/jsp/header.jsp" />

<body>
  <div class="jumbotron">
    <div class="container">
      <h1 class="display-3" id="welcomeText">Hello ${name}!</h1>
      <p class="lead">Create your own ToDos and view them!</p>
      <p class="lead">
        <a class="btn btn-primary btn-lg" href="#" role="button">View my todos</a>
      </p>
    </div>

  </div>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp" />
</html>