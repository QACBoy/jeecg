<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>table_test5</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tableTest5Controller.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${tableTest5Page.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								name:
							</label>
						</td>
						<td class="value">
						     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tableTest5Page.name}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">name</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								sex:
							</label>
						</td>
						<td class="value">
						     	 <input id="sex" name="sex" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tableTest5Page.sex}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">sex</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/test2/tableTest5.js"></script>		
