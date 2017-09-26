package com.theironyard;


        import javax.xml.ws.EndpointReference;
import java.util.*;
import java.util.stream.Collectors;

        public class Main {

            public static void main(String[] args) {
                List<Entry> entries = Entry.populate();
                printEntries(entries);
                printTuesdays(entries);
                countTueWedThur(entries);
                weekendList(entries);
                weekdaySet(entries);
                printDurationGreaterThan10(entries);
                findMaxDuration(entries);
                listGreaterThan50(entries);
            }


            public static void printEntries(List<Entry> entries) {
                System.out.println("For Loop:");
                for (Entry entry : entries) {
                    System.out.println(entry + ", ");
                }
                System.out.println("\nStream, forEach:");
                entries.stream().forEach(entry -> System.out.println(entry + ", "));
                System.out.println();
            }

            public static void printTuesdays(List<Entry> entries) {

                //Print out tuesday entries
                // write for loop
                System.out.println("For Loop:");
                for(Entry tuesday : entries) {
                    if (tuesday.getDay().equals(Day.TUESDAY)) {
                        System.out.println(tuesday + ",");
                    }
                }

                System.out.println("\nStream, filter, forEach:");
                entries
                        .stream()
                        .filter(tuesday -> tuesday.getDay().equals(Day.TUESDAY))
                        .forEach(entry -> System.out.println(entry + ","));
                // write stream
                System.out.println();
            }

            public static void countTueWedThur(List<Entry> entries) {
                //Count the number of Tuesday, Wednesday, and Thursday entries
                System.out.println("For Loop:");
                int count = 0;
                // write for loop
                System.out.println("Number of entries on Tuesday, Wednesday or Thursday: " + count);
                 for(Entry entry : entries) {
                     if (entry.getDay().equals(Day.TUESDAY) ||
                             entry.getDay().equals(Day.WEDNESDAY) ||
                             entry.getDay().equals(Day.THURSDAY)) {

                         count++;
                     }
                 }

                 System.out.println("Stream, filter, count: ");
                long count1 = entries
                // write stream
                        .stream()
                        .filter(e ->
                        e.getDay().equals(Day.TUESDAY) ||
                        e.getDay().equals(Day.WEDNESDAY) ||
                        e.getDay().equals(Day.THURSDAY))
                        .count();

                System.out.println("Number of entries on Tuesday, Wednesday or Thursday: " + count1);
                System.out.println();
            }

            public static void weekendList(List<Entry> entries) {
                //Create a list of weekend (Saturday and Sunday) entries
                System.out.println("For Loop:");
                List<Entry> weekends = new ArrayList<>();
                // write for loop
                for (Entry entry : entries) {
                    if (entry.getDay().equals(Day.SUNDAY) ||
                            entry.getDay().equals(Day.SATURDAY)) {
                        weekends.add(entry);
                    }
                }

                System.out.println("Stream, filter, collect:");
                weekends = entries.stream()
                        .filter(e -> e.getDay().equals(Day.SATURDAY) || e.getDay().equals(Day.SUNDAY))
                        .collect(Collectors.toList());
                System.out.println(weekends);
                System.out.println();
            }

            public static void weekdaySet(List<Entry> entries) {
                //Create a SET of weekday entries
                System.out.println("For Loop:");
                Set<String> weekdays = new HashSet<>();
                // write for loop

                for(Entry entry : entries) {
                    if(!(entry.getDay().equals(Day.SATURDAY) ||
                           entry.getDay().equals(Day.SUNDAY))) {
                } weekdays.add(entry.getDay().toString());
            }

                System.out.println(weekdays);
                System.out.println("Stream, filter, map, collect:");
                weekdays = entries
                        .stream()
                        .filter(e -> !(e.getDay().equals(Day.SATURDAY)))
                        .map(e -> e.getDay().toString())
                        .collect(Collectors.toSet());
                        // write stream
                System.out.println(weekdays);
                System.out.println();
            }

            public static void printDurationGreaterThan10(List<Entry> entries){
                System.out.println("For Loop:");
                // write for loop
                System.out.println("Stream, filter, forEach:");
                // write stream
                System.out.println();
            }

            public static void findMaxDuration(List<Entry> entries){
                System.out.println("For Loop:");
                int temp = 0;
                // write for loop
                System.out.println("The Max Duration is: " + temp);
                System.out.println("Stream, mapToInt, max, getAsInt:");
                temp = // write stream use mapToInt then max the getAsInt
                        System.out.println("The Max Duration is: " + temp);
                System.out.println();
            }

            public static void listGreaterThan50(List<Entry> entries){
                System.out.println("For Loop:");
                List<Entry> greaterThan50 = new ArrayList<>();
                // write for looop
                System.out.println(greaterThan50);
                System.out.println("Stream, filter, collect:");
                // write stream
                System.out.println(greaterThan50);
                System.out.println();
            }
        }

        // write your code here


