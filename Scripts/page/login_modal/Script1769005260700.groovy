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

WebUI.waitForElementClickable(findTestObject('Object Repository/Navigation/user_icon'), 30)
WebUI.click(findTestObject('Object Repository/Navigation/user_icon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Login Modal/login_modal'), 30)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Login Modal/label_sign_in_result')), "OR", false)
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Login Modal/button_sign_in'))

if(username == '' || password == '') {
	WebUI.click(findTestObject('Object Repository/Login Modal/link_create_new_account'))
}else {
	WebUI.setText(findTestObject('Object Repository/Login Modal/input_username_password', ['name' : 'username']), username)
	WebUI.setText(findTestObject('Object Repository/Login Modal/input_username_password', ['name' : 'password']), password)
	WebUI.click(findTestObject('Object Repository/Login Modal/button_sign_in'))
	
	if(errorMessage !== "") {	
		WebUI.waitForPageLoad(30)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Login Modal/label_sign_in_result')), errorMessage, false)
	}else {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Navigation/label_username'), 30)
	}
}