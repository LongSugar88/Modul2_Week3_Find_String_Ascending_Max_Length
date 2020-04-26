public class FindMax {
    static String find(String mystring){
        String result = "";
        String max = "";

        for(int i=0; i<mystring.length()-1; i++){
            result += mystring.charAt(i);
            result += mystring.charAt(i+1);
            for(int j=i+2; j< mystring.length(); j++){
                int length = result.length();
                if(mystring.charAt(j) > result.charAt(length-1)){
                    result+= (mystring.charAt(j));
                }
            }
            if( max.length() < result.length()){
                max = result;
                result = "";
            } else {
                result = "";
            }
        }

        System.out.println(max);
        return max;
    }

}
