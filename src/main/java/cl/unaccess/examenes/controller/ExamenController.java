package cl.unaccess.examenes.controller;

import cl.unaccess.examenes.model.Examen;
import cl.unaccess.examenes.dto.ExamenDTO;
import cl.unaccess.examenes.service.ExamenService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/v1/examenes")
public class ExamenController {

    private final ExamenService service;

    public ExamenController(ExamenService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Examen> crear(@RequestBody ExamenDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.solicitarExamen(dto));
    }

    
    @GetMapping("/paciente/{rut}")
    public ResponseEntity<List<Examen>> listarPorPaciente(@PathVariable String rut) {
        return ResponseEntity.ok(service.listarPorPaciente(rut));
    }
}