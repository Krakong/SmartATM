package com.linkcode;

public class Boxing {

        public static void main(String[] args) {
            int a = 10;
            Integer b = Integer.valueOf(a);
            Integer c = a;
            System.out.println(a);

            byte d = 10;
            Byte b2 = Byte.valueOf(d);
            System.out.println(d);

            short s1 = 10;
            Short s2 = Short.valueOf(s1);
            System.out.println(s1);

            long l1 = 1342356346;
            Long l2 = Long.valueOf(l1);
            System.out.println(l1);

            float f1 = 123.45f;
            Float f2 = Float.valueOf(f1);
            System.out.println(f1);

            double d1 = 123.45;
            Double d2 = Double.valueOf(d1);
            System.out.println(d1);

            boolean b1 = true;
            Boolean b3 = Boolean.valueOf(b1);
            System.out.println(b1);

            char c1 = 'a';
            Character c3 = Character.valueOf(c1);
            System.out.println(c1);

        }
    }

