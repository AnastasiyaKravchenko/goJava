package com.goit.core.module03.task03;




public class Solution {
    static void solution() {

        Course course1 = new Course("aaa", 1, "rrr");
        Course course2 = new Course("aaa2", 2, "rrr2");
        Course course3 = new Course("aaa3", 3, "rrr3");
        Course course4 = new Course("aaa4", 4, "rrr4");
        Course course5 = new Course("aaa5", 5, "rrr5");
        Student student1 = new Student("Danylo", "Dubinin", 10);
        Student student2 = new Student("Gulin", new Course[]{course1});
        CollegeStudent collegeStudent1 = new CollegeStudent("Vladislav", "Kuleshov", 12, "KPI", 4, 23552556);
        CollegeStudent collegeStudent2 = new CollegeStudent("Dmitriy", "Zavragniy", 3);
        CollegeStudent collegeStudent3 = new CollegeStudent("Konukh", new Course[]{course2});
        SpecialStudent specialStudent1 = new SpecialStudent("Lena", "Sokol", 2);
        SpecialStudent specialStudent2 = new SpecialStudent("Shevchuk", new Course[]{course3});
        SpecialStudent specialStudent3 = new SpecialStudent("Anastasiya", "Yeropheeva", 5, 32652655);
        System.out.println(collegeStudent1.getCollegeName());




    }


}
