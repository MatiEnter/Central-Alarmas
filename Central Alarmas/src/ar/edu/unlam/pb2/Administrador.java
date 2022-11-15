package ar.edu.unlam.pb2;

public class Administrador extends Usuario implements Configurable, Activable{

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

	@Override
	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma,
			String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma,
			String codigoConfiguracionAlarma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activarDesactivarAlarma(Integer idAlarma, String codigoActivacionAlarma, Configurador usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
