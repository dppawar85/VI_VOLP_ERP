<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="VI Group In-House ERP"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <!--  <asset:link rel="icon" href="favicon.ico" type="image/x-ico" /> -->

    <asset:stylesheet src="bootstrap.css"/>
    <asset:stylesheet src="font-awesome.min.css"/>
    <asset:stylesheet src="w3.css"/>
    <asset:stylesheet src="global.css"/>

    <g:layoutHead/>
    <style type="text/css">

                .SettingImage{
                max-height: 20px;
                max-width: 20px;
                height: 20px;
                width: 20px;
                }

                .SettingImage2{
                max-height: 16px;
                max-width: 16px;
                height: 16px;
                width: 16px;
                }

                .SettingText {
                color: white;
                font-size: 60%;
                text-align: left;
                }

                .SettingText2 {
                color: white;
                font-size: 55%;
                text-align: left;
                }

                .button{
                float: right;
                height: 75px;
                width: 140px;
                }

                .button:hover {
                background-color: #34495E;
                }

                .button ul{
                display : none;
                }

                .button ul li {
                list-style-type: none;
                text-align: left;
                height:20px;
                padding-left: 15px;
                margin-top: -12px;
                padding-bottom: 30px;
                text-decoration:none;
                }

                .button:hover ul{
                display : inline-block;
                }

                ul#SettingLI li a:hover{
                color: white;
                text-decoration:none;
                border-radius: 10px;
                background-color:#000;
                }

            </style>
</head>
<body>
 <div id="header">

         <div class="button" id="hideshow">

             <a href="">
                 <img class ="SettingImage"  src = "${resource(dir: 'images', file: 'house304.png')}" alt="vitlogo">
                 <span class = "SettingText">Hello,&nbsp;${session.user}</span>

             </a>

             <ul id = "SettingLI">
                 <li><g:link class = "SettingText2" controller="Login" action="changepassword"><img class ="SettingImage2" src = "${resource(dir: 'images', file: 'key.png')}">&nbsp;&nbsp;&nbsp;Change Password</g:link></li>
                 <li><g:link class = "SettingText2" controller="Login" action="login"> <img class ="SettingImage2" src = "${resource(dir: 'images', file: 'logout.png')}">&nbsp;&nbsp;&nbsp;Logout</g:link></li>
             </ul>

             </div>
             <br>
             <p> Vishwakarma Institute of Technology:: VI ERP</p><br>

     </div>

<!-- <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList">

                </ul>
            </div>

            <div class = "content">


            </div>
</div> -->

    <g:layoutBody/>
<div>
    <footer class="sticky-footer">
        <div class="text-center" id = "footer" >
           <small style="font-size:14px">All Rights Reserved @ VI Groups</small>
        </div>
    </footer>
</div>

</body>

</html>
