package hospital.jpahospitalapp.repositories;

import hospital.jpahospitalapp.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
