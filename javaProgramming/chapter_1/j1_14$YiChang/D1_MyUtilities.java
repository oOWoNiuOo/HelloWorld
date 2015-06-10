package j1_14$YiChang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D1_MyUtilities {

	public double[] getDataSet(String setName) throws D1_BadDataSetException {
		String file = setName + ".dset";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (FileNotFoundException e) {
			throw new D1_BadDataSetException();
		} finally {
			try{
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				;
			}
		}
	}
	
}
