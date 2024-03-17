package br.com.abstractfactory.fabrica;

public class CarroCompacto implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando carro compacto!!!");
    }
}