public class Book {

		private String name;
		public Person(String s) {
			name=s;
		}
		public void setName(String s) {
			name=s;
		}
		public String getName() {
			return name;
		}
		public String toString() {
			return name;
		}
	}
	class Employee extends Book{
		private double ansalary;
		private int empyr;
		private String ins_no;
		public Employee(String s,double a,int y,String ins) {
			super(s);
			ansalary=a;
			empyr=y;
			ins_no=ins;
		}
		public void setSalary(double a)
		{
			ansalary=a;
		}
		public void setYear(int y) {
			empyr=y;
		}
		public void setIns_no(String i) {
			ins_no=i;
		}
		public int getyr()
		{
			return empyr;
		}
		public double getSalary() {
			return ansalary;
		}
		public String getInsno() {
			return ins_no;
		}
		public String toString() {
			return super.toString()+" "+ansalary+" "+empyr+" "+ins_no;
		}
	}

	public class Inheritance2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p=new Person("Koushik");
			Employee e=new Employee("Amar",15000,2017,"aabb");
			System.out.println(p);
			System.out.println(e);
		}


		String name1,author;
	    double price;
	    int qtyInStock;
	    Book(String n1)
	    {
	        name1=n1;
	    }
	    public void setPrice()
	    {
	        price=100;
	    }
	    public double getPrice()
	    {
	        return price;
	    }
	    public void setQtyInStock()
	    {
	        qtyInStock=10;
	    }
	    public int getQtyInStock()
	    {
	        return qtyInStock;
	    }
	    public String getName()
	    {
	        return name1;
	    }
	    public void getAuthor()
	    {
	       System.out.println("The name of the author is :"+Author.name);
	       System.out.println("The email id is :"+Author.email);
	       System.out.println("The gender is :"+Author.gender);
	    }
	}




