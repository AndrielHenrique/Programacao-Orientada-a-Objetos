
package circle;

public class Circle {
    // private double radius;
    // private String color;
    public double radius;
    public String color;

    public static void main(String[] args) {

        // 1-Criar a classe Cirle e as instânias da mesma.
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("C1: \nRaio: " + c1.getRadius() + " \nCor: " + c1.getColor() + "\nArea: " + c1.getArea());
        Circle c2 = new Circle(2.0, "red");
        System.out.println("C2: \nRaio: " + c2.getRadius() + " \nCor: " + c2.getColor() + "\nArea: " + c2.getArea());
        Circle c3 = new Circle(1.0, "red");
        System.out.println("C3: \nRaio: " + c3.getRadius() + " \nCor: " + c3.getColor() + "\nArea: " + c3.getArea());

        // 2. Alterar a classe para poder modificar um círculo ja instanciado
        // R: criado os metodos "set" para isso, temos o metodo get e set, o get mostra
        // e
        // o set muda o valor
        c1.setRadius(1.0);
        c1.setColor("blue");
        System.out.println("C1: \nRaio: " + c1.getRadius() + " \nCor: " + c1.getColor() + "\nArea: " + c1.getArea());

        // 3. Para poder modificar é preciso mudar o estado, como ta privado, somente a
        // classe pode acessar, entao muda de private para public
        // Explicar: Não pode pois somente a classe tem acesso, já que é privado, ao
        // colocar privado o resto nao tem acesso, e colocando publico, qualquer lugar
        // pode ter acesso para modificar o valor do atributo da classe, o que nao é
        // recomendado por causa do encapsulamento, e por isso usamos get e set ao inves
        // disso
        c1.radius = 2.0;
        c1.color = "red";
        System.out.println("C1: \nRaio: " + c1.getRadius() + " \nCor: " + c1.getColor() + "\nArea: " + c1.getArea());

        // B - exercicios criar um vetor de circulo e um metodo na classe para mostrar o
        // vetor
        Circle[] vetorCircle = { c1, c2, c3 };
        imprimirVetorCirculos(vetorCircle);

        // Explicar 2: pq é possivel guardar os circulos em vetores e matrizes?
        // "ponteiros!!!" no java armazena a referencia para o objeto na memoria, e um
        // vetor é um conjunto de referencias que apontam para referencias das
        // instancias da classe. Ou seja: quando criamos uma classe nao é o objeto real,
        // e sim uma referencia apontando para o objeto, e o vetor contem uma lista de
        // referencias de endereços na memorai, cada um apontando para um objeto.
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double pi = 3.1415;
        return pi * radius * radius;
    }

    public static void imprimirVetorCirculos(Circle[] vetCirculos) {
        for (int i = 0; i < vetCirculos.length; i++) {
            System.out.println("Percorrendo o vetor de Circulo  " + (i + 1) + ": ");
            System.out.println("Raio: " + vetCirculos[i].getRadius());
            System.out.println("Cor: " + vetCirculos[i].getColor());
            System.out.println("Area: " + vetCirculos[i].getArea());
            System.out.println(" ");
        }
    }
}
