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

WebUI.openBrowser(url)

WebUI.setText(findTestObject('SauceDemo/input_username'), login)

WebUI.setText(findTestObject('SauceDemo/input_password'), password)

WebUI.click(findTestObject('SauceDemo/button_login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('SauceDemo/button_ADD TO CART'))

WebUI.click(findTestObject('SauceDemo/div_Open Menu_shopping_cart_container'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementText(findTestObject('SauceDemo/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

