public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
    }
    public static void task1 () {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
        public static void task3 () {
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
    }
    public static void task4 () {
        System.out.println("Задача 6-7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксёров " + totalWeight + " кг!");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса боксёров " + weightDifference + " кг");
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница веса боксёров с помощью деления " + weightDifference2 + " кг");
    }
        public static void task5 () {
            System.out.println("Задача 8");
        var hoursOperation = 640;
        var hoursWorks = 8;
        var staff = hoursOperation / hoursWorks;
        System.out.println("Всего работников в компании — " + staff + " человек");
        staff = staff + 94;
        hoursOperation = staff * hoursWorks;
        System.out.println("Если в компании работает "+ staff + " человек, то всего " + hoursOperation + " часов работы может быть поделено между сотрудниками");


    }
}