package ar.edu.unlam.pb2;

public class Configurador extends Usuario implements Configurable{

	public Configurador(Integer dni, String nombre) {
		super(dni, nombre);

	}

	@Override
	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma,
			String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException {
	}

}
