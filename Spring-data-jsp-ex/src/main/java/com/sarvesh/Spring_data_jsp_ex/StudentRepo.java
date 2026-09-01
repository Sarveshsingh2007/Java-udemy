package com.sarvesh.Spring_data_jsp_ex;

import com.sarvesh.Spring_data_jsp_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("SELECT s FROM Student s WHERE s.Name = ?1")
    List<Student> findByName(String Name);

    @Query("select s from Student s where s.Marks = ?1")
    List<Student> findByMarks(int Marks);
}
