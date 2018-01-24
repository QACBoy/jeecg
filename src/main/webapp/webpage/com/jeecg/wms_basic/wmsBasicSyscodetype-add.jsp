<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>wms_basic_SyscodeType</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script src="plug-in/layer/layer.js"></script>
 <script>
	function btn_ok(){
		$("#btnsub").click();
	}
	function callback(data){
		
		
		if(data.success){
			layer.alert(data.msg, function(index){
				window.location.href="wmsBasicSyscodetypeController.do?list"
				layer.close(index);
			});       
		}
		else{
			layer.alert(data.msg);
		}
	}
</script>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="false" usePlugin="password" layout="table" action="wmsBasicSyscodetypeController.do?doAdd" tiptype="1" callback="callback">
					<input id="id" name="id" type="hidden" value="${wmsBasicSyscodetypePage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							pkSyscodetypecode:
						</label>
					</td>
					<td class="value">
					     	 <input id="pkSyscodetypecode" name="pkSyscodetypecode" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">pkSyscodetypecode</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							syscodetypenamecn:
						</label>
					</td>
					<td class="value">
					     	 <input id="syscodetypenamecn" name="syscodetypenamecn" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">syscodetypenamecn</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							syscodetypenameen:
						</label>
					</td>
					<td class="value">
					     	 <input id="syscodetypenameen" name="syscodetypenameen" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">syscodetypenameen</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							codelength:
						</label>
					</td>
					<td class="value">
					     	 <input id="codelength" name="codelength" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">codelength</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							variant1:
						</label>
					</td>
					<td class="value">
					     	 <input id="variant1" name="variant1" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">variant1</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							variant2:
						</label>
					</td>
					<td class="value">
					     	 <input id="variant2" name="variant2" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">variant2</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							variant3:
						</label>
					</td>
					<td class="value">
					     	 <input id="variant3" name="variant3" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">variant3</label>
						</td>
				</tr>
				
				<tr>
					<td height="50px" align="center" colspan="2">
						<a style="margin-left:80px" href="#" class="easyui-linkbutton l-btn"  plain="true" iconcls="icon-le-back" onclick="history.go(-1)">返回</a>
						<div style="display:none"><input type="submit" id ="btnsub" value=""/></div>
						<a  href="#" class="easyui-linkbutton l-btn"  iconcls="icon-le-ok" onclick="btn_ok()">提交</a>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/wms_basic/wmsBasicSyscodetype.js"></script>		
