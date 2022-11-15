package ar.edu.unlam.pb2;

public interface Configurable {

	public void agregarUsuarioAlaListaDeUsuariosValidosDeUnaALarma(Integer dniUsuario, Integer idAlarma, String codigoActivacionAlarma) throws CodigoAlarmaIncorrectoException;
	
}
