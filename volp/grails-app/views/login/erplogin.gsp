<html>
<head>
        <title>Login </title>
        <asset:stylesheet src="bootstrap.css"/>
         <asset:stylesheet src="font-awesome.min.css"/>
         <asset:stylesheet src="w3.css"/>
        <asset:stylesheet src="global.css"/>
        <style type="text/css">
                    #ss
                    {
                    font-size:0.8em;
                    }
                </style>
    </head>
<body>
<div id="header">
            <!-- <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" > -->
            <span id="ss"><i>Bansilal Ramnath Agarwal Charitable Trust's</i> </span></br>
            VI Group In-House ERP</br>

            <br>
        </div>
 <div class = "homeContent">
    <div align="center">
                        <h2 id ="header1"> <b>Login</b></h2>
                    </div>

<g:form url="[controller:'Login',action:'processerplogin']" class="form-horizontal text-justify">
 <table class=" col-sm-12 table table-striped table-bordered">
                    <tbody>
                        <tr>
                <td><label class="control-label">User Name:</label></td>
                <td><input name="username" class="form-control input-md" type="text" placeholder="Enter Your Username"></td></tr>
<tr><td><label class="control-label">Password:</label></td>
<td><input name="password" class="form-control input-md" type="password" placeholder="Enter Your Password" required></td></tr>
</tbody>
</table>
<center><g:submitButton class="btn btn-md btn-primary" name="Login" value="Login"></g:submitButton>
<br><br>
<!-- <a href="/ForgotPassword/verifyemail" class="btn btn-link">Forgot Password</a></center> -->

</g:form>
<br><br><br>

<div id = "footer" >

           All Rights Reserved @ VI Groups

        </div>
</body>
</html>