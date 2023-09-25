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
        System.out.println(antal_siffror);

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
            i =+ 1;
        }
        System.out.println("svar= "+svar);

        //int summa = array1+array2;
    }
}
