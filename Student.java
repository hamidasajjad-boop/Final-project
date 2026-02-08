public class Student {
    private String name;
		private int id;
	public Student(String a, int b)
    {
name = a;
 id= b;
    }
		public void printInfo(){
			System.out.println("Name: " + this.name);
			System.out.println("ID: " + id);
		}
	}