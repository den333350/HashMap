package org.project;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        int key = 162348;
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "ван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");


        System.out.println(passportsAndNames.containsKey(162348));
    }
}
