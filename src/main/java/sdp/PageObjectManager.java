package sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.Automation_Practise.CheckoptPage_Project;
import com.Automation_Practise.DressSelectionProject;
import com.Automation_Practise.Dresses_Project;
import com.Automation_Practise.Home_Page;
import com.Automation_Practise.Project_AddToCart;
import com.Automation_Practise.Project_AddToCartFrame;
import com.Automation_Practise.Project_AddtoCartCheckout;
import com.Automation_Practise.Project_CasualDress;
import com.Automation_Practise.Project_Color;
import com.Automation_Practise.Project_Shipping;
import com.Automation_Practise.Project_SignInCheckout;
import com.Automation_Practise.Project_Signout;
import com.Automation_Practise.Project_Size;
import com.Automation_Practise.SignIn_Page;
import com.google.common.base.CaseFormat;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	private Home_Page hp;

	public Home_Page getInstanceHp() {

		hp = new Home_Page(driver);

		return hp;
	}

	private SignIn_Page sp;

	public SignIn_Page getInstanceSp() {

		return sp = new SignIn_Page(driver);

	}

	private Dresses_Project dp;

	public Dresses_Project getInstanceDp() {

		return dp = new Dresses_Project(driver);

	}

	private Project_CasualDress cd;

	public Project_CasualDress getInstanceCd() {

		return cd = new Project_CasualDress(driver);

	}

	private DressSelectionProject dsp;

	public DressSelectionProject getInstanceDsp() {

		return dsp = new DressSelectionProject(driver);
	}

	private Project_Size size;

	public Project_Size getInstanceSize() {

		return size = new Project_Size(driver);
	}

	private Project_Color color;

	public Project_Color getInstanceColor() {

		return color = new Project_Color(driver);
	}

	private Project_AddToCartFrame cartframe;

	public Project_AddToCartFrame getInstanceCartframe() {

		return cartframe = new Project_AddToCartFrame(driver);
	}

	private Project_AddToCart cart;

	public Project_AddToCart getInstanceCart() {

		return cart = new Project_AddToCart(driver);

	}

	private Project_AddtoCartCheckout checkout;

	public Project_AddtoCartCheckout getInstanceCheckout() {

		return checkout = new Project_AddtoCartCheckout(driver);
	}

	private CheckoptPage_Project proceedtocheckout;

	public CheckoptPage_Project getInstanceProceedtoCheck() {

		return proceedtocheckout = new CheckoptPage_Project(driver);

	}

	private Project_SignInCheckout signincheckout;

	public Project_SignInCheckout getInstanceSignCheckout() {

		return signincheckout = new Project_SignInCheckout(driver);
	}

	private Project_Shipping shipping;

	public Project_Shipping getInstanceShipping() {

		return shipping = new Project_Shipping(driver);
	}

	private Project_Signout signout;

	public Project_Signout getInstanceSignout() {

		return signout = new Project_Signout(driver);
	}

}
