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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/img_Grocery__2puWtW _3a3qyb'))

WebUI.setText(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/input_Plus_q'), 'nothing')

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Nothing- Buy Products Online at Best P_97b95d/img_Bestseller_DByuf4'))

WebUI.switchToWindowTitle('Nothing Phone (3a) ( 128 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com')

WebUI.setText(findTestObject('Object Repository/Page_Nothing Phone (3a) ( 128 GB Storage, 8_040d65/input_Delivery_pincodeInputId'), 
    '534003')

WebUI.click(findTestObject('Object Repository/Page_Nothing Phone (3a) ( 128 GB Storage, 8_040d65/span_Check'))

WebUI.closeBrowser()

