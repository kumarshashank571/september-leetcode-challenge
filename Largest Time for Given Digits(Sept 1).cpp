class Solution {
public:
    string largestTimeFromDigits(vector<int>& arr) {
        string result;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
        if(i==j || j==k || i==k){continue;}
                    string hh = to_string(arr[i])+to_string(arr[j]);
                    string mm = to_string(arr[k])+to_string(arr[6-i-j-k]);
                    string time = hh +":" + mm;
         if(hh<"24" && mm<"60" && time>result){result = time;}           
                }
            }
        }
        return result;
        }
};
