package University.System.DTO;

import lombok.Data;
import java.util.List;

@Data
public class CourseDTO {
    private Long id;
    private String name;
    private Long facultyId;
    private List<Long> studentIds;
}