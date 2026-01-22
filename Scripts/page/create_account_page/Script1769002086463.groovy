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

if(WebUI.waitForElementVisible(findTestObject('Object Repository/Create Account/title_page'), 30)) {
	WebUI.verifyElementVisible(findTestObject('Object Repository/Create Account/title_page'))
	
	//account details
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "usernameRegisterPage"]), usernameRegisterPage)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "emailRegisterPage"]), emailRegisterPage)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "passwordRegisterPage"]), passwordRegisterPage)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "confirm_passwordRegisterPage"]), passwordRegisterPage)
	
	//personal details
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "first_nameRegisterPage"]), firstName)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "last_nameRegisterPage"]), lastName)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "phone_numberRegisterPage"]), phoneNumber)
	
	//address
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Create Account/select_option_country'), "Indonesia", false)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "cityRegisterPage"]), city)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "addressRegisterPage"]), address)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "state_/_province_/_regionRegisterPage"]), province)
	WebUI.setText(findTestObject('Object Repository/Create Account/input_field', ["name" : "postal_codeRegisterPage"]), postalCode)
	
	//agreement
	WebUI.click(findTestObject('Object Repository/Create Account/checkbox_agree'))
	WebUI.verifyElementChecked(findTestObject('Object Repository/Create Account/checkbox_agree'), 10)
	
	WebUI.click(findTestObject('Object Repository/Create Account/button_register'))
	
}