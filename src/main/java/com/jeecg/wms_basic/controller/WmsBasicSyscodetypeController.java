package com.jeecg.wms_basic.controller;
import com.jeecg.wms_basic.entity.WmsBasicSyscodetypeEntity;
import com.jeecg.wms_basic.service.WmsBasicSyscodetypeServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller  
 * @Description: wms_basic_SyscodeType
 * @author onlineGenerator
 * @date 2018-01-22 17:25:22
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/wmsBasicSyscodetypeController")
public class WmsBasicSyscodetypeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(WmsBasicSyscodetypeController.class);

	@Autowired
	private WmsBasicSyscodetypeServiceI wmsBasicSyscodetypeService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * wms_basic_SyscodeType列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/wms_basic/wmsBasicSyscodetypeList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(WmsBasicSyscodetypeEntity wmsBasicSyscodetype,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(WmsBasicSyscodetypeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, wmsBasicSyscodetype, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.wmsBasicSyscodetypeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除wms_basic_SyscodeType
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(WmsBasicSyscodetypeEntity wmsBasicSyscodetype, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		wmsBasicSyscodetype = systemService.getEntity(WmsBasicSyscodetypeEntity.class, wmsBasicSyscodetype.getId());
		message = "wms_basic_SyscodeType删除成功";
		try{
			wmsBasicSyscodetypeService.delete(wmsBasicSyscodetype);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "wms_basic_SyscodeType删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除wms_basic_SyscodeType
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "wms_basic_SyscodeType删除成功";
		try{
			for(String id:ids.split(",")){
				WmsBasicSyscodetypeEntity wmsBasicSyscodetype = systemService.getEntity(WmsBasicSyscodetypeEntity.class, 
				id
				);
				wmsBasicSyscodetypeService.delete(wmsBasicSyscodetype);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "wms_basic_SyscodeType删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加wms_basic_SyscodeType
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(WmsBasicSyscodetypeEntity wmsBasicSyscodetype, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "wms_basic_SyscodeType添加成功";
		try{
			wmsBasicSyscodetypeService.save(wmsBasicSyscodetype);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "wms_basic_SyscodeType添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新wms_basic_SyscodeType
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(WmsBasicSyscodetypeEntity wmsBasicSyscodetype, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "wms_basic_SyscodeType更新成功";
		WmsBasicSyscodetypeEntity t = wmsBasicSyscodetypeService.get(WmsBasicSyscodetypeEntity.class, wmsBasicSyscodetype.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(wmsBasicSyscodetype, t);
			wmsBasicSyscodetypeService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "wms_basic_SyscodeType更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * wms_basic_SyscodeType新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(WmsBasicSyscodetypeEntity wmsBasicSyscodetype, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(wmsBasicSyscodetype.getId())) {
			wmsBasicSyscodetype = wmsBasicSyscodetypeService.getEntity(WmsBasicSyscodetypeEntity.class, wmsBasicSyscodetype.getId());
			req.setAttribute("wmsBasicSyscodetypePage", wmsBasicSyscodetype);
		}
		return new ModelAndView("com/jeecg/wms_basic/wmsBasicSyscodetype-add");
	}
	/**
	 * wms_basic_SyscodeType编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(WmsBasicSyscodetypeEntity wmsBasicSyscodetype, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(wmsBasicSyscodetype.getId())) {
			wmsBasicSyscodetype = wmsBasicSyscodetypeService.getEntity(WmsBasicSyscodetypeEntity.class, wmsBasicSyscodetype.getId());
			req.setAttribute("wmsBasicSyscodetypePage", wmsBasicSyscodetype);
		}
		return new ModelAndView("com/jeecg/wms_basic/wmsBasicSyscodetype-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","wmsBasicSyscodetypeController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(WmsBasicSyscodetypeEntity wmsBasicSyscodetype,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(WmsBasicSyscodetypeEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, wmsBasicSyscodetype, request.getParameterMap());
		List<WmsBasicSyscodetypeEntity> wmsBasicSyscodetypes = this.wmsBasicSyscodetypeService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"wms_basic_SyscodeType");
		modelMap.put(NormalExcelConstants.CLASS,WmsBasicSyscodetypeEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("wms_basic_SyscodeType列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,wmsBasicSyscodetypes);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(WmsBasicSyscodetypeEntity wmsBasicSyscodetype,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"wms_basic_SyscodeType");
    	modelMap.put(NormalExcelConstants.CLASS,WmsBasicSyscodetypeEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("wms_basic_SyscodeType列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<WmsBasicSyscodetypeEntity> listWmsBasicSyscodetypeEntitys = ExcelImportUtil.importExcel(file.getInputStream(),WmsBasicSyscodetypeEntity.class,params);
				for (WmsBasicSyscodetypeEntity wmsBasicSyscodetype : listWmsBasicSyscodetypeEntitys) {
					wmsBasicSyscodetypeService.save(wmsBasicSyscodetype);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<WmsBasicSyscodetypeEntity> list() {
		List<WmsBasicSyscodetypeEntity> listWmsBasicSyscodetypes=wmsBasicSyscodetypeService.getList(WmsBasicSyscodetypeEntity.class);
		return listWmsBasicSyscodetypes;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		WmsBasicSyscodetypeEntity task = wmsBasicSyscodetypeService.get(WmsBasicSyscodetypeEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody WmsBasicSyscodetypeEntity wmsBasicSyscodetype, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<WmsBasicSyscodetypeEntity>> failures = validator.validate(wmsBasicSyscodetype);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			wmsBasicSyscodetypeService.save(wmsBasicSyscodetype);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = wmsBasicSyscodetype.getId();
		URI uri = uriBuilder.path("/rest/wmsBasicSyscodetypeController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody WmsBasicSyscodetypeEntity wmsBasicSyscodetype) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<WmsBasicSyscodetypeEntity>> failures = validator.validate(wmsBasicSyscodetype);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			wmsBasicSyscodetypeService.saveOrUpdate(wmsBasicSyscodetype);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		wmsBasicSyscodetypeService.deleteEntityById(WmsBasicSyscodetypeEntity.class, id);
	}
}
