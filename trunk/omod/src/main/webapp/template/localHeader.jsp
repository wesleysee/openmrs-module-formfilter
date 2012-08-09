<spring:htmlEscape defaultHtmlEscape="true" />
<openmrs:hasPrivilege privilege="Manage Forms">
<ul id="menu">
	<li class="first">
	  <a href="${pageContext.request.contextPath}/admin"><spring:message code="admin.title.short" /></a>
	</li>
	<li <c:if test='<%= request.getRequestURI().contains("/manage") %>'>class="active"</c:if> >
		<a href="${pageContext.request.contextPath}/module/formfilter/manage.form"><spring:message code="formfilter.manage" /></a>
	</li>
	
	<!-- Add further links here -->
</ul>
</openmrs:hasPrivilege>