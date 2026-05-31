

public class MatchingParenthesis1 {
    
    public static void main(String args[]){
        LinkedStack bracketStack=new LinkedStack();
       
        String line ="(((a+b)c)d)e)f)g)h(((j+k)*l)/m";//this is the string to be used
        for (int index = 0; index < line.length()-1; index++) {//goes through every character in the string
            char chr=line.charAt(index);
            if(chr=='('){//if theres an open bracket it pushes the index to the top of the stack
                bracketStack.push(index);
            }
            else{
                if(chr==')'){
                    if(!bracketStack.isEmpty()){
                        bracketStack.pop();
                    }
                    else{
                        System.out.println("unmatched right parenthesis in position "+ index);
                }
            }
            
            
            
        }
    }
        while(!bracketStack.isEmpty()){
            System.out.println("unmatched left parenthesis in position " +bracketStack.head());
            bracketStack.pop();
        }
    }}
