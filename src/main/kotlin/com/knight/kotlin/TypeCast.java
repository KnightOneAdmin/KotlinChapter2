package com.knight.kotlin;

/**
 * Created by knightoneadmin on 2017/9/24.
 */
public class TypeCast {

    public static void main(String... agrs) {
        Parent parent = new Child();
        System.out.println(((Child) parent).getName());


        if (parent instanceof Child) {
            System.out.println(((Child) parent).getName());
        }
    }

}
