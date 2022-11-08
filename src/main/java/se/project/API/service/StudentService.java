package se.project.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.project.API.model.Students;
import se.project.API.repository.StudentRepository;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getAll() {
        return studentRepository.findAll();
    }
    public Students create(Students students) {
        Students record = studentRepository.save(students);
        return record;
    }
    public Students getStudentById(UUID id) {
        return studentRepository.findById(id).get();
    }
    public Students update(Students requestBody) {
        UUID id = requestBody.getId();
        Students record = studentRepository.findById(id).get();
        record.setStudentId(requestBody.getStudentId());
        record.setName(requestBody.getName());
        record.setSurname(requestBody.getSurname());
        record.setEmail(requestBody.getEmail());
        record.setSubject(requestBody.getSubject());
        record.setScore(requestBody.getScore());
        record.setTeacher(requestBody.getTeacher());

        record = studentRepository.save(record);
        return record;
    }
    public Students delete(UUID id) {
        Students record = studentRepository.findById(id).get();
        studentRepository.deleteById(id);
        return record;
    }

    public Students getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Students> getByStudentID(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }
}
