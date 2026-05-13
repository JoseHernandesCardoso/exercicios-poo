package com.jose;

public class Prontuario {
    private int numeroRegistro;
    private String tipoSanguineo;
    private String alergias;
    
    public Prontuario(int numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
