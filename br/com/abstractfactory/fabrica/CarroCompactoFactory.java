package br.com.abstractfactory.fabrica;

public class CarroCompactoFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroCompacto();
    }
}