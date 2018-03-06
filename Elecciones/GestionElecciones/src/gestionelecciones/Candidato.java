/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionelecciones;

/**
 *
 * @author Juan José Rangel.
 */
public class Candidato extends Partido {

    //Variables de clase o miembro
    
    protected int cedula;
    protected int edad;
    protected int telefono;
    protected String direccion;
    protected String ciudad;
   

    Candidato(String nombre, String apellido, int cedula, int edad, int telefono, String direccion, String ciudad, String partido) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.partido = partido;
        

    }

    protected double Costo(int inf) {
        int costInf = 0, t = 200000, r = 150000, i = 10000;
        if (inf == 1) {
            costInf = t;
        }
        if (inf == 2) {
            costInf = r;
        }
        if (inf == 3) {
            costInf = i;
        }
        this.costo += costInf;
        return this.costo;
    }

    protected int Votos(int voto) {
        this.votos += voto;
        return 0;
    }

    protected String datosCandidato() {
        String retorno = "**************************************";
        retorno += "\nCandidato:        " + this.nombre + " " + this.apellido;
        retorno += "\nCedula:           " + this.cedula;
        retorno += "\nEdad:             " + this.edad;
        retorno += "\nTelefono:         " + this.telefono;
        retorno += "\nDireccion:        " + this.direccion;
        retorno += "\nCiudad:           " + this.ciudad;
        retorno += "\nPartido Politico: " + this.partido + "\n";
        retorno += "**************************************\n";
        return retorno;
    }
}

