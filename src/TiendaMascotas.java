import javax.crypto.Mac;

public class TiendaMascotas{
    Mascota[] animales;
    int cantidadDeMascotas;

    public TiendaMascotas() {
        animales = new Mascota[100];
        cantidadDeMascotas = 0;
    }
    public void agrgarMascota(String nombre, int edad, String tipoAnimal){
        Mascota nuevaMascota = new Mascota(nombre, edad, tipoAnimal);
        animales[cantidadDeMascotas] = nuevaMascota;
        cantidadDeMascotas++;
        System.out.println("Se a añadido una nueva mascota con nombre: " + nombre);
    }

    public void venderMascota(String nombre){
        for(int i = 0; i < cantidadDeMascotas; i++){
            if(animales[i].getNombre().equals(nombre)){
                animales[i] = null;
                for (int j = i; j < cantidadDeMascotas; j++) {
                    animales[j] = animales[j + 1];
                }
                cantidadDeMascotas--;
                return;
            }
        }
    }

    public void mostrarTienda(){
        for(int i = 0; i < cantidadDeMascotas; i++){
            System.out.println("Mascota " + i + ": " + animales[i].getNombre() + ", " + animales[i].getEdad() + ", " + animales[i].getTipoAnimal());
        }
    }
}