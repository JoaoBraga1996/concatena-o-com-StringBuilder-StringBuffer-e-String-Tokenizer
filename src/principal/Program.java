package principal;

import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {

		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		StringBuffer sb = new StringBuffer();

		for (String letra : letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();

		System.out.println(alfabeto);

		alfabeto = new String(sb);
		System.out.println(alfabeto);

		System.out.println(sb.reverse());

		
		
		String doArquivo = "1;Antonio;30";

		StringTokenizer st = new StringTokenizer(doArquivo, ";");

		System.out.println(st.nextToken());

		/*
		   A diferença é que StringBuffer é thread-safe, ou seja, é sincronizada,
		   enquanto StringBuilder não é. Isso significa que, se você precisa de uma
		   operação segura em termos de threads, deve utilizar StringBuffer.
		   Casocontrário, a classe StringBuilder pode ser mais eficiente.
		*/

	}

}
