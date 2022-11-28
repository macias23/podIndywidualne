public class DozwoloneLitery {
    public static int liczDozowolneWyrazy(String dozwolone, String[] doSprawdzenia){
        int liczDozwoloneWyrazy=0;
        char [] dozwoloneZnaki= dozwolone.toCharArray();
        for (String sprawdzanyWyraz: doSprawdzenia)
        {
            for (int i = 0; i < dozwoloneZnaki.length; i++)
            { String dozwolonyznakString= ""+dozwoloneZnaki[i];
                sprawdzanyWyraz=sprawdzanyWyraz.replaceAll(dozwolonyznakString,"");
            }
            if (sprawdzanyWyraz.equals("")) liczDozwoloneWyrazy++;
        }
        return liczDozwoloneWyrazy;
        }

    public static void main(String[] args) {
        String allowed = "abc";
        String [] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(liczDozowolneWyrazy(allowed,words));
    }

    }
