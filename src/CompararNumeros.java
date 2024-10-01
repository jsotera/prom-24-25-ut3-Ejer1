public class CompararNumeros {

    public int numero1;
    public int numero2;

    public CompararNumeros(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void comparar(){
        if(this.numero1 > this.numero2){
            System.out.println("El primer numero es mayor.");
        }
        else if (this.numero1 < this.numero2) {
            System.out.println("El segundo numero es mayor.");
        }
        // Aqui en vez del else podiamos haber hecho un this.numero1 == this.numero2
        else {
            System.out.println("Los dos numeros son iguales.");
        }
    }

}
