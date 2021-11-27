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

WebUI.click(findTestObject('Object Repository/Ne/Page_My Store/a_Sign in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Password_passwd'), 'nIIgyZiqan0KE6OgLtUMtw==')

WebUI.click(findTestObject('Object Repository/Ne/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/Page_Login - My Store/li_An email address required'), 
    'An email address required.')

WebUI.setText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Email address_email'), 'email')

WebUI.click(findTestObject('Object Repository/Ne/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/Page_Login - My Store/li_Invalid email address'), 
    'Invalid email address.')

WebUI.setText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Email address_email'), 'testing.2021.test.123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Password_passwd'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Ne/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/Page_Login - My Store/li_Password is required'), 
    'Password is required.')

WebUI.setEncryptedText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Password_passwd'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Ne/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/Page_Login - My Store/li_Invalid password'), 'Invalid password.')

WebUI.setEncryptedText(findTestObject('Object Repository/Ne/Page_Login - My Store/input_Password_passwd'), 'nIIgyZiqan0KE6OgLtUMtw==')

WebUI.click(findTestObject('Object Repository/Ne/Page_Login - My Store/span_Sign in'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/Page_Login - My Store/li_Authentication failed'), 
    'Authentication failed.')

WebUI.closeBrowser()

