public class CreateAnimal {
    public static void main(String[] args) {
        System.out.println("Коты:");
        Cat boris = new Cat(150, 1, 15);
        System.out.print("1.Борис");
        boris.isRunning();
        boris.isSwiming();
        Cat snowy = new Cat(200, 3, 3);
        System.out.print("2.Снежок");
        snowy.isRunning();
        snowy.isSwiming();
        Cat kuro = new Cat(210, 0, 4);
        System.out.print("3.Черныш");
        kuro.isRunning();
        kuro.isSwiming();
        Cat[] cats = new Cat[3];
        cats[0] = boris;
        cats[1] = snowy;
        cats[2] = kuro;
        System.out.println("Коты хотят поесть");
        Misca catMisc = new Misca(13);
        catMisc.foodAmount();
        for (Cat cat : cats) {
            cat.tryToEat();
        }
        catMisc.moreFood();
        boris.tryToEat();
        System.out.println("Собаки:");
        Dog havski = new Dog(300, 10);
        System.out.print("1.Хавски");
        havski.isRunning();
        System.out.print("  Хавски");
        havski.isSwiming();
        Dog frank = new Dog(501, 11);
        System.out.print("2.Фрэнк");
        frank.isRunning();
        System.out.print("  Фрэнк");
        frank.isSwiming();
        System.out.println("Всего животных: " + Animal.getCountAnimals());
        System.out.println("Создано котов: " + Cat.getCountCat());
        System.out.println("Создано собак: " + Dog.getCountDog());
    }
}