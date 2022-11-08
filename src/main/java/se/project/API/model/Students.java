package se.project.API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Students {

    @Id
    @GeneratedValue
    private UUID id;
    private String studentId;
    private String name;
    private String surname;
    private String email;
    private String subject;
    private double score;
    private String teacher;
}
