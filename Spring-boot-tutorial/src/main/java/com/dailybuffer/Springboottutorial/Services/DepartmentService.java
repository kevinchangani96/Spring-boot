package com.dailybuffer.Springboottutorial.Services;

import com.dailybuffer.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartment();

   public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

//  public Department updateDepartment(Long departmentId, Department department);
}
