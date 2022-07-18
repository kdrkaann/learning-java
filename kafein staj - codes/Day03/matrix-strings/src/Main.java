import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int mat[][] = new int[rows][cols];

        int num = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = num;
                num++;
            }
        }
        System.out.println(Arrays.deepToString(mat));

        System.out.println("---------------------");

        String str = "Cristiano Ronaldo";
        System.out.println(str);
        System.out.println(str.charAt(3));

        System.out.println("-------");

        str = str.concat(" Portugal");
        System.out.println(str);

        System.out.println("-------");

        System.out.println(str.startsWith("C"));
        System.out.println(str.endsWith("a"));

        System.out.println("-------");

        char c[] = new char[6];
        str.getChars(0,6, c, 0);
        System.out.println(c);

        System.out.println("-------");

        System.out.println(str.indexOf("i"));
        System.out.println(str.lastIndexOf(("i")));

        System.out.println("-------");

        System.out.println(str.replace("Portugal", "7"));
        System.out.println(str.replaceAll(" ", "-"));

        System.out.println("-------");
        System.out.println(str.substring(0,6));
        String sub1 = str.substring(6);
        System.out.println(sub1);
        System.out.println(sub1.trim());
        String sub2 = str.substring(15, 22);
        System.out.println(sub2);

        System.out.println("-------");

        for(String n : str.split(" ")){
            System.out.println(n);
        }

        System.out.println("-------");

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}