/**
 * Java. Level 1. Lesson 6
 *
 * @author Ali Al-Vasiti
 * @version dated May 28,2017
 */
/*
     * 1.Расширить задачу про котов и тарелки с едой +
     * 2.Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды +
     * (например, в миске 10 еды, а кот пытается покушать 15-20) +
     * 3.Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
     *   Если коту удалось покушать (хватило еды), сытость = true 
     * 4.Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,+
     *  то есть не может быть наполовину сыт (это сделано для упрощения логики программы)+
     * 5. Создать массив котов и тарелку с едой,
     *  попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
     * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку 
     */
public class HW7{
	public static void main(String[] args) {
          Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murzik", 20),
                new Cat("Cot", 30),
                new Cat("Tuzik", 40),
                new Cat("Obormot", 50)
          };
          Plate plate = new Plate(100);
           for (Cat c: cats) {
            c.eat(plate);
            c.info();
          }
           plate.info();
           plate.addFood(100);
           plate.info();
     }
}
class Cat {
   private String name;
   private int appetite;
   private boolean hungry;
     public Cat(String name, int appetite) {
          this.name = name; 
          this.appetite = appetite;  
          this.hungry = true; 
     }
     void info() {
        String isHungry = (hungry) ? "goloden" : "sit";
        System.out.println(name + ": " + isHungry);
     }    
     public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
     } 
} 

class Plate {
   private int food; 
     Plate(int food) {
       this.food = food; 
     }   
     boolean decreaseFood(int n) {
          int a=food-n;
          if (a<0) {
               System.out.println("Nechvataet edi v miske,kot skishkom prozorliv. Umer'te appetit");     
               return false;
          } 
          else {
               food-=n;
               System.out.println("Kot poel,ostalos"+" "+a);     
               return true;
          }
     } 
     public void info() {   
          System.out.println("plate: " + food);
     }
     void addFood(int food) {
        this.food += food;
        System.out.println("Napolnim misku dlya kiski");
    }
}  
 