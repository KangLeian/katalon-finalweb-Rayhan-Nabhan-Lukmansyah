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
import utils.navMenu as Menu

WebUI.waitForPageLoad(90)
WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Home/nav_menu', ["menu" : Menu.OUR_PRODUCTS.getLabel()])), Menu.OUR_PRODUCTS.getLabel(), false)
WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Home/nav_menu', ["menu" : Menu.SPECIAL_OFFER.getLabel()])), Menu.SPECIAL_OFFER.getLabel(), false)
WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Home/nav_menu', ["menu" : Menu.CONTACT_US.getLabel()])), Menu.CONTACT_US.getLabel(), false)
WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Home/nav_menu', ["menu" : Menu.POPULAR_ITEMS.getLabel()])), Menu.POPULAR_ITEMS.getLabel(), false)

if(category !== '' && product !== ''  && email !== ''  && subject !== '') {	
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Home/contact_us/select_product', ["id" : "categoryListboxContactUs"]), category, false)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Home/contact_us/select_product', ["id" : "productListboxContactUs"]), product, false)
	WebUI.setText(findTestObject('Object Repository/Home/contact_us/input_email'), email)
	WebUI.setText(findTestObject('Object Repository/Home/contact_us/input_subject'), subject)
	WebUI.click(findTestObject('Object Repository/Home/contact_us/button_send'))
	if(errorMessage !== '') {
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Home/contact_us/label_error')), errorMessage, false)
	}
}
