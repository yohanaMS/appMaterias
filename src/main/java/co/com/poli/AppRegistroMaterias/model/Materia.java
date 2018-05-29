/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppRegistroMaterias.model;

/**
 *
 * @author sala313
 */
public class Materia {
    
    private String idMateria;
    private String nombre;
    private double numCreditos;
    private double cupoMin;
    private double cupoMAx;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(double numCreditos) {
        this.numCreditos = numCreditos;
    }

    public double getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(double cupoMin) {
        this.cupoMin = cupoMin;
    }

    public double getCupoMAx() {
        return cupoMAx;
    }

    public void setCupoMAx(double cupoMAx) {
        this.cupoMAx = cupoMAx;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cupoMin) ^ (Double.doubleToLongBits(this.cupoMin) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cupoMAx) ^ (Double.doubleToLongBits(this.cupoMAx) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (Double.doubleToLongBits(this.numCreditos) != Double.doubleToLongBits(other.numCreditos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cupoMin) != Double.doubleToLongBits(other.cupoMin)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cupoMAx) != Double.doubleToLongBits(other.cupoMAx)) {
            return false;
        }
        return true;
    }
    
    
    
}
