package com.knight.kotlin;

/**
 * Created by knightoneadmin on 2017/9/24.
 */
public class NullNoState {

    public static void main(String[] args) {
        String name = getName();
        System.out.println(name);
    }

    public static String getName() {
        return null;
    }
}
