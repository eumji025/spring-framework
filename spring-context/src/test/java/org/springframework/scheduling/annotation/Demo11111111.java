package org.springframework.scheduling.annotation;

/**
 * @description: write some thing of this file
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 2018-10-14
 */
public class Demo11111111 {
    interface A{

    }
    static class D{
        static class F{

        }
    }

    static class B extends D implements A{

        static class C{

        }

        static class D{

        }
    }

    public static void main(String[] args) {
        Class<?>[] declaredClasses = B.class.getDeclaredClasses();
        System.out.println(declaredClasses);
    }
}
