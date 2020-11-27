import java.io.*;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String direccion_archivo = "\"C:\\Users\\solen\\OneDrive\\Escritorio\\bandas-inscriptas.csv\"";
		
		String fila = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(direccion_archivo));
			
			while((fila = br.readLine()) != null) {
				String datos[] = fila.split(";");
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
