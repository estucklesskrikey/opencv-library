import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.LoggerFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class iOSSample extends TestdroidImageRecognition {

    public iOSSample() throws Exception {
        super();
        logger = LoggerFactory.getLogger(iOSSample.class);
    }

    @BeforeClass
    public static void setUp() throws Exception {
        driver = getIOSDriver();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            log("Quitting Appium driver at tearDown");
            driver.quit();
        } else {
            log("driver was null at tearDown");
        }
    }


    @Test
    public void mainPageTest() throws Exception {
        log("Image Recognition sample script started.");
        
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log("Keyboard not present; going forward.");
        }
        
        findAndCropImage("test.png");
        log("Success.");
    }
    
}
