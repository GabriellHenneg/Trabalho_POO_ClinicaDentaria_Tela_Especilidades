package persistencia;

import java.util.ArrayList;
import negocio.Registro;

public class ControlaCadastro {
	
	private ArrayList<Registro> cadastro = new ArrayList<>();
	
	public boolean salvar (Registro r) {
		if (r != null) {
			cadastro.add(r);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Registro> retornartodos () {
		return cadastro;
	}
}
