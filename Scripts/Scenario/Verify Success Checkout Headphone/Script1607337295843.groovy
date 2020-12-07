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

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/a_Buy now'))

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Email_Input.Email'), 'citracamila20@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DemoShop/input_Password_Input.Password'), '8wkTjk+rrzEk3z355PUADw==')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/input_Remember me_Input.RememberMe'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Direct payment'))

WebUI.click(findTestObject('Object Repository/Page_Payment Gateway/h5_Test Bank 2'))

WebUI.setText(findTestObject('Object Repository/Page_Log in - BankSystem/input_Email_Input.Email'), 'citracamila20@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in - BankSystem/input_Password_Input.Password'), '8wkTjk+rrzEk3z355PUADw==')

WebUI.click(findTestObject('Object Repository/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Confirm payment - BankSystem/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Confirm payment - BankSystem/button_Pay 30.00'))

WebUI.verifyElementHasAttribute(findTestObject('Button Success'), 'Success', 5)

