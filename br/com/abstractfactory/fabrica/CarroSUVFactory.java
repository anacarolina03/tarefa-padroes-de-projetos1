package br.com.abstractfactory.fabrica;

public class CarroSUVFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroSUV();
    }
}