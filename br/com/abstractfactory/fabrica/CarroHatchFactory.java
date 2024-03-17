package br.com.abstractfactory.fabrica;

public class CarroHatchFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroHatch();
    }
}