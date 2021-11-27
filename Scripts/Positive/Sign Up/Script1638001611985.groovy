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

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'ilham234658465743458ghn@gmail.com')

//WebUI.verifyElementAttributeValue(findTestObject('Sign Up/Page_Login - My Store/input_Email address_email_create'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1', 
//    '', 0)
WebUI.click(findTestObject('Sign Up/Page_Login - My Store/div_Create an accountPlease enter your emai_e8c7c5'))

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.verifyElementText(findTestObject('Attribut/Page_Login - My Store/h3_Your personal information'), 'YOUR PERSONAL INFORMATION')

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/input_Mr_id_gender'))

WebUI.verifyElementChecked(findTestObject('Sign Up/Page_Login - My Store/input_Mr_id_gender'), 1)

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__customer_firstname'), 'Ilham')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__customer_firstname'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__customer_lastname'), 'Testing')

WebUI.setEncryptedText(findTestObject('Sign Up/Page_Login - My Store/input__passwd'), 'nIIgyZiqan2pJUSjXk/tKw==')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__customer_lastname'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__email'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.selectOptionByValue(findTestObject('Sign Up/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '11', true)

WebUI.verifyElementClickable(findTestObject('Sign Up/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Sign Up/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '6', true)

WebUI.verifyElementClickable(findTestObject('Sign Up/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'))

WebUI.selectOptionByValue(findTestObject('Sign Up/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2003', true)

WebUI.verifyElementClickable(findTestObject('Sign Up/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'))

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/input_June_newsletter'))

WebUI.verifyElementChecked(findTestObject('Sign Up/Page_Login - My Store/input_June_newsletter'), 1)

WebUI.verifyElementNotChecked(findTestObject('Attribut/Page_Login - My Store/input_Sign up for our newsletter_optin'), 0)

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Company_company'), 'PT.Testing Aja')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Company_company'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__address1'), 'Jl. Testing Hari No.3')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__address1'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Address (Line 2)_address2'), 'Jl. Testing Hari No.3')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Address (Line 2)_address2'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__city'), 'Jakarta')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__city'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.selectOptionByValue(findTestObject('Sign Up/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '6', true)

WebUI.verifyOptionSelectedByValue(findTestObject('Sign Up/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '6', true, 0)

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__postcode'), '12877')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__postcode'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/textarea_Additional information_other'), 'testing')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/textarea_Additional information_other'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input_Home phone_phone'), '085777641438')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input_Home phone_phone'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

//WebUI.click(findTestObject('Sign Up/Page_Login - My Store/form_Your personal informationTitleMr.Mrs.F_d0cf3f'))
WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__phone_mobile'), '085777641438')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__phone_mobile'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.setText(findTestObject('Sign Up/Page_Login - My Store/input__alias'), 'My addresst')

WebUI.getAttribute(findTestObject('Sign Up/Page_Login - My Store/input__alias'), 'url(../img/icon/form-ok.png) 98% 5px no-repeat #ddf9e1')

WebUI.click(findTestObject('Sign Up/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

