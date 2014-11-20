package fr.treeptik.fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestFichier {

	public static void main(String[] args) throws Exception {
		// lecture bufferdReader
		System.out.println("**********java <1.5");
		File file = new File("Fichier1.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}

		System.out.println("**********java =1.5");
		// lecture scanner

		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println("Ligne: " + sc.nextLine());
		}
		sc.close();

		bufferedReader.close();
		//
		System.out.println("**********java 1.7");
		Path path = FileSystems.getDefault().getPath("Fichier1.txt");
		List<String> allLines = Files.readAllLines(path);
		for (String string : allLines) {
			System.out.println(string);
		}
		System.out.println("*****************ecriture fichier****************");
		System.out.println("**********java <1.5");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("test1");
		bufferedWriter.newLine();
		bufferedWriter.write("test2");

		bufferedWriter.flush();
		bufferedWriter.close();
		System.out.println("********** Files java 1.7");
		String ligne1 = "toto";
		String ligne2 = "tata";
		String ligne3 = "titi";
		List<String> lignes = Arrays.asList(ligne1, ligne2, ligne3);
		Files.write(path, lignes, StandardOpenOption.APPEND);

	}

}
