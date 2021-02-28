package co.edu.umb.ds.schoolbe.business.controller;

import co.edu.umb.ds.schoolbe.model.entity.Student;
import co.edu.umb.ds.schoolbe.model.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

  private final StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @GetMapping
  public ResponseEntity<List<Student>> getStudents() {
    List<Student> studentList = this.studentRepository.findAll();
    return new ResponseEntity<>(studentList, HttpStatus.OK);
  }

  @GetMapping("/{studentId}")
  public ResponseEntity<Student> getStudents(@PathVariable("studentId") String studentId) {
    Optional<Student> student = this.studentRepository.findById(studentId);
    return new ResponseEntity<>(student.get(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<String> insertStudent(@RequestBody Student student) {
    Student insert = this.studentRepository.insert(student);
    return new ResponseEntity<>(insert.getId(), HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity updateStudent(@RequestBody Student student) {
    this.studentRepository.save(student);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/{studentId}")
  public ResponseEntity deleteStudent(@PathVariable("studentId") String studentId) {
    this.studentRepository.deleteById(studentId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
