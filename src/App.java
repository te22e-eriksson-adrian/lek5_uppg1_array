import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Skriva ut tal i Array
        int[] array1 = new int[5];
        array1[0] = 8;
        array1[1] = 4;
        array1[2] = 6;
        array1[3] = 3;
        array1[4] = 9;
        System.out.println("Talen i fältet: "+array1[0]+", "+array1[1]+", "+array1[2]+", "+array1[3]+", "+array1[4]);
        
        //Skriva antalet platser i Array
        double antal_siffror = array1.length;
        System.out.println("Antal element i arrayen: "+antal_siffror);

        //Skriva medelvärdet av lagrade Arrays
        double kvot = (array1[0]+array1[1]+array1[2]+array1[3]+array1[4])/antal_siffror;
        System.out.println(kvot);

        //Summan av array1 och array2
        int[] array2 = new int[5];
        array2[0] = 18;
        array2[1] = 14;
        array2[2] = 16;
        array2[3] = 13;
        array2[4] = 19;
        int i = 0;
        int svar=0;
        while (i < 5) {
            svar =svar+ array1[i] + array2[i];
            i += 1;
        }
        System.out.println("svar= "+svar);

        //Medelvärde av array1 och array2
        double antal_siffror_tillsammans = array1.length + array2.length;
        double kvot2 = (svar)/antal_siffror_tillsammans;
        System.out.println("Medelvärdet för antalet siffror: "+kvot2);

        //Suamman av varje fält i array 1 med varje i array2
        int[] summa_array = new int[5];
        summa_array[0] = array1[0] + array2[0];
        summa_array[1] = array1[1] + array2[1];
        summa_array[2] = array1[2] + array2[2];
        summa_array[3] = array1[3] + array2[3];
        summa_array[4] = array1[4] + array2[4];
        System.out.println("Summan av array1 och array2 för index 0 är: "+summa_array[0]);
        System.out.println("Summan av array1 och array2 för index 1 är: "+summa_array[1]);
        System.out.println("Summan av array1 och array2 för index 2 är: "+summa_array[2]);
        System.out.println("Summan av array1 och array2 för index 3 är: "+summa_array[3]);
        System.out.println("Summan av array1 och array2 för index 4 är: "+summa_array[4]);

       //Kod som tar in heltal från tangentbordet som sedan lagras i fält
        System.out.println("         ");
        Scanner tangentbord = new Scanner(System.in);
        int[] heltal_array = new int[4];
        System.out.println("Var så snäll och skriv 4 heltal nedan.");
        System.out.print("Skriv heltal 1 här: ");
        heltal_array[0] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 2 här: ");
        heltal_array[1] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 3 här: ");
        heltal_array[2] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv heltal 4 här: ");
        heltal_array[3] = tangentbord.nextInt();
        tangentbord.nextLine();
        int heltal_summa = heltal_array[0]+heltal_array[1]+heltal_array[2]+heltal_array[3];
        System.out.println("Summan av heltalen: "+heltal_summa);
        tangentbord.close();
    }
}