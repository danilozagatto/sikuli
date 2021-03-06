package utilidades;

import java.util.ArrayList;
import java.util.List;

public class ListaResult {
	
	private String nomeMaquina;
	private String data;
	private String idioma;
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getMachineType() {
		return machineType;
	}


	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	private String machineType;
	
	/**
	 * Classe que armazena os "resultado" para posteriormente 
	 * montar o relatório.
	 * Entra em todos os icones disponíveis ()
	 * @author	Aristeu Azevedo
	 */
	public List<ResultExec> listaResultado = new ArrayList<ResultExec>();
	
	public ListaResult(String nomeMaquina, String data, String idioma) {
		super();
		this.nomeMaquina = nomeMaquina;
		this.data = data;
		this.setIdioma(idioma);
	}


	public void addResultado( ResultExec elemento)
	{
		listaResultado.add(elemento);				
	}

	public String getNomeMaquina() {
		return nomeMaquina;
	}

	public void setNomeMaquina(String nomeMaquina) {
		this.nomeMaquina = nomeMaquina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	

}
