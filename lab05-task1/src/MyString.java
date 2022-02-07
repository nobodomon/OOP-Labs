
public class MyString  implements PlayString{
	

	@Override
	public StringBuilder backwardsString(String s) {
	
		return new StringBuilder(s).reverse();
	}
}
