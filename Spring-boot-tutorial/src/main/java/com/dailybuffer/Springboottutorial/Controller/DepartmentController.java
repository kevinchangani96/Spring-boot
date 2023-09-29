package com.dailybuffer.Springboottutorial.Controller;

import com.dailybuffer.Springboottutorial.Services.DepartmentService;
import com.dailybuffer.Springboottutorial.Services.DepartmentserviceImpl;
import com.dailybuffer.Springboottutorial.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return  departmentService.saveDepartment(department);
    }
    @GetMapping("/departmentdata")
    public List<Department> getDepartment(@RequestBody Department department) {
        return  departmentService.fetchDepartment();
    }
    @GetMapping("/departmentdata/{id}")
    public  Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);

    }
    @DeleteMapping("/departmentdata/{id}")
    public  String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Delete Successfully!";

    }
//    @PutMapping("/departmentdata/{id}")
//    public  Department updateDepartment(Long departmentId,
//                                        @RequestBody Department department){
//        return departmentService.updateDepartment(departmentId,department);
//
//    }

}
