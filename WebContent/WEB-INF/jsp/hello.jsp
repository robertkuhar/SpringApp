<%@ include file="/WEB-INF/jsp/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
  <h1>
    <fmt:message key="heading" />
  </h1>
  <p>
    <fmt:message key="greeting" />
    <c:out value="${now}" />
  </p>
  <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
  <a href="<c:url value="inventory.htm"/>">Inventory</a>
</body>
</html>
