package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import static Helper.WebHelper.startDriver;
import static Helper.WebHelper.tearDown;


public class Hooks {

    @BeforeAll
    public static void startUp (){

    }

    @AfterAll
    public static void shutDown (){

    }

    @Before
    public void beforeTest (){
        System.out.println("BEFORE TEST");
        startDriver();
    }

    @After
    public  void afterTest (){
        System.out.println("AFTER TEST");
        tearDown();
    }
}
