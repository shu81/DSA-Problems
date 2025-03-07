





public class Array1{

    public static String reverstring(String  str){
        char chararr [] = str.toCharArray();
        int start = 0;
        int end  = str.length()-1;

        while (start<end){
            char temp = chararr [start];
            chararr[start]= chararr[end];
            chararr[end] = temp;
            start++;
            end--;
        }

         return new String(chararr);
    }
    public static void main (String args[]){
        String oldstring  ="madam";
       String newsString= Array1.reverstring(oldstring);
       
       if(oldstring.equals(newsString)){
        System.out.println("given string is paliderome");
       }
       else{
        System.out.println("given string not paliderome");
       }
        
      
    }
}