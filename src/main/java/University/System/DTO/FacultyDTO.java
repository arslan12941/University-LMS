package University.System.DTO;

import lombok.Data;
import java.util.List;

@Data
public class FacultyDTO {
    private Long id;
    private String name;
    private List<Long> courseIds;
}