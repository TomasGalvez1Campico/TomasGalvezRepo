package bug;


	

	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class examen {
		public static void main(String[] args) throws IOException {
			byte datos;
			FileInputStream fis = new FileInputStream("moviles.est");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("hola");
		}
	}


