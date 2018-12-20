package bitencoding;

public class BitEncoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bool = true;
        boolean previous = true;
        System.out.println("bool:                " + bool + "\nprevious:            " + previous);
        System.out.println("NRZ Encoding:        " + NRZ(bool));
        System.out.println("NRZI Encoding:       " + NRZI(previous, bool));
        System.out.println("Manchester Encoding: " + Manchester(bool)[0]+" "+Manchester(bool)[1]);
    }

    public static boolean NRZ(boolean bool) {
        return bool;
    }
    
    public static boolean NRZI(boolean previous, boolean bool) {
        return (previous && bool)||(!previous && !bool);
    }
    
    public static boolean[] Manchester(boolean bool) {
        return new boolean[]{bool, !bool};
    }
}
