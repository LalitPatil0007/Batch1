package conceptsontestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionTestNGEdge {


	@Test
	public void test0() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
	}

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nseindia.com/market-data/live-equity-market");
		Thread.sleep(6000);
	}

	@Test
	public void test2() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.tradingview.com/chart/FsJhbZ5w/?symbol=NSE%3ANIFTY");
		Thread.sleep(6000);
	}

	@Test
	public void test3() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://trendlyne.com/portfolio/superstar-shareholders/index/");
		Thread.sleep(6000);
	}

	@Test
	public void test4() throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tickertape.in/screener/mutual-fund");
		Thread.sleep(6000);
	}

	@Test
	public void test5() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.javatpoint.com/java-programs#java-string-programs");
		Thread.sleep(6000);
	}

}
