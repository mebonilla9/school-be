package co.edu.umb.ds.schoolbe.model.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

  //private StudentRepository studentRepository;

  /*public DbSeeder(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }*/

  @Override
  public void run(String... args) throws Exception {
    /*Student firstStudent = Student.builder()
      .name("Valentina Rendón")
      .document("12536354")
      .age(20)
      .build();

    Student secondStudent = Student.builder()
      .name("Alvaro Cardozo")
      .document("18765432")
      .age(22)
      .build();

    Student thirdStudent = Student.builder()
      .name("Manuel Bonilla")
      .document("1573686943")
      .age(32)
      .build();

    // Drop all Students
    this.studentRepository.deleteAll();

    // Add our students to the database
    List<Student> students = Arrays.asList(firstStudent,secondStudent,thirdStudent);

    this.studentRepository.saveAll(students);*/
  }

}
