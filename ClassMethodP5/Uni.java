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
//