public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("LOWADVISORY");
            } else if(i % 3 == 0){
                System.out.println("LOW");
            } else if(i % 5 == 0){
                System.out.println("ADVISORY");
            } else {
                System.out.println(i);
            }

        }
    }
}
