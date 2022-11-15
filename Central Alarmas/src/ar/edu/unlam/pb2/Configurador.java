package ar.edu.unlam.pb2;

public class Configurador extends Usuario implements Configurable{

	public Configurador(Integer dni, String nombre) {
		super(dni, nombre);

	}

	@Override
	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma,
			String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException {
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

}
