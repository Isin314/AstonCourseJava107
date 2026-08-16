package HomeworkPackage;

public class Program {

	public static void main(String[] args) 
	{
		АssociatedСlass associatedClass = new АssociatedСlass("constructor text");
		OuterClass outerClass = new OuterClass(0, associatedClass);
		
		System.out.printf("intData: %d, associatedClass: %s.\n",
				outerClass.getIntData(),
				outerClass.getAssociatedClass().getData());
		
		outerClass.getAssociatedClass().setData("changed text");
		
		System.out.printf("After changing. intData: %d, associatedClass: %s.\n",
				outerClass.getIntData(),
				outerClass.getAssociatedClass().getData());
		
		АssociatedСlass associatedClass2 = new АssociatedСlass("constructor text");
		OuterClass outerClass2 = new OuterClass(0, associatedClass2);
		
		System.out.printf("Another outerClass. intData: %d, associatedClass: %s.\n",
				outerClass.getIntData(),
				outerClass.getAssociatedClass().getData());
		
		System.out.printf("Pointer equals %b.\n",outerClass == outerClass2);
		System.out.printf("Object.equals %b.\n",outerClass.equals(outerClass2));
		System.out.printf("Hashcode equals %b.\n",outerClass.hashCode() == outerClass2.hashCode());
		
	}
}
