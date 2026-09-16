class Employee
{
  string name,designation;
  int id;
  double salary;
  boolean promotion;
  Employee(int id,string name,string designation,double salary)
  {
     this.id=id;
	 this.name=name;
	 this.designation=designation;
	 this.salary=salary;
	 this.promotion=true;
  }
  Employee(int id,string name,string designation,double salary,boolean promotion)
  {
	this.id=id;
	 this.name=name;
	 this.designation=designation;
	 this.salary=salary;
	 this.promotion=promotion;
  }
  void display()
  {
	  System.out.println("ID="+id+" Name="+name+" Designation="+designation+");
      System.out.println("Salary="+salary+" Promotion="+promotion?"Eligible":Not Eligible");	  