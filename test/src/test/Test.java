package test;

class StringReverse	{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name = "Hello World";
        for(int i = name.length()-1;i>=0;i--) {
            //System.out.println("Length of the string is"+ i);
            char name2 = name.charAt(i);
            System.out.print( name.charAt(i));

        }
        //System.out.println(name.charAt(i));


    }
}
