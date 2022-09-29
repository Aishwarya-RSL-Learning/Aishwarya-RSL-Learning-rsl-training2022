
public class Question3 {
    public static void main(String[] args) {
        char []charArr = {'1','2','a','5','6','!','6','\n'};
        System.out.println(countOfLastChar(charArr));
    }
    public static int countOfLastChar(char[]charArr){
        //we don't know the last character unless we encounter ‘\n’ so first we have to find \n char before \n will be last char
        int length = charArr.length;
        char lastChar = '0';
        //if first char itself is \n means stream is empty so returning 0
        if(charArr[0]=='\n'){
            System.out.println("there is no any element in stream");
            return '0';
        }
        for(int i=0; i<length; i++){
            char ch = charArr[i];
            if(ch=='\n'){
                lastChar = charArr[i-1];
            }
        }
        int count = 0;
        for(int i=0; i<length; i++){
            if(charArr[i]==lastChar){
                count++;
            }
        }
        return count;
    }
}
