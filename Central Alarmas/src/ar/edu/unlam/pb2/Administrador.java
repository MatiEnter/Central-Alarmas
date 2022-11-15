package ar.edu.unlam.pb2;

public class Administrador extends Usuario {

	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	public void agregarAlarma(Alarma alarma, Central central) {
		central.alarmasEnLaCentral.add(alarma);
	}

	public void agregarUsuario(Usuario usuario, Central central) {
		central.usuariosEnSistema.add(usuario);
	}

	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma,
			String codigoConfiguracionAlarma) {

	}

	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador) {
		return false;
	}

	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma) {
		return false;
	}

	public boolean activarDesactivarAlarma(Integer idAlarma, String codigoActivacionAlarma, Configurador usuario) {
		return false;
	}

}
