public class EmpleadoContratista extends Empleado{
    int horasTrabajadas;
    int comisionPorProyectos;

    public EmpleadoContratista(String nombre, int horasTrabajadas, int comisionPorProyectos) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.comisionPorProyectos = comisionPorProyectos;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getComisionPorProyectos() {
        return comisionPorProyectos;
    }

    public void setComisionPorProyectos(int comisionPorProyectos) {
        this.comisionPorProyectos = comisionPorProyectos;
    }

    @Override
    public int calcularPago(int horas, int comision) {
        int sueldo = (horas * 1200) + comision;
        return sueldo;
    }
    public EmpleadoContratista cargarEmpleado(EmpleadoContratista empleado, String nombre, int horas, int comisiones){
        empleado.setNombre(nombre);
        empleado.setHorasTrabajadas(horas);
        empleado.setComisionPorProyectos(comisiones);
        return empleado;
    }
}
