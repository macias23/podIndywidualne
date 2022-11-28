import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DodawaniePodKreska {
    public static void dodawaniePisemne(int a, int b) {
        //konwersja na Stringbuilder
        StringBuilder aSb = new StringBuilder();
        StringBuilder bSb = new StringBuilder();
        aSb.append(a);
        bSb.append(b);
        //uzupełnienie zerami
        if (aSb.length() > bSb.length()) {
            int roznica = aSb.length() - bSb.length();
            for (int i = 0; i < roznica; i++) {
                bSb.insert(i, 0);
            }
        }
        if (bSb.length() > aSb.length()) {
            int roznica = bSb.length() - aSb.length();
            for (int i = 0; i < roznica; i++) {
                aSb.insert(i, 0);
            }
        }
        //dodanie Stringbuilderów
        ArrayList wynik= dodanie(aSb,bSb);
        //przygotowanie do wydruku
        Collections.reverse(wynik);
        String doWydruku = Arrays.toString(wynik.toArray());
        doWydruku = doWydruku.replace("[", "").replace(",",
                "").replace("]", "").replace(" ", "");
        //wyrównanie długości
        while(aSb.length()<doWydruku.length()){
            aSb.append(0);
        }
        while(bSb.length()<doWydruku.length()){
            bSb.append(0);
        }
        //usunięcie zer
        aSb.reverse();
        bSb.reverse();
        int i = 0;
        while (bSb.charAt(i) == '0') {
            bSb.setCharAt(i, ' ');
            i++;
        }
        i=0;
        while (aSb.charAt(i) == '0') {
            aSb.setCharAt(i, ' ');
            i++;
        }
        //wydruk
        System.out.println(bSb.toString());
        System.out.println(aSb.toString());
        System.out.println(doWydruku);

    }

    public static ArrayList dodanie(StringBuilder aSb, StringBuilder bSb) {
        aSb.reverse();
        bSb.reverse();
        ArrayList wynik=new ArrayList<>();
        int przeniesienie=0;
        for (int i = 0; i < aSb.length(); i++) {
            int liczbaA = Integer.parseInt(String.valueOf(aSb.charAt(i)));
            int liczbaB = Integer.parseInt(String.valueOf(bSb.charAt(i)));
            int cyfraWynik = liczbaB + liczbaA + przeniesienie;
            if (cyfraWynik >= 10) {
                przeniesienie = 1;
                cyfraWynik = cyfraWynik - 10;
            } else przeniesienie = 0;
            wynik.add(cyfraWynik);
        }
        if (przeniesienie != 0) wynik.add(przeniesienie);
        return  wynik;
    }

    public static void main(String[] args) {
        dodawaniePisemne(999,999);
    }
}