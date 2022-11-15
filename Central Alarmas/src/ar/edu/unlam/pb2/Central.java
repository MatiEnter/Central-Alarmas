package ar.edu.unlam.pb2;

import java.util.*;

public class Central {

	Set<Alarma> alarmasEnLaCentral;
	Set<Usuario> usuariosEnSistema;

	public Central() {
		super();
		this.alarmasEnLaCentral = new HashSet<>();
		this.usuariosEnSistema = new HashSet<>();
	}

	public Set<Alarma> getAlarmasEnLaCentral() {
		return alarmasEnLaCentral;
	}

	public void setAlarmasEnLaCentral(Set<Alarma> alarmasEnLaCentral) {
		this.alarmasEnLaCentral = alarmasEnLaCentral;
	}

	public Set<Usuario> getUsuariosEnSistema() {
		return usuariosEnSistema;
	}

	public void setUsuariosEnSistema(Set<Usuario> usuariosEnSistema) {
		this.usuariosEnSistema = usuariosEnSistema;
	}
	
	public Boolean buscarAlarma(Integer idAlarma, String codigoConfiguracionAlarma) throws CodigoAlarmaIncorrectoException{
		
		for (Alarma alarma : alarmasEnLaCentral) {
			if(alarma.getIdAlarma().equals(idAlarma)) {
				if(alarma.getCodigoConfiguracionAlarma().equals(codigoConfiguracionAlarma)) {
					return true;
				}
				throw new CodigoAlarmaIncorrectoException("El codigo ingresado no es correcto");
			}
			
		}
		return false;
	}
	
	
	
}
