package co.edu.umb.ds.schoolbe.model.repository;

import co.edu.umb.ds.schoolbe.model.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
