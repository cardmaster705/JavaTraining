package nuevo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Archivos {
		
		String texto="";
		String temp;
		public String leerArchivos(){
		
			JFileChooser buscador= new JFileChooser();
			buscador.showOpenDialog(buscador);
			try{
				String patch= buscador.getSelectedFile().getAbsolutePath();
				BufferedReader bf = new BufferedReader(new FileReader(patch));
				String temp="";
				String bfRead;
				while((bfRead= bf.readLine())!= null){
					temp=temp+bfRead+"\n";
					texto=temp;
				}
				}catch(Exception e){
			System.err.println("el archivo no ha sido encontrado");
		}
		
			return texto;
			}
}

	