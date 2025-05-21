package moscatt.corsi.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LostItemFoundUpdateDTO {
    private Boolean found;
    private LocalDate foundDate;
    private String foundLocation;
}
