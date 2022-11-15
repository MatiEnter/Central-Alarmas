package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Alarma {

	private Integer idAlarma;
	private String codigoActivacionAlarma;
	private String codigoConfiguracionAlarma;
	private String nombreAlarma;
	Set<Usuario> usuariosValidados;
	Set<Accion> accionesRealizadas;
	
	public Alarma(Integer idAlarma, String codigoActivacionAlarma, String codigoConfiguracionAlarma,
			String nombreAlarma) {
		super();
		this.idAlarma = idAlarma;
		this.codigoActivacionAlarma = codigoActivacionAlarma;
		this.codigoConfiguracionAlarma = codigoConfiguracionAlarma;
		this.nombreAlarma = nombreAlarma;
		this.usuariosValidados  = new HashSet<>();
		this.accionesRealizadas  = new HashSet<>();
	}

	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public String getCodigoActivacionAlarma() {
		return codigoActivacionAlarma;
	}

	public void setCodigoActivacionAlarma(String codigoActivacionAlarma) {
		this.codigoActivacionAlarma = codigoActivacionAlarma;
	}

	public String getCodigoConfiguracionAlarma() {
		return codigoConfiguracionAlarma;
	}

	public void setCodigoConfiguracionAlarma(String codigoConfiguracionAlarma) {
		this.codigoConfiguracionAlarma = codigoConfiguracionAlarma;
	}

	public String getNombreAlarma() {
		return nombreAlarma;
	}

	public void setNombreAlarma(String nombreAlarma) {
		this.nombreAlarma = nombreAlarma;
	}

	public Set<Usuario> getUsuariosValidados() {
		return usuariosValidados;
	}

	public void setUsuariosValidados(Set<Usuario> usuariosValidados) {
		this.usuariosValidados = usuariosValidados;
	}

	public Set<Accion> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(Set<Accion> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlarma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alarma other = (Alarma) obj;
		return Objects.equals(idAlarma, other.idAlarma);
	}
	
	
	
}
