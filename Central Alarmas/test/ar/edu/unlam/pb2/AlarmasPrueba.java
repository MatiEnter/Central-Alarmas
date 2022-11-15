package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlarmasPrueba {

	Usuario userA = new Activador(40512642, "Nico");
	Central central = new Central();
	Alarma alarma = new Alarma(1, "123", "321", "Alarma CR7");
	Sensor sensor = new Sensor(123, Boolean.FALSE);

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Usuario admin = new Administrador(40512640, "Matias");
		Central central = new Central();
		Alarma alarma = new Alarma(1, "123", "321", "Alarma CR7");
		((Administrador) admin).agregarAlarma(alarma, central);

		assertTrue(central.getAlarmasEnLaCentral().contains(alarma));
	}

	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Usuario admin = new Administrador(40512640, "Matias");

		Integer idAlarma = 1;
		String codigoActivacionAlarma = "123";
		String codigoConfiguracionAlarma = "321";
		String nombreAlarma = "CR7";
		Alarma alarma = new Alarma(idAlarma, codigoActivacionAlarma, codigoConfiguracionAlarma, nombreAlarma);
		Integer idConfigurador = 40512641;
		String nombreUserC = "Juan";
		Usuario userC = new Configurador(idConfigurador, nombreUserC);

		((Administrador) admin).agregarUsuarioAUnaAlarma(idConfigurador, idAlarma, codigoConfiguracionAlarma);

		assertTrue(alarma.getUsuariosValidados().contains(userC));
	}

	@Test(expected = CodigoAlarmaIncorrectoException.class)
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoException()
			throws CodigoAlarmaIncorrectoException {

		Usuario admin = new Administrador(40512640, "Matias");
		Central central = new Central();

		Integer idConfigurador = 40512641;
		String nombreUserC = "Juan";
		Usuario userC = new Configurador(idConfigurador, nombreUserC);

		Integer idAlarma = 1;
		String codigoActivacionAlarma = "123";
		String codigoConfiguracionAlarma = "321";
		String nombreAlarma = "Alarma CR7";
		Alarma alarma = new Alarma(idAlarma, codigoActivacionAlarma, codigoConfiguracionAlarma, nombreAlarma);

		((Administrador) admin).agregarAlarma(alarma, central);
		((Administrador) admin).agregarUsuario(userC, central);
		((Administrador) admin).agregarUsuarioAUnaAlarma(idConfigurador, idAlarma, codigoConfiguracionAlarma);
	}

	@Test(expected = SensorDuplicadoException.class)
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoException()
			throws SensorDuplicadoException {

		Usuario admin = new Administrador(40512640, "Matias");
		Central central = new Central();

		Integer idConfigurador = 40512641;
		String nombreUserC = "Juan";
		Usuario userC = new Configurador(idConfigurador, nombreUserC);

		Integer idAlarma = 1;
		String codigoActivacionAlarma = "123";
		String codigoConfiguracionAlarma = "321";
		String nombreAlarma = "Alarma CR7";
		Alarma alarma = new Alarma(idAlarma, codigoActivacionAlarma, codigoConfiguracionAlarma, nombreAlarma);

		Integer idSensor1 = 123;
		Boolean estado1 = Boolean.TRUE;
		Sensor sensor1 = new Sensor(idSensor1, estado1);

		Boolean estado2 = Boolean.TRUE;
		Sensor sensor2 = new Sensor(idSensor1, estado2);

		((Administrador) admin).agregarAlarma(alarma, central);
		((Administrador) admin).agregarUsuario(userC, central);
		((Administrador) admin).agregarUsuarioAUnaAlarma(idConfigurador, idAlarma, codigoConfiguracionAlarma);
		((Administrador) admin).agregarSensorAAlarma(idAlarma, codigoConfiguracionAlarma, sensor1, idConfigurador);
		((Administrador) admin).agregarSensorAAlarma(idAlarma, codigoConfiguracionAlarma, sensor2, idConfigurador);

	}

	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {
		Integer idAlarma = 1;
		String codigoActivacionAlarma = "123";
		String codigoConfiguracionAlarma = "321";
		String nombreAlarma = "Alarma CR7";
		Alarma alarma = new Alarma(idAlarma, codigoActivacionAlarma, codigoConfiguracionAlarma, nombreAlarma);
		
		Usuario userA = new Activador(40512642, "Nico");
		
		Integer idSensor1 = 111;
		Boolean estado1 = Boolean.TRUE;
		Sensor sensor1 = new Sensor(idSensor1, estado1);
		
		Integer idSensor2 = 222;
		Boolean estado2 = Boolean.FALSE;
		Sensor sensor2 = new Sensor(idSensor2, estado2);
		
		Integer idSensor3 = 333;
		Boolean estado3 = Boolean.TRUE;
		Sensor sensor3 = new Sensor(idSensor3, estado3);
		
		Integer idConfigurador = 40512641;
		String nombreUserC = "Juan";
		Usuario userC = new Configurador(idConfigurador, nombreUserC);
		
		Usuario admin = new Administrador(40512640, "Matias");
		
		((Administrador) admin).agregarUsuarioAUnaAlarma(idConfigurador, idAlarma, codigoConfiguracionAlarma);
		((Administrador) admin).agregarSensorAAlarma(idAlarma, codigoConfiguracionAlarma, sensor1, idConfigurador);
		((Administrador) admin).agregarSensorAAlarma(idAlarma, codigoConfiguracionAlarma, sensor2, idConfigurador);
		((Administrador) admin).agregarSensorAAlarma(idAlarma, codigoConfiguracionAlarma, sensor3, idConfigurador);
		
		assertFalse(((Activador)userA).activarDesactivarAlarma(idAlarma, codigoActivacionAlarma, (Configurador)userC));
		
	}

}
