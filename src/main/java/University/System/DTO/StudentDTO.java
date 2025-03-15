package University.System.DTO;

import lombok.Data;
import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private List<Long> enrolledCourseIds;
}