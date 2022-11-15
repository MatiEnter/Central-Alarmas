package ar.edu.unlam.pb2;

public interface Configurable {

	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma, String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException;
	
	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma);
	
	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador);

	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma);
}
