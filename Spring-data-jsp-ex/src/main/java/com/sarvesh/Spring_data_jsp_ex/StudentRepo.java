package com.sarvesh.Spring_data_jsp_ex;

import com.sarvesh.Spring_data_jsp_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
