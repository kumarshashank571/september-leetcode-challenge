class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] string = str.split(" ");
        if(pattern.length()!=string.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = string[i];
            if(map.containsKey(ch)){
                String oldcoress = map.get(ch);
                if(oldcoress.equals(word)==false){
                    return false;
                }
            }
            else{
                if(set.contains(word)){
                    return false;
                }
                map.put(ch,word);
                set.add(word);
            }
        }
        return true;
    }
}
