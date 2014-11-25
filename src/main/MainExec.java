package main;

import java.io.File;

import gui.TestSelection;
import testes.*;
import utilidades.*;

/**
 * Classe principal responsável por gerenciar quais telas serão testadas, 
 * também possui métodos que fazem a chamada de classes.
 *@author Aristeu Azevedo
 */
public class MainExec {
	
	static ResultExec resultado = new ResultExec("");
	static TestsParameters testParam = new TestsParameters();
	static System_Smoke_Test SystemTest ;
	static Security_Smoke_Test SecurityTest ;
	static Checkup_Smoke_Test CheckupTest ;
	static Support_Smoke_Test SupportTest ;
	static ListaResult lista;
	static Settings_Tests settings;
		
	public static void main(String[] args) {
				
	
		

		TestSelection window = new TestSelection();
			
		//chama a tela de seleção de idiomas
		window.setVisible(true);
		//verifica se a tela de seleção ainda está ativa
		while (window.isShowing() == true) {
			testParam = window.testParam;
		}
		
		testParam.setData(Utilidades.horaData());
		
		//objeto que carrega as informações da execução
		lista = new ListaResult(testParam.getMachineName(), testParam.getData(), testParam.getShortIdioma());
		lista.setNomeMaquina(testParam.getMachineName());				
		lista.addResultado(initializeLSC(testParam.getShortIdioma()));
		
		
		settings = new Settings_Tests(testParam.getShortIdioma());
		
		selectSmokeTests();
		
		//testes de settings
		for (ResultExec result : settings.Select_allchecks()) {
			lista.addResultado(result);
		}
		
		Utilidades.grava(lista);
		
		
		
	}
	
	/**
	 * Chama o bat do LSC com a sigla do idioma previamente selecionado
	 */
	public static ResultExec initializeLSC(String idioma){
			
		try {
			resultado = new ResultExec("LSC initialization");							
			java.awt.Desktop.getDesktop().open(new File("Linguagens/"+idioma+".bat"));
			resultado.addMensagens("Passed");
		}catch (Exception e) {
			e.printStackTrace();
			resultado.addMensagens(e.toString());
		}
			return resultado;
			
		}	

	/**
	 * Método para chamada de testes de acordo com os valores 
	 * setados na tela "testsSelection"
	 */
	public static void selectSmokeTests()
	{
		if (testParam.isSystemSmoke()) {
			System_Smoke_Test SystemTest = new System_Smoke_Test(
					testParam.getShortIdioma());
			for (ResultExec result : SystemTest.Smoke()) {
				lista.addResultado(result);
			}
		}
		
		if (testParam.isSecuritySmoke()) {
			Security_Smoke_Test SecurityTest = new Security_Smoke_Test(
					testParam.getShortIdioma());
			for (ResultExec result : SecurityTest.Smoke()) {
				lista.addResultado(result);
			}
		}
		
		
		if (testParam.isCheckupSmoke()) {
			Checkup_Smoke_Test CheckupTest = new Checkup_Smoke_Test(
					testParam.getShortIdioma());
			for (ResultExec result : CheckupTest.Smoke()) {
				lista.addResultado(result);
			}
		}
		
		
		if (testParam.supportSmoke) {
			Support_Smoke_Test SupportTest = new Support_Smoke_Test(
					testParam.getShortIdioma());
			for (ResultExec result : SupportTest.Smoke()) {
				lista.addResultado(result);
			}
		}
		
	}
	
	
}
