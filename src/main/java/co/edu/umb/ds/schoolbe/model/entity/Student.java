package co.edu.umb.ds.schoolbe.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "student")
public class Student {

  @Id
  private String id;
  private String name;
  private String document;
  @Indexed(direction = IndexDirection.ASCENDING)
  private int age;

}
