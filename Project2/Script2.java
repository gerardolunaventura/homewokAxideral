
import resources.Script2Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>18/07/2018 15:49:00</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		classicsCD().move(atPoint(264,92));
		album().click(atText("Details"));
		details().click(atText("Album"));
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		tree2().doubleClick(atPath("Composers->Schubert->Die schone Mullerin, Op. 25"));
		tree2().click(atPath("Composers->Schubert->Symphonies Nos. 5 & 9"));
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 7"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 9"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 5"));
		tree2().click(atPath("Composers->Mozart"));
		album().click(atText("Details"));
		placeOrder(ANY,DISABLED).click();
		tree2().drag(atPoint(13,71), atPoint(12,71));
		tree2().click(atRow(atPath("Composers->Beethoven")), atPoint(13,10));
		tree2().click(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		jmb().click(atPath("Order"));
		jmb().click(atPath("Order->View Existing Order Status..."));
		
		// Frame: View Order Status
		viewOrderStatus().move(atPoint(163,198));
		nameComboB().doubleClick();
		password().click(atPoint(117,7));
		nameComboB().doubleClick();
		nameComboB().click();
		nameComboB().click(atText("Susan Flontly"));
		password().click(atPoint(79,12));
		viewOrderStatus().inputChars("123456678");
		rememberPassword().clickToState(SELECTED);
		ok().click();
		
		// Frame: View Existing Orders
		existingTable().doubleClick(atCell(atRow(
                                        "ORDER ID", "5", "ORDER DATE", 
                                        "3/11/98", "STATUS", 
                                        "Order Initiated"), 
                                     atColumn("ORDER DATE")), 
                              atPoint(7,9));
		cancelSelectedOrder().click();
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Order"));
		jmb().click(atPath("Order->View Existing Order Status..."));
		
		// Frame: View Order Status
		ok().click();
		
		// Frame: View Existing Orders
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Order"));
		jmb().click(atPath("Order->Place New Order..."));
		
		// Frame: Member Logon
		newCustomer().click();
		ok2().click();
		
		// Frame: Place an Order
		name().click(atPoint(88,4));
		placeAnOrder().inputChars("222");
		street().click(atPoint(36,9));
		placeAnOrder().inputChars("222");
		cityStateZip().click(atPoint(40,10));
		placeAnOrder().inputChars("222");
		phone().click(atPoint(39,4));
		placeAnOrder().inputChars("222");
		placeOrder2().click();
		
		// 
		aceptar().click();
		
		// Frame: Place an Order
		relatedItems().click();
		
		// 
		addToOrder().click();
		
		// Frame: Place an Order
		cancel().click();
	}
}

