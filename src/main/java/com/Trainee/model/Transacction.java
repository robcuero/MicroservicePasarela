package com.Trainee.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaccion")
public class Transacction {

	@Id
	private int id_transaccion;	
	private int id_banco;
	private int id_cliente;
	private int id_proveedor;
	private Double monto;
	private String estado;
	private String fecha_transaccion;
	private int diferimiento;
	public int getId_banco() {
		return id_banco;
	}
	
	
	public int getId_transaccion() {
		return id_transaccion;
	}


	public void setId_transaccion(int id_transaccion) {
		this.id_transaccion = id_transaccion;
	}


	public String getFecha_transaccion() {
		return fecha_transaccion;
	}


	public void setFecha_transaccion(String fecha_transaccion) {
		this.fecha_transaccion = fecha_transaccion;
	}


	public void setId_banco(int id_banco) {
		this.id_banco = id_banco;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getDiferimiento() {
		return diferimiento;
	}
	public void setDiferimiento(int diferimiento) {
		this.diferimiento = diferimiento;
	}
	public Transacction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transacction(int id_transaccion, int id_banco, int id_cliente, int id_proveedor, Double monto, String estado,
			String fecha_transaccion, int diferimiento) {
		super();
		this.id_transaccion = id_transaccion;
		this.id_banco = id_banco;
		this.id_cliente = id_cliente;
		this.id_proveedor = id_proveedor;
		this.monto = monto;
		this.estado = estado;
		this.fecha_transaccion = fecha_transaccion;
		this.diferimiento = diferimiento;
	}

	
	
}
