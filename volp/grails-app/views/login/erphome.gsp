<head>
<meta name="layout" content="ERPmainTemplate">
</head>
 <div id = "container">
 <div class = "sidebar">
                 <ul id = "sideBarList">
                    <g:each var="roletypes" in= "${session.rt}">
                        <g:if test="${roletypes.isroletypeset==true}">
                            <li>
                             <g:if test="${roletypes.type=='Admission'}">
                                <g:link controller="Instructor" action="erpadmission">${roletypes.type}</g:link>
                             </g:if>
                             <g:if test="${roletypes.type=='Registration'}">
                                <g:link controller="Instructor" action="erpregistration">${roletypes.type}</g:link>
                             </g:if>
                            </li>
                        </g:if>
                    </g:each>
                 </ul>
  </div>
            <div class = "content">

kkkkkk
            </div>
</div>
