package cl.unaccess.examenes.dto;

public class ExamenDTO {
    private String pacienteRut;
    private String nombreExamen;
    private String medicoUsername;

    public ExamenDTO() {}

    public String getPacienteRut() { return pacienteRut; }
    public void setPacienteRut(String pacienteRut) { this.pacienteRut = pacienteRut; }

    public String getNombreExamen() { return nombreExamen; }
    public void setNombreExamen(String nombreExamen) { this.nombreExamen = nombreExamen; }

    public String getMedicoUsername() { return medicoUsername; }
    public void setMedicoUsername(String medicoUsername) { this.medicoUsername = medicoUsername; }
}