package Data_Structures;

class Test_Stack
{
    public static void main()
    {
        Stack stack = new Stack(12);
        stack.push(10);
        stack.push(3);
        stack.push(13);
        stack.push(6);
        stack.push(14);
        stack.push(89);
        stack.push(65);
        stack.push(43);
        stack.push(165);
        stack.push(334);
        //stack.sort();
        stack.reduce();
        stack.increase(12);
        System.out.println(stack.search(334));
        System.out.println(stack);
    }
}