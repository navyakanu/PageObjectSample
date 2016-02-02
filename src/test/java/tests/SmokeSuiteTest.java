package tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

import java.util.Locale;
import org.junit.experimental.categories.Category;
import org.junit.runners.Suite;

/**
 * Created by navyab on 2/2/16.
 */


@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses(
        {

                SampleTest.class
        }

)
public class SmokeSuiteTest {

}
