package com.example.sistema_de_aluguel_de_carros.Models;

public interface IRealizavel {

	public abstract void realizarPedido();

	public abstract Pedido consultarPedido();

	public abstract void cancelarPedido();

}
