import java.util.LinkedList;

public class LinkedListsExercise
{
	public static void main(String[] args)
	{
		LinkedList<Object> firstList = new LinkedList <Object>();
		LinkedList<Object> secondList = new LinkedList<Object>();
		LinkedList<Object> secondListDeepCopy = new LinkedList<Object>();
		Object testObj = new Object();
		boolean even = false;
	 	
		// add all the stuff to the first list
		firstList.add("Tulsa");
		firstList.add("Ada");
		firstList.add("Broken Arrow");
		firstList.add("Owasso");
		firstList.add(1, "OKC");
		System.out.println("First List: " + firstList);
		final int listInitialSize = firstList.size(); // must make constant because list size will change later
		
		// add all the stuff to the second list
		secondList.add(74104);
		secondList.add(74135);
		secondList.add("foo");
		secondList.add("hello world");
		secondList.add(777);
		System.out.println("Second List: " + secondList);
		
		// merge the two lists in a zipper fashion
		for (int i = 0, j = 1; i < listInitialSize; i++, j += 2)
		{
			firstList.add(j, secondList.get(i));
		}
		System.out.println("First List: " + firstList);
		
		// remove every other String type from the list
		for (int i = 0; i < firstList.size(); i++)
		{
			testObj = firstList.get(i);
			if (testObj instanceof String && even == true)
			{
				firstList.remove(i);
				even = false;
			}
			else if (testObj instanceof String && even == false)
				even = true;
		}
		System.out.println("First List: " + firstList);
		
		// iterate through and copy the second list to the first list
		for (int i = 0; i < secondList.size(); i++)
		{
			secondListDeepCopy.add(i, secondList.get(i));
		}
		System.out.println("Deep Copy of Second List: " + secondListDeepCopy);
		
	}
}