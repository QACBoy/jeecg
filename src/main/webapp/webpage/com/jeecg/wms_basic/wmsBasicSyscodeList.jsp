<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="wmsBasicSyscodeList" checkbox="true" fitColumns="true" title="wms_basic_Syscode" actionUrl="wmsBasicSyscodeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="pkSyscodecode"  field="pkSyscodecode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="syscodenamecn"  field="syscodenamecn"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="syscodenameen"  field="syscodenameen"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="fkSyscodettypecode"  field="fkSyscodettypecode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant1"  field="variant1"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant2"  field="variant2"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="variant3"  field="variant3"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="wmsBasicSyscodeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="wmsBasicSyscodeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="wmsBasicSyscodeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="wmsBasicSyscodeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="wmsBasicSyscodeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/wms_basic/wmsBasicSyscodeList.js"></script>		
 <script type="text/javascript">
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'wmsBasicSyscodeController.do?upload', "wmsBasicSyscodeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("wmsBasicSyscodeController.do?exportXls","wmsBasicSyscodeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("wmsBasicSyscodeController.do?exportXlsByT","wmsBasicSyscodeList");
}


	//新增
	function add(title,url,id){
		window.location.href=url
	}
	//修改
	function update(title,url, id){
		updateNotCreateWin("修改",url, "wmsBasicSyscodeList",false);
	}
	//查看
	function view(title,url, id){
	  viewNotCreateWin("查看",url, "wmsBasicSyscodeList",false)
	}
 </script>