package com.william.apidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1L,"GQ",00),
            new Student(2L,"Jesus",69)
    ));

    public Iterable<Student> getAllStudents(){
        ArrayList<Student> s = new ArrayList<>();
        for(int x = 0; x < students.size(); x++){
            s.add(studentRepository.findAll());
        }
        return ;
        //return students;
    }

    //TODO
    //Get one student by id

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    //Create | Read | Update | Delete

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student student){
        studentRepository.save(student);
//        for(int x = 0; x < students.size(); x++){
//            Student s = students.get(x);
//            if(student.getName().equals(student)){
//                students.set(x,student);
//            }
//        }
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
//        for(int x = 0; x < students.size(); x++){
//            Student s = students.get(x);
//            if(student.getName().equals(student)){
//                students.remove(x);
//            }
//        }
    }

}
