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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://banksystem-2.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Home - BankSystem/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Log in - BankSystem/input_Email_Input.Email'), 'citracamila20@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in - BankSystem/input_Password_Input.Password'), '8wkTjk+rrzEk3z355PUADw==')

WebUI.click(findTestObject('Object Repository/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Home Page - BankSystem/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Home Page - BankSystem/a_Money transfers'))

WebUI.click(findTestObject('Object Repository/Page_Home Page - BankSystem/a_New Transfer'))

WebUI.click(findTestObject('Object Repository/Page_Payment types - BankSystem/a_Create new payment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create internal money transfer - BankSystem/select_Select source account...            _db5e96'), 
    'ad1481b4-49b0-477a-8dbd-bd3c2d605e89', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create internal money transfer - BankSystem/select_...or choose another one of your acc_711723'), 
    'CBAN97952511', true)

WebUI.setText(findTestObject('Object Repository/Page_Create internal money transfer - BankSystem/input__Amount'), '20')

WebUI.setText(findTestObject('Object Repository/Page_Create internal money transfer - BankSystem/input_(optional)_Description'), 
    'Transfer')

WebUI.click(findTestObject('Object Repository/Page_Create internal money transfer - BankSystem/button_Pay'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Page - BankSystem/p_Money transfer was successful'))

