package ar.edu.unlam.pb2;

import java.util.*;

public class Accion {

	private Integer idAccion;
	private Alarma alarmaSobreLaQueSeRealizaLaAccion;
	private Usuario userQueRealizaLaAccion;
	private Date fecha;
	private TipoDeOp tipo;

	private Integer contadorID= 0;
	
	public Accion(Alarma alarmaSobreLaQueSeRealizaLaAccion, Usuario userQueRealizaLaAccion,
			Date fecha, TipoDeOp tipo) {
		super();
		this.setIdAccion(++contadorID);
		this.alarmaSobreLaQueSeRealizaLaAccion = alarmaSobreLaQueSeRealizaLaAccion;
		this.userQueRealizaLaAccion = userQueRealizaLaAccion;
		this.fecha = fecha;
		this.tipo = tipo;

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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public TipoDeOp getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeOp tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAccion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accion other = (Accion) obj;
		return Objects.equals(idAccion, other.idAccion);
	}
	
	
}
