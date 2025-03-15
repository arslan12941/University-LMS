package University.System.Entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.List;

@Entity
@Table(name="faculties")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyID;

    private String name;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Course> coursesTaught;

}
