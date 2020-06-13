import java.util.Scanner;


public class startSortPicture {
    public static void main(String[] args){
        try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Bilddatei die Eingelesen werden soll (inkl. Pfad) :");
			String inputFile = reader.nextLine();
			System.out.println("Name der Ausgabedatei (inkl. Pfad) : ");
			String outputfile = reader.nextLine();

			SortPicture sn = new SortPicture(inputFile, outputfile);
			sn.execute();
		}
    }
}
