public class Main{
    public static void main(String[] args) {
       String sa="madam";
       String rev="";
       char k;

       for(int i=0; i<sa.length(); i++){
           k=sa.charAt(i);
           rev=k+rev;
       }
        System.out.println(rev);
    }
}