package dene1;

import java.util.*;

public class Main {

    public int blackjack(int a, int b) {

        if(a>21 && b>21){
            return 0;
        }
        else if(a>21 && b<21){
            return b;
        }
        else if(a<21 &&  b>21){
            return a;
        }else if(a<21 && b<21){
            if(a<b)
                return b;

        }return a;


    }



    public static void main(String[] args) {






        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
        Map<Integer, String> map = new TreeMap<>();

        map.put(1001, "musa");
        map.put(1002, "hakan");
        map.put(1003, "esra");
        System.out.println(map);

        Scanner scan= new Scanner(System.in);
        System.out.println("bir cumle yazin");
//        map.put(1003,scan.nextLine());
//        System.out.println(map);
         String cumle =scan.nextLine();
         for(int i=0; i<cumle.length();i++){
             char c=cumle.charAt(i);
             if(map.containsKey(c)){
                 map.replace(i,map.get(c)+1);
             }else{
                 map.put(i,"c");
             }
         }
        System.out.println(map);

        map.get(1003).contains("a");
        System.out.println(map.get(1003));

//        set1.add("musa");
//        set1.add("hakan");
//        set2.add("java");
//        set2.add("ac++");
//        set3.add("ramazan");
//        set3.add("ailan");
//
//        System.out.println(set2.contains("java"));
//        System.out.println(set1.isEmpty());


//
//        list.add("musa");
//        list.add("hakan");
//        list.add("emrah");
//
//        for(int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(String s:list){
//            System.out.println(s);
//        }

//        Sayisal sayisal1=new Sayisal("musa",34,45,33,21);
//        Sayisal sayisal2=new Sayisal("hakan",21,32,32,11);
//        EsitAgirlik ea1=new EsitAgirlik("tugce",34,12,23,11);
//        EsitAgirlik ea2=new EsitAgirlik("esra",23,43,55,61);
//        Sayisal birinci=bitinci(sayisal1,sayisal2);
//        System.out.println(birinci.puanHesapla());
//        EsitAgirlik birinci2=bitinci(ea1,ea2);
//        System.out.println(birinci2.puanHesapla());
//      //  System.out.println(birinci2.puanHesapla());
//        ismiNe(ea1,ea2);

//    }
//    public static <E extends Aday> E bitinci(E e1,E e2){
//
//    if(e1.puanHesapla()>e2.puanHesapla()){
//        return e1;
//    }else{
//        return e2;
//    }
//    }
//    public static <E extends Aday> void ismiNe(E e1,E e2){
//        System.out.println(bitinci(e1,e2).getIsim());
//
//    }
//
//    @Override
//    public String toString() {
//        return "Main{}";
//    }


    }
}
