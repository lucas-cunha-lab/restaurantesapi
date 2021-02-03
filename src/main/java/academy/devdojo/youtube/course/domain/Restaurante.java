package academy.devdojo.youtube.course.domain;

import javax.persistence.Entity;

@Entity
public class Restaurante {

	private String nomeRestaurante;
	private String tipoDeComida;
	private String prato;
	private String descricaoPrato;
	private String bebida;

	public Restaurante() {
		super();
	}

	public Restaurante(String nomeRestaurante, String tipoDeComida, String prato,
			String descricaoPrato, String bebida) {
		super();
		this.nomeRestaurante = nomeRestaurante;
		this.tipoDeComida = tipoDeComida;
		this.prato = prato;
		this.descricaoPrato = descricaoPrato;
		this.bebida = bebida;
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}

	public String getTipoDeComida() {
		return tipoDeComida;
	}

	public void setTipoDeComida(String tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}

	public String getprato() {
		return prato;
	}

	public void setItemsDoPedido(String prato) {
		this.prato = prato;
	}

	
	public String getDescricaoPrato() {
		return descricaoPrato;
	}

	public void setDescricaoPrato(String descricaoPrato) {
		this.descricaoPrato = descricaoPrato;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bebida == null) ? 0 : bebida.hashCode());
		result = prime * result + ((descricaoPrato == null) ? 0 : descricaoPrato.hashCode());
		result = prime * result + ((prato == null) ? 0 : prato.hashCode());
		result = prime * result + ((nomeRestaurante == null) ? 0 : nomeRestaurante.hashCode());
		result = prime * result + ((tipoDeComida == null) ? 0 : tipoDeComida.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		if (bebida == null) {
			if (other.bebida != null)
				return false;
		} else if (!bebida.equals(other.bebida))
			return false;
		if (descricaoPrato == null) {
			if (other.descricaoPrato != null)
				return false;
		} else if (!descricaoPrato.equals(other.descricaoPrato))
			return false;
		if (prato == null) {
			if (other.prato != null)
				return false;
		} else if (!prato.equals(other.prato))
			return false;
		if (nomeRestaurante == null) {
			if (other.nomeRestaurante != null)
				return false;
		} else if (!nomeRestaurante.equals(other.nomeRestaurante))
			return false;
		if (tipoDeComida == null) {
			if (other.tipoDeComida != null)
				return false;
		} else if (!tipoDeComida.equals(other.tipoDeComida))
			return false;		
		return true;
	}

}
