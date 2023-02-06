public class Main

{
    public static void main(String[] args)
    {

        Test<Integer> i_Obj = new Test<Integer> (9);                                  // instance of Integer type
        System.out.println(i_Obj.getObject());


        Test<String> str_Obj = new Test<String>("This is string not integer");                                // instance of String type
        System.out.println(str_Obj.getObject());
    }
}
