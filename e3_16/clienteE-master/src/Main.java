public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Josue");
        cliente.setCorreo("josue@gmail.com");
        cliente.setEdad(22);
        cliente.setSaldo(150.50);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Correo: " + cliente.getCorreo());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Saldo: " + cliente.getSaldo());

        cliente.setEdad(-5);
        cliente.setSaldo(-100);

        System.out.println("Edad despues de validar: "
                + cliente.getEdad());

        System.out.println("Saldo despues de validar: "
                + cliente.getSaldo());
    }
}