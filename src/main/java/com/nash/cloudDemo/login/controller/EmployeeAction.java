package com.nash.cloudDemo.login.controller;

import com.nash.cloudDemo.dao.DepartmentDao;
import com.nash.cloudDemo.dao.EmployeeDao;
import com.nash.cloudDemo.entities.Department;
import com.nash.cloudDemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmployeeAction {


    @InitBinder
    protected  void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    @Autowired
    DepartmentDao departmentDao;
    
    @Autowired
    EmployeeDao employeeDao;
    
    @GetMapping("/emps")
    public String getEmpList(Map map) throws Exception{
        Collection<Employee> empList = employeeDao.getAll();
        
        map.put("empList",empList);
        
        return "employ/list";
    }
    
    @GetMapping("/addemp")
    public String addEmp(Map map) throws Exception{
        Collection<Department> departments = departmentDao.getDepartments();
        
        map.put("departments",departments);
        return"employ/add";
    }
    
    @PostMapping("/saveemp")
    public String saveEmp(Employee employee) throws Exception{
        
        employeeDao.save(employee);
        
        return "redirect:/emp/emps";
    }
}
