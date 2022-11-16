package ar.edu.unlam.pb2;

import java.util.Date;

public class Administrador extends Usuario implements Configurable, Activable {

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
	public void agregarUsuarioAUnaAlarma(Usuario usuarioAAgregar, Alarma alarma, String codigoConfiguracionAlarma)
			throws CodigoAlarmaIncorrectoException {

		if (alarma.getCodigoConfiguracionAlarma().equals(codigoConfiguracionAlarma)) {
			alarma.getUsuariosValidados().add(usuarioAAgregar);
			Accion accion = new Accion(alarma, usuarioAAgregar, new Date(), TipoDeOp.CONFIGURACION);
			alarma.getAccionesRealizadas().add(accion);
		} else {
			throw new CodigoAlarmaIncorrectoException("El codigo ingresado es invalido");
		}

	}

	@Override
	public void agregarSensorAAlarma(Alarma alarma, Usuario usuario, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idSensorAAgregar) throws CodigoAlarmaIncorrectoException, SensorDuplicadoException {

		if (sensor.getIdSensor().equals(idSensorAAgregar)) {
			throw new SensorDuplicadoException("El sensor ya existe");
		} else if (alarma.getCodigoConfiguracionAlarma().equals(codigoConfiguracionAlarma) == false) {
			throw new CodigoAlarmaIncorrectoException("El codigo ingresado es invalido");
		}
		Accion accion = new Accion(alarma, usuario, new Date(), TipoDeOp.CONFIGURACION);
		alarma.getAccionesRealizadas().add(accion);
		alarma.getListaDeSensores().add(sensor);

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
