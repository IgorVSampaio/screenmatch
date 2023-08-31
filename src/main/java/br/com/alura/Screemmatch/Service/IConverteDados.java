package br.com.alura.Screemmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
