<div class = "sidebar">
                <ul id = "sideBarList">
                    <g:each var="rolelinks" in= "${session.rolelinkslist}">
                        <g:if test="${rolelinks.isrolelinkactive==true}">
                            <li>
                           llll <g:link controller="${rolelinks.controller_name}" action="${rolelinks.action_name}">${rolelinks.link_name}</g:link>
                            </li>
                        </g:if>
                    </g:each>

                </ul>
 </div>