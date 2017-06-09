/**
 * Java. Level 1. Lesson 6
 *
 * @author Ali Al-Vasiti
 * @version dated May 24,2017
 */
/*
     * 1.Создать классы Собака и Кот с наследованием от класса Животное. 
     * 2.Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
     *   В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
     *   или высоту (для прыжков)
     * 3.У каждого животного есть ограничения на действия
     *  (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.). 
     * 4.При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
     *   (Например, dog1.run(150); -> результат: run: true)
     * 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м
     */
public class HW6{
	public static void main(String[] args) {
		Animal animal = new Animal("Animal");
		Cat cat = new Cat("Barsik");
		Dog dog = new Dog("Sharik");
		animal.animalInfo();
		cat.catInfo();
		dog.dogInfo();
		dog.jump(0.3);
		animal.run(1000);
		cat.swimming(100);
	}
}
class Animal { 
	public String name; 
	public int dlina;
	public double visota;
		void run(int dlina) {
		System.out.println("Zhivotnoe bezhit"+" "+dlina+" "+"metr(ov)");
		} 
		void swimming(int dlina) {
		System.out.println("Zhivotnoe plivet"+" "+dlina+" "+"metr(ov)");
		} 
		void jump(double visota) {
		System.out.println("Zhivotnoe pereprigivaet prepytstvie"+" "+visota+" "+"metr(ov)");
		} 

    public Animal(String name) { 
            this.name = name; 
    } 
    public void animalInfo() {
    	System.out.println("Animal: " + name); 
    } 
}

class Cat extends Animal {  
 	@Override   
	void run(int dlina) {
		if (dlina>200) {
			System.out.println("Izvinite, dannaya koshka stolko ne begaet. Tolko do 200 metrov");
		}
		else	{
			System.out.println("run: true");
		}
	}
	void jump(double visota) {
		if (visota>2) {
			System.out.println("Izvinite, dannaya koshka tak visoko ne prigaet. Tolko do 2 metrov");
		}
		else	{
			System.out.println("run: true");
		}
	}
	void swimming(int dlina) {
			System.out.println("Izvinite, dannaya koshka ne umeet plavat");
	}
    public Cat(String name) { 
     	super(name);       
   	 	this.name = name;
   	}
   	public void catInfo() {
   		System.out.println("Cat: " + name);
   	}     
}
class Dog extends Animal {
	@Override   
	void run(int dlina) {
		if (dlina>500) {
			System.out.println("Izvinite, dannaya sobaka stolko ne begaet. Tolko do 500 metrov");
		}
		else	{
			System.out.println("run: true");
		}
	}   
	void jump(double visota) {
		if (visota>0.5) {
			System.out.println("Izvinite, dannaya sobaka tak visoko ne prigaet. Tolko do 0.5 metrov");
		}
		else	{
			System.out.println("run: true");
		}
	}  
	void swimming(int dlina) {
		if (dlina>10) {
			System.out.println("Izvinite, dannaya sobaka tak mnogo ne plavaet. Tolko do 10 metrov");
		}
		else	{
			System.out.println("run: true");
		}
	}    
    public Dog(String name) { 
    	super(name);         
   		this.name = name;
   	}
   	public void dogInfo() {
   		System.out.println("Dog: " + name);
   	}   
}
