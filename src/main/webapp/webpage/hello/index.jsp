<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="t" uri="/easyui-tags" %>
<t:base type="jquery,easyui,tools,DatePicker" />
<%--<%@include file="/context/mytags.jsp"%>--%>
<html>
<head>
    <title>Hello jsp</title>
</head>
<body>
<h4>Hello</h4>
<hr/>
<br/>
<br/>
<%--<t:formvalid action="/helloController.do?index" method="post">--%>
<t:formvalid formid="formobj" layout="table" dialog="true" action="helloController.do?index">
<%--<t:webUploader auto="true" name="fileName1" buttonStyle="btn-green btn-L" ></t:webUploader>--%>
    <table class="easyui-table">
        <%--<tr>
            <td>多文件上传：</td>
            <!-- 文件路径对应的参数name为‘fileName1’、业务类型是‘photosucai’、自动上传、上传文件扩展名限制doc,txt,jpg、按钮风格：绿色大号按钮 -->
            <td><t:webUploader name="fileName1" bizType="photosucai" auto="true" extensions="doc,txt,jpg" buttonStyle="btn-green btn-L" ></t:webUploader></td>
        </tr>
        <tr>
            <td>单文件上传：</td>
            <!-- 文件路径对应的参数name为‘fileName2’、单个文件大小限制为500kb、按钮风格：绿色中号按钮、上传文件数量限制为1 -->
            <td><t:webUploader name="fileName2" fileSingleSizeLimit="500" buttonStyle="btn-green btn-M mb20" fileNumLimit="1"></t:webUploader></td>
        </tr>--%>
        <tr>
            <td>图片上传：</td>
            <!-- 文件路径对应的参数name为‘fileName3’、不显示上传文件列表、自动上传、上传按钮显示文字为‘选择图片’、按钮风格：蓝色小按钮、上传类型为图片上传、上传文件数量限制为3 -->
            <td><t:webUploader name="documentId" displayTxt="false" auto="true" buttonText="选择图片" buttonStyle="btn-blue btn-S" type="image" fileNumLimit="3"
                               extensions="jpeg,jpg,png" showImgDiv="uploadFile" /></td>

            <td>
                <div id = "uploadFile"/>
            </td>

        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    图片:
                </label>
            </td>
            <td class="value">
                <t:webUploader displayTxt="false" bizType="photosucai" name="touxiang" auto="true" type="image"></t:webUploader>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="submit" class="btn-blue btn-S"/></td>
        </tr>
    </table>

</t:formvalid>

</body>
</html>
