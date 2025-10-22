package hospital.jpahospitalapp.repositories;

import hospital.jpahospitalapp.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {
}
