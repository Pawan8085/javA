public class CipherString {
    
    /* Question : You are given a string of size N. You have to convert the string into its cipher form.For example, the cipher form of a string "aabccd”, will be "a2b1c2d1".The new generated string contains the characters, and the count of their occurrences in a consecutive manner. */

    public static void main(String[] args) {
        
            String str="aabcc";
            String ans="";
            int count=1;
            for(int j=0;j<str.length()-1;++j){
                String temp=str.charAt(j)+"";
                if(temp.equals(str.charAt(j+1)+"")){
                    count++;
                }
                else{
                    ans+=temp+""+count;
                    count=1;
                    
                }
                
            }
            ans+=str.charAt(str.length()-1)+""+count;
            System.out.println(ans);
    }
}
