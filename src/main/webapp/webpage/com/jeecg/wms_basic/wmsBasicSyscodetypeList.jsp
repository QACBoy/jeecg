<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="wmsBasicSyscodetypeList" checkbox="true" fitColumns="true" title="wms_basic_SyscodeType" actionUrl="wmsBasicSyscodetypeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="pkSyscodetypecode"  field="pkSyscodetypecode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="syscodetypenamecn"  field="syscodetypenamecn"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="syscodetypenameen"  field="syscodetypenameen"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="codelength"  field="codelength"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant1"  field="variant1"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant2"  field="variant2"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant3"  field="variant3"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="wmsBasicSyscodetypeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="wmsBasicSyscodetypeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="wmsBasicSyscodetypeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="wmsBasicSyscodetypeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="wmsBasicSyscodetypeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/wms_basic/wmsBasicSyscodetypeList.js"></script>		
 <script type="text/javascript">
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'wmsBasicSyscodetypeController.do?upload', "wmsBasicSyscodetypeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("wmsBasicSyscodetypeController.do?exportXls","wmsBasicSyscodetypeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("wmsBasicSyscodetypeController.do?exportXlsByT","wmsBasicSyscodetypeList");
}


	//新增
	function add(title,url,id){
		window.location.href=url
	}
	//修改
	function update(title,url, id){
		updateNotCreateWin("修改",url, "wmsBasicSyscodetypeList",false);
	}
	//查看
	function view(title,url, id){
	  viewNotCreateWin("查看",url, "wmsBasicSyscodetypeList",false)
	}
 </script>