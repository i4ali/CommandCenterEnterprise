import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('WebURL').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/select_Main ServertestLocation'), '7', true)

WebUI.click(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(
        1, 1))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/img_lock'))

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/a_Logout'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/span_Location Location 10 (cha'), 30)

WebUI.executeJavaScript('localStorage.clear()', [])

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/div_Select a location'), 30)

WebUI.closeBrowser()

