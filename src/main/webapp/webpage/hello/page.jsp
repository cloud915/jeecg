<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="t" uri="/easyui-tags" %>
<t:base type="jquery,easyui,tools,DatePicker"/>

<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="helloDaoList" actionUrl="helloController.do?minidaoDatagrid" idField="id" fit="true" queryMode="group"
                    checkbox="true" pagination="true" fitColumns="false" title="分页列表">
            <t:dgCol title="id" field="id" hidden="true" queryMode="group" width="120"/>
            <t:dgCol title="创建日期" field="createDate" formatter="yyyy-MM-dd" query="false" queryMode="group"
                     editor="datebox" width="120"></t:dgCol>
            <t:dgCol title="创建人" field="createBy" width="120"></t:dgCol>

            <t:dgToolBar title="Add" icon="icon-add" url="helloController.do?addHello" funname="toController"/>
        </t:datagrid>


    </div>
</div>
<script type="text/javascript">
    function toController(){

    }
</script>
</body>
</html>
