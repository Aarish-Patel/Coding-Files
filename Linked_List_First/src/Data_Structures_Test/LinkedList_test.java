package Data_Structures_Test;

import Data_Structures.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Stack;

public class LinkedList_test {
    public static void main()
    {
        LinkedList linkedlist = new LinkedList<>();
        LinkedList LinkedList = new LinkedList<>();
        LinkedList<Byte> listByte = new LinkedList<>();
        LinkedList<Integer> listInt = new LinkedList<>();
        LinkedList<Long> listLong = new LinkedList<>();
        LinkedList<Float> listFloat = new LinkedList<>();
        LinkedList<Double> listDoub = new LinkedList<>();
        LinkedList<String> listStr = new LinkedList<>();
        LinkedList<Character> listChar = new LinkedList<>();
        LinkedList<Boolean> listBool = new LinkedList<>();

        List<Integer> list = new ArrayList<>();
        Object[] Object = {"Aarish", "", 1234, '*', 9l, 0.0f};
        Number[] Number = {12, 12351, 12l, 0.097f, 841.343};
        Byte[] Byte = {0, 1, 2, 127};
        Integer[] Int = {45, 6, 23, 54, 89};
        Long[] Long = {0l, 1l, 2l, 932424l};
        Float[] Float = {0.0f, 1.0f, 2.0f, 12353.12346578f};
        Double[] Double = {0.0, 1.0, 2.0, 3482341.13902832};
        String[] String = {"Hello", "Aarish", "How", "Are", "You"};
        Character[] Char = {'A', 'a', 'b', ' '};
        Boolean[] Boolean = {true, false, true, true};

        LinkedList.insert(Char);
        linkedlist.insert(String);
        listInt.insert(Int);
        listByte.insert(Byte);
        listLong.insert(Long);
        LinkedList[] lists = {LinkedList, listInt, listByte, listLong};
        linkedlist.combine(lists);
        System.out.println(linkedlist);
    }
}
