package com.nblh.protalmanage.business.aboutUs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.nblh.integration.system.pojo.User;
import com.nblh.integration.system.service.IUserService;


/**
 * 功能描述：
 * 关于我们-》企业简介
 * 针对企业简介下的子模块自定义模块风格及模块内容
 */
@Controller
@RequestMapping("/aboutUs/companyProfile")
public class CompanyProfileController {
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 创建节点
	 * @return
	 */
	@ResponseBody
	@RequestMapping("addItem")
	public String addItem() {
		List<User> list = userService.queryListByCondition(null);
		return JSONObject.toJSONString(list);
	}
	
	
}
