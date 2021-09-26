package com.example.sistema_de_aluguel_de_carros.Models;

public class Pedido implements IRealizavel, IAvaliavel {

	private int creditos;

	private Veiculo veiculo;

	public void modificarPedido() {

	}


	/**
	 * @see Models.IRealizavel#realizarPedido()
	 */
	public void realizarPedido() {

	}


	/**
	 * @see Models.IRealizavel#consultarPedido()
	 */
	public Pedido consultarPedido() {
		return null;
	}


	/**
	 * @see Models.IRealizavel#cancelarPedido()
	 */
	public void cancelarPedido() {

	}


	/**
	 * @see Models.IAvaliavel#avaliarPedido()
	 */
	public boolean avaliarPedido() {
		return false;
	}


	/**
	 * @see Models.IAvaliavel#concederCreditos()
	 * 
	 *  
	 */
	public void concederCreditos() {

	}

}
