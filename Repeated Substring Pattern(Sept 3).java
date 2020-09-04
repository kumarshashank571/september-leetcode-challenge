class Solution {
    public boolean repeatedSubstringPattern(String str) {
        for(int len=str.length()/2;len>0;len--){
            if(str.length()%len==0){
                String pattern = str.substring(0,len);
                int i=len;
                int j = len+i-1;
                while(j<str.length()){
                    String substring = str.substring(i,j+1);
                    if(pattern.equals(substring)==false){
                        break;
                    }
                    i += len;
                    j += len;
                }
                if(i==str.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
