import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
       EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("", 0);
       EmpleadoTiempoCompleto empleado2 = new EmpleadoTiempoCompleto("");
       EmpleadoContratista empleado3 = new EmpleadoContratista("",0,0);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = datos.nextLine();
        int datoEmpleado;
        System.out.println("Ingrese el tipo de empleado ");
        System.out.println("1. Empleado por horas");
        System.out.println("2. Empleado por tiempo completo");
        System.out.println("3. Empleado por Contratista");
        datoEmpleado = datos.nextInt();

        if(datoEmpleado == 1){
            int horasTrabajadas;
            System.out.println("Ingrese las horas trabajadas: ");
            horasTrabajadas = datos.nextInt();
            empleado1 = empleado1.cargarEmpleado(empleado1,horasTrabajadas,nombre);
            int sueldo = empleado1.calcularPago(horasTrabajadas,0);
            System.out.println("-----------------------------------------------------");
            System.out.println("Nombre: " + empleado1.getNombre());
            System.out.println("Horas Trabajadas: " + horasTrabajadas);
            System.out.println("Sueldo: " + sueldo);
            System.out.println("-----------------------------------------------------");
        } else if (datoEmpleado == 2) {
            empleado2 = empleado2.cargarEmpleado(empleado2, nombre);
            System.out.println("-----------------------------------------------------");
            System.out.println("Nombre: " + empleado2.getNombre());
            System.out.println("Sueldo: " + empleado2.getSalario());
            System.out.println("-----------------------------------------------------");
        } else if (datoEmpleado == 3) {
            int horas;
            System.out.println("Ingrese las horas trabajadas: ");
            horas = datos.nextInt();
            int comisiones;
            System.out.println("Ingrese el monto de sus comisiones: ");
            comisiones = datos.nextInt();
            empleado3 = empleado3.cargarEmpleado(empleado3, nombre,horas, comisiones);
            int sueldo = empleado3.calcularPago(horas,comisiones);
            System.out.println("-----------------------------------------------------");
            System.out.println("Nombre: " + empleado3.getNombre());
            System.out.println("Horas Trabajadas: " + horas);
            System.out.println("Comisiones: " + comisiones);
            System.out.println("Sueldo: " + sueldo);
            System.out.println("-----------------------------------------------------");
        }

    }
}