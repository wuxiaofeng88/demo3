package com.km.controller;/**
 * Created by asus-pc on 2019/5/26.
 */

import com.km.dao.DepartmentDao;
import com.km.dao.EmployeeDao;
import com.km.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @ClassName CustomerController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/26 21:08
 * @Version 1.0
 **/
@Controller
public class CustomerController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @GetMapping(value = "/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "/emp/list";
    }

    @GetMapping(value = "emp")
    public String toAddPage(Model model){
        model.addAttribute("departments",departmentDao.getDepartments());
        return "/emp/add";
    }
}
