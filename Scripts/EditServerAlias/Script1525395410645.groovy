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

WebUI.click(findTestObject('Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(1, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(2, 1))

WebUI.sendKeys(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AfterLogin/span_Servers'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Servers/a_Servers'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Servers/a_Sub'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Servers/a_Open'))

WebUI.waitForPageLoad(10)

WebUI.clearText(findTestObject('Page_COBAN COMMAND Center ServerGeneral/input_serverAlias'))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center ServerGeneral/input_serverAlias'), 'test')

WebUI.click(findTestObject('Page_COBAN COMMAND Center ServerGeneral/input'))

WebUI.waitForElementPresent(findTestObject('Page_COBAN COMMAND Center ServerGeneral/p_The server was successfully'), 10)

WebUI.refresh()

result = WebUI.getText(findTestObject('Page_COBAN COMMAND Center ServerGeneral/span_Server test'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(result, false)

WebUI.closeBrowser()

