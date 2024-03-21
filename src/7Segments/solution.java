import java.util.HashMap;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put(0, 6);
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 5);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 3);
        map.put(8, 7);
        map.put(9, 6);

        String entrada;
        int hores, minuts, temps, mA=15, res, d1, d2, d3, d4, franjes;
        while(true) {
            entrada = sc.nextLine();
            d1 = Integer.parseInt(entrada.substring(0, 1));
            d2 = Integer.parseInt(entrada.substring(1, 2));
            hores = d1*10+d2;
            d3 = Integer.parseInt(entrada.substring(3, 4));
            d4 = Integer.parseInt(entrada.substring(4, 5));
            minuts = d3*10+d2;
            temps = Integer.parseInt(entrada.substring(6, entrada.length()));
            if (hores == 99 && minuts == 99 && temps == 0) break;
            temps += 1;
            franjes = map.get(d1)+map.get(d2)+map.get(d3)+map.get(d4);
            res = franjes*mA*temps+10;
            System.out.println(res);
        }





    }

}
