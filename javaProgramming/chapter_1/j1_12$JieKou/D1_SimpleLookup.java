package j1_12$JieKou;

public class D1_SimpleLookup implements D1_Lookup {

	private String[] names;
	private Object[] values;
	
	@Override
	public Object find(String name) {
		for(int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				return values[i];
			}
		}
		return null;
	}

}
