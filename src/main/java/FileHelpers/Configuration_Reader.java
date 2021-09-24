package FileHelpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.seleniumhq.jetty9.util.security.Password;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\nehru\\eclipse-workspace\\Automation_Practise\\src\\main\\java\\PropertyFile\\Configuration.properties");

		FileInputStream inputstream = new FileInputStream(f);

		p = new Properties();

		p.load(inputstream);
	}

	public String getBrowser() {

		String browser = p.getProperty("browser");

		return browser;
	}

	public String getUrl() {

		String url = p.getProperty("url");

		return url;
	}

	public String getUsername() {

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() {

		String password = p.getProperty("password");

		return password;
	}
}
