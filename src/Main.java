public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();

        tiendaMascotas.agrgarMascota("Max", 11, "Perro");
        tiendaMascotas.agrgarMascota("Lucas", 3, "Gato");
        tiendaMascotas.agrgarMascota("Pirlo", 7, "Loro");

        tiendaMascotas.venderMascota("Max");

        tiendaMascotas.mostrarTienda();
    }
}