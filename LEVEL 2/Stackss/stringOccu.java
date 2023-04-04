package Stackss;
public class stringOccu{
    public static void main(String[] args){
        String str="try don't try guy";
        String word="try";
        int count=0;
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(word.equals(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}

