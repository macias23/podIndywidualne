import java.util.Arrays;

public class SortujWzrostem {
    public static String[] sortujWzrostem(int[] wzrost, String[] imiona){
        for (int i = 0; i < imiona.length ; i++) {
            for (int j = 0; j < imiona.length-1; j++) {
                if(wzrost[j]<wzrost[j+1]){
                    int tempWzrost=wzrost[j+1];
                    String tempImie=imiona[j+1];
                    wzrost[j+1]=wzrost[j];
                    imiona[j+1]=imiona[j];
                    imiona[j]=tempImie;
                    wzrost[j]=tempWzrost;
                }
            }
        }
        return imiona;
    }

    public static void main(String[] args) {
        String [] names = {"Andrzej","Maciek","Maciek","Rzepson"};
        int [] heights = {183,185,179,195};
        String[] posortowaneWzrostem= sortujWzrostem(heights,names);
        System.out.println(Arrays.toString(posortowaneWzrostem));
    }
}
