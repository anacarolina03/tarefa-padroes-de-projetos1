package br.com.abstractfactory.fabrica;

public class CarroHatch implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando carro hatch!!!");
    }
}