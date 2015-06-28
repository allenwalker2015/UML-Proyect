/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author POO2015
 */
public class Reserva {
    int idReserva;
    int idCliente;
    String fechaReserva;
    int numeroDiasReserva;
    int estadoReserva;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNumeroDiasReserva() {
        return numeroDiasReserva;
    }

    public void setNumeroDiasReserva(int numeroDiasReserva) {
        this.numeroDiasReserva = numeroDiasReserva;
    }

    public int getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    
    int verificarEstadoReserva(int rev){
        estadoReserva=rev;
        return estadoReserva;
    }
}
/*
create table reserva(
	idReserva int not null AUTO_INCREMENT,
	idCliente int,
	codHabitacion varchar(4),
	fechaReserva varchar(10),
	numeroDiasReservas int(2),
	idEstReserva int(1),
        PRIMARY KEY (idReserva)
);

*/