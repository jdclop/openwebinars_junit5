package suite_package;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"junit"})
@Suite
@SuiteDisplayName("Login testsuite")
@IncludeTags("login")
@ExcludeTags("este_no")
public class SuiteTagTests {

}
