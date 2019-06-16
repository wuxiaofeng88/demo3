package com.km.controller;/**
 * Created by asus-pc on 2019/5/26.
 */

import com.km.dao.DepartmentDao;
import com.km.dao.EmployeeDao;
import com.km.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

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
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping(value = "/emp")
    public String toAddPage(Model model) {
        model.addAttribute("departments", departmentDao.getDepartments());
        return "emp/add";
    }

    @PostMapping(value = "/emp")
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping(value = "/emp_add")
    public String toEditPage(Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        model.addAttribute("departments", departmentDao.getDepartments());
        return "emp/add";
    }

    @PutMapping("/emp")
    public String alterEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
