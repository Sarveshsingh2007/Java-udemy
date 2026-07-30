package com.sarvesh.SpringJdbcEx.repo;

import com.sarvesh.SpringJdbcEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into Student (RollNo, Name, Marks) values(?, ?, ?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + "affected");
    }

    public List<Student> findAll() {
//        List<Student> students = new ArrayList<>();
//        return students;

//        -------------------- H2 --------------------------

//        String sql = "select * from Student";
//        RowMapper<Student> rowMapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setRollNo(rs.getInt("RollNo"));
//                s.setName(rs.getString("Name"));
//                s.setMarks(rs.getInt("Marks"));
//                return s;
//            }
//        };
//        return jdbc.query(sql, rowMapper);

//        ---------------- LEMDA EXPRESSION -----------------------

        String sql = "select * from Student";
        return jdbc.query(sql, (rs, rowNum) -> {
            Student s  = new Student();
            s.setRollNo(rs.getInt("RollNo"));
            s.setName(rs.getString("Name"));
            s.setMarks(rs.getInt("Marks"));
            return s;
        });
    }

    }

