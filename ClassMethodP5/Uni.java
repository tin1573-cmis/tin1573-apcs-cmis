public class Uni {

    public static void main(String args[]) {

        String school1 = new String ( "ANU" ); 
        String school2 = new String ( "UIUC" ); 
        String school3 = new String ( "Auckland" ); 

        System.out.println(school2.compareTo( school1 ));
        System.out.println(school1.compareTo( school2 ));
        System.out.println(school2.compareTo( school3 ));
        System.out.println(school3.compareTo( school2 ));
        System.out.println(school1.compareTo( school3 ));       
        System.out.println(school3.compareTo( school1 ));
    }   
}
//1. it is telling us how far apart the beginning letters are from each other
//2.  if the first letters are the same then it will tell the difference of the proceeding
//  number that is different. and if one is capital and the other is lower case they will add 27 
//   add 6 to the difference.
