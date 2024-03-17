package br.com.abstractfactory.fabrica;

public class CarroSUV implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando carro SUV!!!");
    }
}