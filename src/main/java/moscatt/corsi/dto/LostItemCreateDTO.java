package moscatt.corsi.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LostItemCreateDTO {
    private String name;
    private String description;
    private LocalDate lostDate;
    private String location;
}
