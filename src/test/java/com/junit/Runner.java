package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Execution1.class,LoginPage.class,Utility.class})
public class Runner{

}
