public abstract class Empleado {
    private String nombre;
    final private int salario = 67200;
    ///LA HORA VALE 1200

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public abstract int calcularPago(int horas, int comision);

}


