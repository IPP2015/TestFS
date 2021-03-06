import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Sign In/Page_My Store/a_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/h3_Already registered'), 'ALREADY REGISTERED?')

WebUI.setText(findTestObject('Object Repository/Sign In/Page_Login - My Store/input_Email address_email'), Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Sign In/Page_Login - My Store/input_Password_passwd'), Password)

WebUI.getAttribute(findTestObject('Sign In/Page_Login - My Store/input_Email address_email'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.getAttribute(findTestObject('Sign In/Page_Login - My Store/input_Password_passwd'), 'type="password"')

WebUI.click(findTestObject('Object Repository/Sign In/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Sign In/Page_My account - My Store/span_Ilham Testing'), 'Ilham Testing')

WebUI.click(findTestObject('Object Repository/Sign In/Page_My account - My Store/a_Sign out'))

WebUI.click(findTestObject('Attribut/Page_Login - My Store/a_Forgot your password'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/h1_Forgot your password'), 'FORGOT YOUR PASSWORD?')

WebUI.closeBrowser()

