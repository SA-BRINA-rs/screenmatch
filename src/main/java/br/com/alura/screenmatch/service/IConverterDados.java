package br.com.alura.screenmatch.service;

public interface IConverterDados {

    //metodo obter dados passando como parametro uma String json, e retornando um class(String json , class<T>)
   <T> T obterDados(String json,Class<T> classe);
}
