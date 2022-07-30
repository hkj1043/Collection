import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("javascript");
        System.out.println(list);   //[java, spring, javascript]
        list.remove(1);
        System.out.println(list);   //[java, javascript]
        System.out.println(list.size());    //2

        Iterator<String> it = list.iterator();
        String str = "";
        while(it.hasNext()){
            str = it.next();
            System.out.println(str);
        }

//        while(it.hasNext()){
//            str = it.next();
//            System.out.println(str);
//        }

        it = list.iterator();   //iterator는 1번만 사용가능하기 때문에 재할당해줘야 한다.
        while(it.hasNext()){
            str = it.next();
            System.out.println(str);
        }
        list.clear();   //리스트 초기화
    }
}
