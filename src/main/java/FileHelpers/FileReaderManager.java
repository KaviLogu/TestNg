package FileHelpers;

public class FileReaderManager {

	
	private FileReaderManager() {
	
	}
	
	public static FileReaderManager getInstance () {
		
		FileReaderManager reader = new FileReaderManager();
		
		return reader;
	}
	
	public Configuration_Reader getInstanceCr () throws Throwable {
		
		Configuration_Reader reader = new Configuration_Reader();
		
		return reader;
	}
}
