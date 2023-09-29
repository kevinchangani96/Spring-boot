package com.dailybuffer.Springboottutorial.Repository;

import com.dailybuffer.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department,Long> {
}
