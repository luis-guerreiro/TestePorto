package PortoSeguro;

public abstract class Telefone {

	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	public Telefone(String tipo)
	{
		this.tipo = tipo; // this.tipo = "Telefone Fixo"
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void chamador(int chamaeu)
	{
		
	}
	
}
