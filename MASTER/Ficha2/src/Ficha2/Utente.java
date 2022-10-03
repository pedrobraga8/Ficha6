package Ficha2;

public class Utente 
{
	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	private float imc;
	public Utente(String nome, String genero, int idade, float altura, int peso) 
	{
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		imc = 0;
	}