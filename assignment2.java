//string reversal using builtin function

class reversestringbuiltin{
    public static void main(String[] arg){
        String orignal= "hello world";
        StringBuilder sb= new StringBuilder(orignal);
        sb.reverse();
        System.out.println("Reversed string = " + sb);
    }
}

class reversestringmanual{
    public static void main(String[] args){
        String str= "hello";
        String rev= "";

        for(int i= str.length()-1; i>=0; i--){
            rev= rev+ str.charAt(i);
        }
        System.out.println("reversed string="+ rev);
    }
}