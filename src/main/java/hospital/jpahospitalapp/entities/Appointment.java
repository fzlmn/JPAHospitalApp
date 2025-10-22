package hospital.jpahospitalapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data@NoArgsConstructor @AllArgsConstructor

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private Date date;
   private statusApp cancelled;
   @ManyToOne
   private Patient patient;
   @ManyToOne
   private Doctor doctor;
   @OneToOne(mappedBy = "appointment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Consultation consultation;
}
