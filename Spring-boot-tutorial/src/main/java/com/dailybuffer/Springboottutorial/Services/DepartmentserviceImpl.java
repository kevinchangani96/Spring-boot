package com.dailybuffer.Springboottutorial.Services;

import com.dailybuffer.Springboottutorial.Repository.DepartmentRepository;
import com.dailybuffer.Springboottutorial.entity.Department;
import com.dailybuffer.Springboottutorial.error.DepartmentNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentserviceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound {
        Optional<Department> department= departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw  new DepartmentNotFound("Department not available");
        }
        return  department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

//    @Override
//    public Department updateDepartment(Long departmentId, Department department) {
//        Department depDB = departmentRepository.findById(departmentId).orElse(null);
//
//        if (depDB != null) {
//            if (Objects.nonNull(department.getDepartmentName()) && !"".equals(department.getDepartmentName())) {
//                depDB.setDepartmentName(department.getDepartmentName());
//            }
//            if (Objects.nonNull(department.getDepartmentAddress()) && !"".equals(department.getDepartmentAddress())) {
//                depDB.setDepartmentAddress(department.getDepartmentAddress());
//            }
//            if (Objects.nonNull(department.getDepartmentCode()) && !"".equals(department.getDepartmentCode())) {
//                depDB.setDepartmentCode(department.getDepartmentCode());
//            }
//
//            // Save the updated department entity
//            return departmentRepository.save(depDB);
//        } else {
//            // Handle the case where the department with the given ID is not found
//            // You can throw an exception or return null, depending on your application's requirements.
//            return null;
//        }
//    }
}
