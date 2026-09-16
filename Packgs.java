package Users.anits.csm.Desktop;

public class Packgs 
{
    private int    rollNo;
    private String name;

    public Packgs (int r, String n) 
	{
		rollNo = r;
		name = n;
	}

    public void show() 
	{
        System.out.println("Roll: " + rollNo + " | Name: " + name);
    }
}