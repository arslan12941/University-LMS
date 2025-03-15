package University.System.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="studentprofile")
@Getter
@Setter
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String address;
    private String phone;

    private LocalDate dob;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name="student_id", referencedColumnName="id")
    private Student student;
}
