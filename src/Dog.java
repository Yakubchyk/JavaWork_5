public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        // конструкторов может быть много.
// this. это значит мы ссылаемсё сами на себя.
        //
    }

    // как только создаем свой конструктор,
// то под капотом удаляется
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // то были характеристики

    // Поведение: (Метод, Функция)
    void barking() { // \тот метод ничего не возвращает
        System.out.println("Gav gav, mei name ist " + name);

    }

    String barking2() { // \тот метод ничего не возвращает
        return "Gav gav, mei name ist " + name;


    }

}


