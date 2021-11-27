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

WebUI.click(findTestObject('Sign Up/Page_My Store/a_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/h3_Create an account'), 'CREATE AN ACCOUNT')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'testing.2021.test.123@gmail.com')

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/div_Create an accountPlease enter your emai_e8c7c5'))

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.verifyElementText(findTestObject('Ne/Page_Login - My Store/div_An account using this email address has already been registered. Please enter a valid password or request a new one'), 
    'An account using this email address has already been registered. Please enter a valid password or request a new one.')

WebUI.clearText(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/div_Create an accountPlease enter your emai_e8c7c5'))

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'url(../img/icon/form-error.png) 98% 5px no-repeat #fff1f2')

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/li_Invalid email address'), 'Invalid email address.')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'testing.2021.test.123@gmail.com')

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/div_Create an accountPlease enter your emai_e8c7c5'))

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'url(../img/icon/form-error.png) 98% 5px no-repeat #fff1f2')

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/li_An account using this email address has already been registered. Please enter a valid password or request a new one'), 
    'An account using this email address has already been registered. Please enter a valid password or request a new one.')

WebUI.closeBrowser()

