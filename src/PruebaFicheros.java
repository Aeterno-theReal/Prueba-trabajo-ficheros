import java.util.Scanner;
import java.io.*;

public class PruebaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		boolean append=false;
		int opcion=-1, sobre=-1;
		String frase="";
		
		File f=new File("C:\\Users\\PSI\\Desktop\\FilesPrograms\\pruebaFicheros.txt");
		
		System.out.println("¿Desea abrir y leer un fichero o guardar datos en un fichero?.\n"
				+ " 1. - Leer fichero.\n"
				+ " 2. - Escribir fichero.");
		System.out.print("Introduzca opcion: ");
		opcion=teclado.nextInt();
		teclado.nextLine();
		
		switch(opcion)
		{
		case 1:


			break;
		case 2:
			if(f.exists())
			{
				System.out.println("El fichero ya existe, ¿desea sobreescribirlo o continuar escribiendo en el?");
				System.out.println(" 1. - Sobreescribir fichero.\n"
						+ " 2. - Continuar añadiendo en el fichero.\n");
				System.out.print("Introduzca opcion: ");
				sobre=teclado.nextInt();
				teclado.nextLine();
				
				if(sobre==2)
					append=true;
			}
			else
				System.out.println("El fichero no existe, se va a crear uno nuevo.");

			try {
				FileWriter fw = new FileWriter(f, append);
		
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				
				System.out.print("Introduzca la frase que desea escribir en el fichero: ");
				frase=teclado.nextLine();
				pw.println(frase);
				
				System.out.println("Correcto!, se ha guardado la frase introducida.\n");
				
				pw.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default: 
			System.out.println("error!");
		}
		
		

	}
}
