<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada!
		</c:if>
		
		<c:if test="${empty empresa}">
			Cadastro Inválido! Digite o nome da empresa!
		</c:if>
	</body>
</html>