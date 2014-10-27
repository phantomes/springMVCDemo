package com.etmobile.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etmobile.service.UserServiceI;

//这个注解让spring知道这是一个控制器
@Controller
// 根路径
@RequestMapping(value = "/userController")
public class UserController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired//取名一定要规范
	private UserServiceI userService;

	// 子路径 访问方式：http://localhost:8080/根路径/子路径.do(所有以.do结尾的都会被捕捉配置在web.xml中servlet-mapping)
	@RequestMapping(value = "/showUser", method = RequestMethod.GET)//一般不写请求方法
	@ResponseBody
	// 返回的东西直接写在body体中
	public String showUser(String id, HttpServletRequest req, @RequestParam(value = "id") String uid) {
		String name = req.getParameter("id");
		
		return getJSON(name);
		
	}
}
