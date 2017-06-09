/**
 * Java. Level 1. Lesson 5
 *
 * @author Ali Al-Vasiti
 * @version dated May 20,2017
 */
/*
     * 1.Создать класс "Сотрудник" с полями: фио,должность,мыло,телефон,зарплата,возраст;
     * 2.Конструктор класса должент заполнять эти поля при создании объекта;
     * 3.Внутри класса «Сотрудник» написать метод, который выводи информацию об объекте в консоль;
     * 4.Создать массив из 5 сотрудников
     * 5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     */
class HW5{
	public static void main(String[] args) {
		Sotrudnik S1 = new Sotrudnik("Al-Vasiti Ali", "developer", "alsektor2005@yandex.ru", "89032600880", "150000", 27);
		Sotrudnik[] persArray = new Sotrudnik[5];
		persArray[0] = new Sotrudnik("Kartsev Nikita", "CEO", "kartsev@yandex.ru", "89150467549", "100000", 57);	
		persArray[1] = new Sotrudnik("Makarov Vadim", "meneger", "makarov@mailbox.com", "89163457495", "50000", 30);
		persArray[2] = new Sotrudnik("Seroshtan Dmitriy", "artist", "seroshtan@mailbox.com", "89131654798", "70000", 40);
		persArray[3] = new Sotrudnik("Sviridov Dmitriy", "driver", "sviridov@mailbox.com", "9142478946", "80000", 45);
		persArray[4] = new Sotrudnik("Stepanov Sergey", "gruzhik", "stepanov@mailbox.com", "89055314578", "90000", 50);
	}

}
	class Sotrudnik {
		private String name;
		private String dolznost;
		private String e_mail;
		private String telefon;
		private String zarplata;
		private int age;

		public Sotrudnik(String name,String dolznost,String e_mail,String telefon,String zarplata,int age) { 
			this.name=name; 
			this.dolznost=dolznost;
			this.e_mail=e_mail;
			this.telefon=telefon;
			this.zarplata=zarplata;
			this.age=age;
	    	metod();
		} 

		public void metod(){
			if (age>40){
	    	System.out.println(name+" "+dolznost+" "+e_mail+" "+telefon+" "+zarplata+" "+age);
			}	    
	    }

	}
	    

 
