package cl.unaccess.examenes.service;

import cl.unaccess.examenes.model.Examen;
import cl.unaccess.examenes.dto.ExamenDTO;
import cl.unaccess.examenes.repository.ExamenRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExamenService {

    private final ExamenRepository repo;

    public ExamenService(ExamenRepository repo) {
        this.repo = repo;
    }

    public Examen solicitarExamen(ExamenDTO dto) {
        Examen e = new Examen();
        e.setPacienteRut(dto.getPacienteRut());
        e.setNombreExamen(dto.getNombreExamen());
        e.setMedicoUsername(dto.getMedicoUsername());
        e.setFechaSolicitud(LocalDateTime.now()); 
        e.setEstado("PENDIENTE");        
        return repo.save(e);
    }

    public List<Examen> listarPorPaciente(String rut) {
        return repo.findByPacienteRut(rut);
    }
}