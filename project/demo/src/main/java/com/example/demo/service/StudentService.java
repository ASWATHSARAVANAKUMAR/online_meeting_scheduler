package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    public StudentRepository obj;
    public List<StudentModel> Storingdata(List<StudentModel> list)
    {
        return obj.saveAll(list);
        
    }

    public void deletebyid(int id){
        obj.deleteById(id);
    }

    public int updateinfo(List<StudentModel> sm)
    {
       // StudentModel oj=obj.getReferenceById(s);
        obj.saveAll(sm);
        return 1;
    }
   

}