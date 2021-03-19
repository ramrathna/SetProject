package set;

public class Linkhashset {

	public static void main(String[]args) {
		java.util.LinkedHashSet<Employee>emp = new java.util.LinkedHashSet<Employee>();
		
		Employee e1 = new Employee(123, "Naveen Prasad", "IT Developer", 1122334455);
		Employee e2 = new Employee(234, "Ramanathan", "Banking", 2223311567l);
		Employee e3 = new Employee(456,"Elavarasan", "BPO", 3344556600l);
		
	    emp.add(e1);
	    emp.add(e2);
	    emp.add(e3);
	    
	    for(Employee sub :emp)
	    	System.out.println("Employee_ID " + sub.id + "  " + "Employee_Name " + sub.name +" " + "Department " + sub.dep +" " +"Contact_Number " +sub.num);
	    
	    	
	}

}
   
   class Employee{
	   int id;
	   String name,dep;
	   long num;
	   
	   public Employee(int id, String name, String dep, long num) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.num = num;
	}
	
	    
}
