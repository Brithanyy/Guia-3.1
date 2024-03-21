public class EmpleadoPorHoras extends Empleado{
    int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public int calcularPago(int horas,int comision) {
        int salario = horas * 1200;
        return salario;
    }
    public EmpleadoPorHoras cargarEmpleado(EmpleadoPorHoras empleado1,int horas, String nombre){
        empleado1.horasTrabajadas = horas;
        empleado1.setNombre(nombre);

        return  empleado1;
    }

}
