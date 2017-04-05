package Modelo;

import java.util.Date;

/**
 *
 * @author José Manuel Moreno Córdoba
 */
public final class Cliente extends Usuario{
    
    private Pedido[] pedidosRealizados;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private String dni;
    
    public Cliente(int id, String nombreUsuario, String contrasenya, Date fechaRegistro, String nombre, String apellidos, int permisos, Pedido[] pedidosRealizados, String direccion, String telefono, Date fechaNacimiento, String dni){
        super(id, nombreUsuario, contrasenya, fechaRegistro, nombre, apellidos, permisos);
        this.pedidosRealizados = pedidosRealizados;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Pedido[] getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(Pedido[] pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }    
}
