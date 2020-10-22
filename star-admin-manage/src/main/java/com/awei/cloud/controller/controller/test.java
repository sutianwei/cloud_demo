package com.awei.cloud.controller.controller;

import com.awei.cloud.entity.UserEntity;

import java.util.*;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {


        UserEntity entity = new UserEntity();
        entity.setName("su");
        entity.setPassword("123");
        entity.setSex("F");
        UserEntity entity1 = new UserEntity();
        entity1.setName("su");
        entity1.setPassword("123");
        entity1.setSex("F");

        UserEntity entity2 = new UserEntity();
        entity2.setName("12");
        entity2.setPassword("12");
        entity2.setSex("M");

        List<UserEntity> list1 = new ArrayList<>();
        list1.add(entity);
        list1.add(entity2);
        list1.add(entity1);

        System.out.println(list1.stream().distinct().count() == list1.size());

        //按照id去重
        int s = list1.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection
                                (() -> new TreeSet<>(Comparator.comparing(o -> o.getName()))),
                        ArrayList::new)).size();
        System.out.println(s);


    }


    private class user {
        private String name;
        private String pass;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            user ok = (user) obj;
            return Objects.equals(name, ok.name) &&
                    Objects.equals(pass, ok
                            .pass);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name,pass);
        }
    }

}
