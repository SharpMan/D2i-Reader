package koh.d2i;

/**
 *
 * @author Neo-Craft
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reader a = new Reader("i18n_fr.d2i");
        a._aLang.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        System.out.println("*****************Langs Party*************************\n");

        int i = 1;
        while (a.getText(i) != null) {
            System.out.println(i+" "+a.getText(i));
            i++;
        }

    }

}
