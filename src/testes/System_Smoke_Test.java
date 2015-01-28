package testes;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.script.*;

import utilidades.LSC_Main;
import utilidades.LSC_System;
import utilidades.ResultExec;
import utilidades.Utilidades;


@SuppressWarnings("unused")
public class System_Smoke_Test {
	
	private List<ResultExec> listaResultados = new ArrayList<ResultExec>();
	ResultExec resultado = new ResultExec("Smoke Test System");
	String idioma = "";
	
	LSC_System sys;
	
	
	
	Screen s = new Screen();
			
	public System_Smoke_Test( String idioma){
		
		this.idioma = idioma;
		sys = new LSC_System(idioma);
	}
	
	public List<ResultExec> Smoke()
	{
			
		titleLSC();
		
		tabUnselected();
						
		VerificaTela(sys.icn_hardDrive);
				
		
		tabSelected();
		VerificaTela(sys.icn_memory);
			
		tabSelected();
		VerificaTela(sys.icn_backup);
			
		tabSelected();
		VerificaTela(sys.icn_softwareUpdate);
			
		tabSelected();
		VerificaTela(sys.icn_battery);
		
		tabSelected();
		VerificaTela(sys.icn_systemInfo);
			
		tabSelected();
		VerificaTela(sys.icn_filePrinter);
			
		return listaResultados;
	}
	
	
	//TODO Execução do teste para verificar se a tela é a correta
	public void VerificaTela(String icone)
	{
		
		
		try {
			s.click(sys.LSC_Title);
			resultado = new ResultExec(Utilidades.nomeIcone(icone));
			s.wait(icone,10.0);
			s.click(icone);
			
			//verifica se a tela é a correta
			if(icone == sys.icn_systemInfo )
			s.wait(sys.icn_save,40.0);
			
			else if(icone == sys.icn_filePrinter)
			s.wait(3.0);
			resultado.addMensagens("Sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado.addMensagens(e.toString());
		}
		listaResultados.add(resultado);
		
	}
	
	//TODO Verificação do Titulo do LSC
	public void titleLSC(){
		
			try {
				resultado = new ResultExec("LSC Title verification");		
				s.wait(sys.LSC_Title,30.0);
				s.click(sys.LSC_Title);
				resultado.addMensagens("Sucesso");
			} catch (FindFailed e) {
				e.printStackTrace();
				resultado.addMensagens(e.toString());
			}
			listaResultados.add(resultado);
	}
	
	//TODO Verifica a aba System não selecionada
	public void tabUnselected(){
				try {
					resultado = new ResultExec("Tab System Unselected");
					s.wait(2.0);
					s.click(sys.SystemUns);
					s.wait(2.0);
					resultado.addMensagens("Sucesso");
				} catch (FindFailed e) {
					resultado.addMensagens(e.toString());
					e.printStackTrace();
				}
				listaResultados.add(resultado);
	}
	
	//TODO Verifica a aba System selecionada
	public void tabSelected(){
		try {
			resultado = new ResultExec("Tab System Selected");
			s.wait(2.0);
			s.click(sys.SystemSel);
			s.wait(2.0);
			resultado.addMensagens("Sucesso");
		} catch (FindFailed e) {
			resultado.addMensagens(e.toString());
			e.printStackTrace();
		}
		listaResultados.add(resultado);
}
	

}
