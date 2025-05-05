package Cofrinho;

public class Euro extends Moeda {

 public Euro(double valor) {
     super(valor);
 }

 @Override
 public void info() {
     System.out.println("Euro - Valor: " + valor);
 }

 @Override
 public double converter() {
     return valor * 6.20;
 }
}
