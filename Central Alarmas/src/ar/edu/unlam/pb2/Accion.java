package ar.edu.unlam.pb2;

import java.util.*;

public class Accion {

	private Integer idAccion;
	private Alarma alarmaSobreLaQueSeRealizaLaAccion;
	private Usuario userQueRealizaLaAccion;
	private String fecha;
	private TipoDeOp tipo;
	Set<Sensor> sensores;
	public Accion(Integer idAccion, Alarma alarmaSobreLaQueSeRealizaLaAccion, Usuario userQueRealizaLaAccion,
			String fecha, TipoDeOp tipo) {
		super();
		this.idAccion = idAccion;
		this.alarmaSobreLaQueSeRealizaLaAccion = alarmaSobreLaQueSeRealizaLaAccion;
		this.userQueRealizaLaAccion = userQueRealizaLaAccion;
		this.fecha = fecha;
		this.tipo = tipo;
		this.sensores = new HashSet<>();
	}
	public Integer getIdAccion() {
		return idAccion;
	}
	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}
	public Alarma getAlarmaSobreLaQueSeRealizaLaAccion() {
		return alarmaSobreLaQueSeRealizaLaAccion;
	}
	public void setAlarmaSobreLaQueSeRealizaLaAccion(Alarma alarmaSobreLaQueSeRealizaLaAccion) {
		this.alarmaSobreLaQueSeRealizaLaAccion = alarmaSobreLaQueSeRealizaLaAccion;
	}
	public Usuario getUserQueRealizaLaAccion() {
		return userQueRealizaLaAccion;
	}
	public void setUserQueRealizaLaAccion(Usuario userQueRealizaLaAccion) {
		this.userQueRealizaLaAccion = userQueRealizaLaAccion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public TipoDeOp getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeOp tipo) {
		this.tipo = tipo;
	}
	public Set<Sensor> getSensores() {
		return sensores;
	}
	public void setSensores(Set<Sensor> sensores) {
		this.sensores = sensores;
	}
	
}
