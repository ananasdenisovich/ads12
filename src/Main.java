public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1};
        System.out.println(findAv(array));
    }
    public static float findAv(int[] array){
        float x = 0;
        for(int i = 0; i < 4; i++){
            x += array[i];
        }
        x /= 4;
        return x;
    }
}
