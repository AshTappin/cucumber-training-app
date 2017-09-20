<html>

<jsp:include page="/WEB-INF/jsp/header.jsp" />

<body>

  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

  <div class="container">
    <div class="row">
      <div class="col-md-offset-1 col-md-3">
        <form class="form-login" method="post">
          <h4>Please login...</h4>
          <input type="text" name="name" class="form-control input-sm chat-input" placeholder="username" /> </br> <input
            type="password" name="password" class="form-control input-sm chat-input" placeholder="password" /> </br>
             <input id="loginButton" value="Login" type="submit" class="btn btn-primary"/> 
             
            
            <font id="error" color="red">${errorMessage}</font>
        </form>

      </div>
    </div>
  </div>

</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp" />
</html>

