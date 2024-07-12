

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
         <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body style="background: url(img/img.jpg); background-size: cover;background-attachment: fixed">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3>Register Here</h3>
                            
                            <div class="form">
                                <form action="Register" method="post">
                                    <input type="text" name="name" placeholder="Enter Your Name">
                                    <input type="password" name="pass" placeholder="Enter Password">
                                    <input type="email" name="mail" placeholder="Enter Your Email">
                                    <button type="submit" class="btn">Submit</button>
                                   
                                    
                                </form>
                            </div>
                            <div class="loader">
                                
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
