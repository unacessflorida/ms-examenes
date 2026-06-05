package cl.unaccess.examenes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pacienteRut;
    private String nombreExamen; 
    private String medicoUsername; 
    private LocalDateTime fechaSolicitud;
    private String estado;       

    public Examen() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPacienteRut() { return pacienteRut; }
    public void setPacienteRut(String pacienteRut) { this.pacienteRut = pacienteRut; }

    public String getNombreExamen() { return nombreExamen; }
    public void setNombreExamen(String nombreExamen) { this.nombreExamen = nombreExamen; }

    public String getMedicoUsername() { return medicoUsername; }
    public void setMedicoUsername(String medicoUsername) { this.medicoUsername = medicoUsername; }

    public LocalDateTime getFechaSolicitud() { return fechaSolicitud; }
    public void setFechaSolicitud(LocalDateTime fechaSolicitud) { this.fechaSolicitud = fechaSolicitud; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}