package moscatt.corsi.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lost_items")
public class Lostitem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "lost_date", nullable = false)
    private LocalDate lostDate;
    
    @Column(nullable = false)
    private String location;
    
    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean found = false;
    
    @Column(name = "found_date")
    private LocalDate foundDate;
    
    @Column(name = "found_location")
    private String foundLocation;
}

