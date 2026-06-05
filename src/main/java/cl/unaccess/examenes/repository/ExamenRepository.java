package cl.unaccess.examenes.repository;

import cl.unaccess.examenes.model.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
    List<Examen> findByPacienteRut(String pacienteRut);
}