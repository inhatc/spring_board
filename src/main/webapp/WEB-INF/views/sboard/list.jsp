<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>
<div class='box-body'>

	<select name = "searchType">
		<option value="n"
		<c:out value="${cri.searchType == null?' selected':'' }"/>>
		---</option>
		<option value="t"
			<c:out value="$cri.searchType eq 'c'?selected':''}"/>>
		Title</option>
		<option valiue="c"
			<c:out value="${cri.searchType eq 'c'?selected:''}"/>>
		Content</option>
		<option valiue="w"
			<c:out value="${cri.searchType eq 'w'?selected:''}"/>>
		Writer</option>
		<option valiue="tc"
			<c:out value="${cri.searchType eq 'tc'?selected:''}"/>>
		Title OR Content</option>
		<option valiue="cw"
			<c:out value="${cri.searchType eq 'cw'?selected:''}"/>>
		Content OR Writer</option>
		<option valiue="tcw"
			<c:out value="${cri.searchType eq 'tcw'?selected:''}"/>>
		Title OR Content Or Content</option>
	</select>
</div>

<%@include file="../include/footer.jsp"%>
