/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class Java8 {

    public static void main(String[] args) {

//        Math.r
//        printSomeTing(Java8::doSomeThing, "AI");
//        System.out.println(x);
//        Consumer<String> consu = (name)->System.out.println("Hello"+ name);
//            
        
        ArrayList<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
        ids.add("5");
        ArrayList<Student> list= new ArrayList<>();
        list.add(new Student("ai", 18, "1"));
        list.add(new Student("diem", 18, "2"));
        list.add(new Student("thanh", 18, "4"));
        list.add(new Student("uyen", 18, "3"));
        list.add(new Student("nam", 18, "5"));
        ids.stream().map((stringId)-> {
            for(Student s:list){
                if(s.getId().equals(stringId)){
                    return  s;
                }
            }
            return null;
        }).forEach(s -> System.out.println(s));
//        ArrayList<Student> newArr = listToMap((id) -> {
//            for(Student s:list){
//                if(s.getId().equals(id)){
//                return  s;
//            }
//            }
//            return null;
//        },ids);
//        newArr.forEach(s->System.out.println(s));
//        BiPredicate<String, Integer> tester = (aString, aNum) -> {
//            return aString.length() == aNum;
//        };
//        Map<String, Integer> company = new HashMap<>();
//        company.put("Apple", 5);
//        company.put("microsoft", 7);
//        company.put("sun", 3);
//        company.put("oracle", 6);
//        company.put("chanel", 10);
//        company.put("dior", 7);
//        company.put("vien", 5);
//        company.entrySet()
//                .stream()
//                .filter((entry -> tester.test(entry.getKey(), entry.getValue())))
//                .forEach((entey) -> System.out.println(entey.getKey() + "---->" + entey.getValue()));
//        List<String> arr = Arrays.asList("mot", "hai", "ba", "bon", "tenid");
//        arr.stream().map((aString) -> aString.length()).forEach((i) -> System.out.println(i));
    }

    public static <T, R> ArrayList<R> listToMap(Function<T, R> mapper, ArrayList<T> list) {
        ArrayList<R> arr = new ArrayList<>();

        for (T t : list) {
            R r = mapper.apply(t);
            arr.add(r);
        }
        return arr;
    }
}

//        System.out.println(test((aString , aNum)->aString.length() == aNum));
//      1231
//    }
//    public static void printArray(List<Integer> list,Predicate<Integer> p) {
//        for (Integer i : list) {
//            if (p.test(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean test(BiPredicate<String, Integer> p) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("num");
//        int num = sc.nextInt();
//        return p.test(name, num);
//    }
//
//
//    public ArrayList<String> search(Predicate<String> p){
//        ArrayList<String> st = new ArrayList<>();
//        for(String a: cuslist){
//            if(p.test(t)){
//                st.add(e);
//            }
//        }
//        return  st;
//    }
//   
//    public static void doSomeThing(String name){
//        System.out.println("Hello World "+ name);
//    }
//    public  static <T> void printSomeTing(Consumer<T> t, T name){
//        t.accept(name);
//    }
//}
