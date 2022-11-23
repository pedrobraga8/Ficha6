package org.example;

public class NumeroEx6 {

    public int media(int numero){
        {
            int conta = 0;
            int resultado = 0;
            int soma = 0;

            while (numero != 0) {
                resultado = numero % 10;
                numero/=10;
                soma+=resultado;
                conta++;
            }
            return soma / conta;
        }
    }
}
