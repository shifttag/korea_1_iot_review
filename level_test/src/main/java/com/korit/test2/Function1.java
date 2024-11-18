package com.korit.test2;

import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

class Nums {
    private Integer[] nums;
    private Random random;

    public Nums(int size) {
        nums = new Integer[size];
        random = new Random();
    }

    public void setRandomNumsAll() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
    }

}

class Test1ButtonMouseAdapter extends  MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("test1 버튼 클릭");
    }
}

public class Function1 {



    public static void main(String[] args) {
        JButton jButton = new JButton("test");
        JButton jButton2 = new JButton("test2");
        jButton.addMouseListener(new Test1ButtonMouseAdapter());
        jButton.doClick();

        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });
        jButton2.doClick();

//        Nums nums = new Nums(20);
//        nums.setRandomNumsAll();
//
//        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> integerConsumer = (Integer n) -> {
            System.out.println(n);
        };

        Consumer<Integer> integerConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        integerConsumer.accept(10);

//        integers.forEach(n -> System.out.println(n));

    }
}
