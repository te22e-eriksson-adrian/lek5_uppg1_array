public class App {
    public static void main(String[] args) throws Exception {
        int[] array1 = new int[5];
        array1[0] = 8;
        array1[1] = 4;
        array1[2] = 6;
        array1[3] = 3;
        array1[4] = 9;

        System.out.println("Talen i fältet: "+array1[0]+", "+array1[1]+", "+array1[2]+", "+array1[3]+", "+array1[4]);
        double antal_siffror = array1.length;
        System.out.println(antal_siffror);
        double kvot = (array1[0]+array1[1]+array1[2]+array1[3]+array1[4])/antal_siffror;
        System.out.println(kvot);
    }
}
