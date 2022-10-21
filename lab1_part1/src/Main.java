import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(5);
        list.add(4);

        System.out.println(length(list));
    }


    public static List<Object> singleton(Object o) {

        List<Object> list = new ArrayList<>();
        list.add(o);

        return list;
    }

    public static boolean nil(List<Object> list){
        int i = 0;
        for(Object o : list) i++;
        return i == 0;
    }

    public static List<Object> snoc(List<Object> list, Object o) {
        list.add(o);
        return list;
    }

    public static int length(List<Object> list){

        int i = 0;
        for(Object o : list) i++;

        return i;
    }
}
