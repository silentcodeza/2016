



public class MatchParenthesis2 {
    public static void main(String args[]){
    LinkedStack bracketStack=new LinkedStack();
        String line ="(((a+b)c)d)e)f)g)h(((j+k)*l)/m";//we use this string for the thing
        String secondLine="";
        for (int i = 0; i < line.length(); i++) {//creating a string with a space for every character in the other string
            secondLine=secondLine+" ";
        }
        for (int index = 0; index < line.length()-1; index++) {//going through every character in the string
            
            char chr=line.charAt(index);
            if(chr=='('){
                bracketStack.push(index);//if there is an open bracket the index is put on the stack
            }
            else{
                if(chr==')'){
                    if(!bracketStack.isEmpty()){
                        bracketStack.pop();//if there is a closed bracket then is pops the top index off the list
                    }
                    else{
                        String temp=secondLine.substring(0,index)+"<"+secondLine.substring(index+1);//if it's empty and there is a closed
                        //bracket it inserts a sign in the right place of the string of spaces
                        secondLine=temp;
                }
            }
        }
    }
        while(!bracketStack.isEmpty()){//this part inserts a sign for every left over closed bracket in the indexed position
             String temp=secondLine.substring(0,Integer.parseInt(bracketStack.head().toString()))+">"+secondLine.substring(Integer.parseInt(bracketStack.head().toString())+1);
             secondLine=temp;
            bracketStack.pop();
        }
        System.out.println(line);
        System.out.println(secondLine);
    }
}
