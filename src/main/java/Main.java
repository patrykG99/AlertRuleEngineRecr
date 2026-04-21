public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i <= 20; i++){
            boolean matched = false;
            if(i % 3 == 0){
                stringBuilder.append("LOW");
                matched = true;
            }

            if(i % 5 == 0){
                stringBuilder.append("ADVISORY");
                matched = true;
            }
            if (!matched){
                stringBuilder.append(i);
            }
            stringBuilder.append("\n");

        }
        System.out.println(stringBuilder);
    }
}
