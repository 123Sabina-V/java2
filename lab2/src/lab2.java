import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class lab2 {

//Створіть тестовий приклад, який демонструє відмінність між інтерфейсами та абстрактними класами по своїм можливостям. 

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Створіть тестовий приклад, який демонструє відмінність між інтерфейсами та абстрактними класами по своїм можливостям. 
		Students s=new Students();
		s.setQuentity(6398);
		System.out.println(s.getQuentity());
		//Продемонструйте у коді перехоплення у блоці  try-catch декількох виключень, покажіть, 
		//як ієрархія спадкування виключень, впливає на порядок перехоплення виключень у багаторядковому блоці catch
		try {
		       BufferedReader reader = new BufferedReader(new FileReader("D:\\Test\\test.txt"));

		       System.out.println(366/0);
		       String firstString = reader.readLine();
		       System.out.println(firstString);
		   } catch (IOException e) {

		       System.out.println("Error!File is not found!");

		   } catch (ArithmeticException e) {

		       System.out.println("Error! /0");

		   }
	
		//Створіть просту  ієрархію спадкування, яка відповідає сутностям Товар (властивості - назва, виробник, дата виготовлення, ціна) 
		//та Продукти харчування (термін придатності, харчова група (молочні, м'ясні, бакалея та інше)), 
		//РадіоЕлектроніка (вид електроніки, гарантійний термін). Продемонструйте перевантаження конструкторів та методів, 
		//перевизначення методів, особливості роботи конструкторів при спадкуванні.
		Product p=new Product();
		p.show();
		Food f=new Food();
		f.show();
		RadioElectronics r=new RadioElectronics();
		r.show();
		
		
		
		  Student student = new Student();
	        Scanner sc = new Scanner(System.in); 
	        System.out.print("Enter age:");
	       int ageStud =sc.nextInt();
	        try{
	            student.getStudent(ageStud);
	        }
	        catch(StudentException ex){

	            System.out.println(ex.getMessage());
	        }

//На тестовому прикладі продемонструйте відмінності використання змінних,методів звичайних та static методів та змінних
 //Використовуйте модель, яка потребує підраховувати  кількість створених об'єктів певного типу, використайте для цього static- змінні.

	        Number_Objects t1 = new Number_Objects(); 
	        Number_Objects t2 = new Number_Objects(); 
	        Number_Objects t3 = new Number_Objects(); 
	        Number_Objects t4 = new Number_Objects(); 
	        Number_Objects t5=new Number_Objects();
            t5.pupAge();
        
        System.out.println("Quentity created objects:"+Number_Objects.numOb);
		
	    
	}
}

	
 abstract class University{
		
		private String pupils;
		private int quentity;
		
		public String getPupils()
		{
			return pupils;
		}
		public void setPupils(String p)
		{
			pupils=p;
		}
		public int getQuentity()
		{
			return quentity;
		}
		public void setQuentity(int quentity)
		{
			this.quentity=quentity;
		}
		public abstract void print();
		
	}
	  class Students extends University
	{
		@Override
		public void print()
		{
			System.out.println("University");
		}
		
	}
	
	 interface Show{
		//private String pupils=new String();
		int quentity=9000;
		void print();
		
	}

//Створіть просту  ієрархію спадкування, яка відповідає сутностям Товар (властивості - назва, виробник, дата виготовлення, ціна) 
	//та Продукти харчування (термін придатності, харчова група (молочні, м'ясні, бакалея та інше)), 
	//РадіоЕлектроніка (вид електроніки, гарантійний термін). Продемонструйте перевантаження конструкторів та методів, 
	//перевизначення методів, особливості роботи конструкторів при спадкуванні.
	 class Product
	{
		String name;
		String producer;
		int dateOfManufacture;
		int price;
	
	public Product(){
		
		this.name="name";
		this.producer="producer";
		this.dateOfManufacture=0;
		this.price=0;
		System.out.println("This is constructor for Product");
	}
public Product(String name,String producer,int dateOfManufacture,int price)
{
		
		this.name=name;
		this.producer=producer;
		this.dateOfManufacture=0;
		this.price=0;
		System.out.println("This is constructor for Product");
	}
public void show()
{
	System.out.println("Name:"+name+"Producer"+producer+"DateOfManufacture"+dateOfManufacture+"Price"+price);
}
public void show(int producerQuentity)
{
	System.out.println("Name: %s \\n\"+name +Producer:"+producer+"DateOfManufacture"+dateOfManufacture+"Price"+price);
	System.out.println("Quentity producer"+producerQuentity);
}
	}
  class Food extends Product
	{
		int expirationDate;
		String foodGroup;
		public Food()
		{
			super();
			this.expirationDate=0;
			this.foodGroup="";
			System.out.println("This is constructor for Food");
			
		}
		public Food(String name,String producer,int dateOfManufacture,int price,int expirationDate,String foodGroup)
		{
			super(name,producer,dateOfManufacture,price);
			this.expirationDate=expirationDate;
			this.foodGroup=foodGroup;
			System.out.println("This is constructor for Food");
			
		}
		@Override
		public void show()
		{
			super.show();
			System.out.println("This is Food");
		}
			
	}
	//РадіоЕлектроніка (вид електроніки, гарантійний термін)
	  class RadioElectronics extends Product
	{
		String typeElectronics;
		int warrantyPeriod;
		
		public RadioElectronics()
		{
			super();
			this.typeElectronics="";
			this.warrantyPeriod=0;
			System.out.println("This is counstructor for RadioElectronics");
			
		}
		public RadioElectronics(String name,String producer,int dateOfManufacture,int price,String typeElectronics,int warrantyPeriod)
		{
			super(name,producer,dateOfManufacture,price);
			this.typeElectronics=typeElectronics;
			this.warrantyPeriod=warrantyPeriod;
			System.out.println("This is counstructor for RadioElectronics");
			
		}
	}

//Продемонструйте у коді генерацію свого виключення AgeStudentException у конструкторі 
//класу Student при спробі створити об'єкт зі значенням віку помилковим.

	  class Student{
		 int ageStud;
		public  void getStudent(int ageStud) throws StudentException
		{
			
			if(ageStud<0 || ageStud>150) { 
				throw new StudentException("Age must be from 0 to 150", ageStud);
				} 
	        else this.ageStud=ageStud;
			
		}
	}
	
	 class StudentException extends Exception{
		private int number;
		public int getNumber()
		{
			return number;
		}
		public StudentException(String messsage,int num)
		{
			super(messsage);
			number=num;
		}
		
	}
	      

//На тестовому прикладі продемонструйте відмінності використання змінних,методів звичайних
//та static методів та змінних. Використовуйте модель, яка потребує підраховувати  кількість 
//створених об'єктів певного типу, використайте для цього static- змінні.

	 class Number_Objects { 

	    static int numOb = 0; 
	    Number_Objects()
	    { 
	       numOb ++; 
	       
	    } 
	    
	    public void pupAge()
	    {
	    	int age = 96;
	    	age=age+1;
	    	System.out.println("Age: "+age);
	    	}
	 }
