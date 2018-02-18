import java.util.HashMap;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Helloworld");

        System.out.println("Dev Yohan");

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // HashMap 연습
        HashMap<String, Object> maps = new HashMap<String, Object>();

        maps.put("test", "Object");
    }
}
