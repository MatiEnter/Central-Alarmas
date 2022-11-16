package ar.edu.unlam.pb2;

public interface Configurable {

	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma,
			String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException;

	public void agregarUsuarioAUnaAlarma(Usuario usuarioAAgregar, Alarma alarmas, String codigoConfiguracionAlarma)
			throws CodigoAlarmaIncorrectoException;

	public void agregarSensorAAlarma(Alarma alarma, Usuario usuario, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idSensorAAgregar) throws CodigoAlarmaIncorrectoException, SensorDuplicadoException;

	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma);
}
