import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import  java.util.List;
public class Main extends ArrayList{
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  // 1. إنشاء قسم
 // Department dept = new Department(89, "تكنولوجيا المعلومات");

  // 2. إنشاء موظف مع ربطه بالقسم
 // Employee emp = new Employee(77, "أحمد", "A123", 88, dept);

  // 3. طباعة البيانات
//  System.out.println(emp.toString());
//Car1 mycar=new Car1(66);
 //Car1 gg=new Car1(90);
  //mycar.showwspeed();
//  System.out.println(mycar);
 // System.out.println(gg);
//System.out.println(mycar.Nameassition);
//mycar.display(9);
ArrayList<Integer> list=new ArrayList<>();
 list.add(99);
  list.add(55);
  list.add(4444);
  list.add(0,78);
//System.out.println(list);
list.add(list.size(),50);
ArrayList<Integer> o2=new ArrayList<>();
o2.add(0);
o2.add(99);
o2.add(89);
o2.remove((Integer)0);
o2.remove(1);
o2.addAll(1,Arrays.asList(20,30));

ArrayList<Integer>l3=new ArrayList();

l3=o2;
l3.add(890);

//  for (int i =0;i<o2.size();i++){
  // System.out.println(o2.get(i));
//  }

ArrayList m22=new ArrayList(Arrays.asList(22,"yyy",'y',22,22));
m22.removeAll(Arrays.asList(22));
//System.out.println(m2);

Main a=new Main();
a.add(2);
a.add(33);
a.add(77);
a.add(88);
a.add("ghj");
a.removeRange(0,3);
//System.out.println(a);

Object[]q222=new Object[3];
q222[0]="gg";
q222[1]=99;
//for (Object eee:q222)
   // System.out.println(eee);
  ArrayList m222=new ArrayList(Arrays.asList(22,99,90,22,22,1));
//Collections.reverse(m222);
//Collections.sort(m222,Collections.reverseOrder());
//System.out.println(m222);
  //Collections.sort(m222);
 // m222.forEach(t1->System.out.print(t1+"-"));
 //System.out.println (m222.isEmpty());
//  System.out.println(m222.contains(3));
//System.out.println(m222.subList(0,3));
 // m222.clear();
 //Collections.reverse(m222);
  //System.out.println(m222);
//System.out.println(Collections.min(m222));
//  System.out.println(Collections.max(m222));













































 }
}