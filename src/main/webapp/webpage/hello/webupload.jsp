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
<t:formvalid formid="formobj" layout="table" dialog="true" action="helloController.do?index">
    <table class="easyui-table">
        <tr>
            <td align="right">
                <label class="Validform_label">
                    图片上传1:
                </label>
            </td>
            <!-- 文件路径对应的参数name为‘fileName3’、不显示上传文件列表、自动上传、上传按钮显示文字为‘选择图片’、按钮风格：蓝色小按钮、上传类型为图片上传、上传文件数量限制为3 -->
            <td><t:webUploader displayTxt="false" name="documentId" auto="true" type="image"
                               buttonText="选择图片" buttonStyle="btn-blue btn-S" fileNumLimit="3" extensions="jpeg,jpg,png" showImgDiv="uploadFile" />
            </td>
            <td>
                <div id = "uploadFile"/>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    图片上传2:
                </label>
            </td>
            <td class="value">
                <t:webUploader displayTxt="false" name="touxiang" auto="true" type="image" bizType="photosucai"></t:webUploader>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="submit" class="btn-blue btn-S"/></td>
        </tr>
    </table>

</t:formvalid>

</body>
</html>
