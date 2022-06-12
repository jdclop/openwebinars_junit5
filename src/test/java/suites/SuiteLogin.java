package suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages("junit_tests")
@SuiteDisplayName("Suite de login")
@IncludeTags("login")
@ExcludeTags("logout")
public class SuiteLogin {

}
