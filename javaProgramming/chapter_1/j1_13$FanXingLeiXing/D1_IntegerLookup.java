package j1_13$FanXingLeiXing;

public class D1_IntegerLookup implements D1_Lookup<Integer> {

	private String[] names;
	private Integer[] values;
	
	@Override
	public Integer find(String name) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) {
				return values[i];
			}
		}
		return null;
	}
	
}
