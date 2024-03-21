public class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularPago(int horas, int comision) {
        return getSalario();
    }

    public EmpleadoTiempoCompleto cargarEmpleado(EmpleadoTiempoCompleto empleado, String nombre){
        empleado.setNombre(nombre);
        return empleado;
    }

}
