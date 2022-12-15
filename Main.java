import  java.util.Random;
public class Main {
    public static void main(String[] args) {
       int[] dizi = new int[20];
       Random rand = new Random();

       for ( int i = 0; i < dizi.length; i++){
           dizi[i] = rand.nextInt(101);
       }
        System.out.println(java.util.Arrays.toString(dizi));
       System.out.println("-------------------------------------------------------------------------------");
       for( int i = 0; i < dizi.length; i++){
           for(int j = 1 ; j < dizi.length - i; j++){
               if(dizi[j - 1] > dizi[j]){
                   int a = dizi[j-1];
                   dizi[j-1] = dizi[j];
                   dizi[j] = a;
               }
           }
       }
        System.out.println(java.util.Arrays.toString(dizi));
    }
}