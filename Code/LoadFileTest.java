
public class LoadFileTest 
{
	public static void main(String[] args)
	{
		int i = 0;
		while(!(LoadFile.yes))
		{
			LoadFile.Loadfile("Bob");
			i++;
			// prevent a got-dang infinite loop
			if(i >= 1000)
				break;
		}
		
		System.out.println(LoadFile.name);
		System.out.println(LoadFile.weight);
		System.out.println(LoadFile.height);
		System.out.println(LoadFile.age);
		System.out.println(LoadFile.sex);
		System.out.println(LoadFile.vegan);
		
	}

}
