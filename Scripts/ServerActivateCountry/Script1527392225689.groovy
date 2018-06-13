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

WebUI.navigateToUrl('http://cbsccube8:803/#/locationselect')

WebUI.selectOptionByValue(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/select_Main ServerLocation 9Lo'), '7', true)

WebUI.click(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/input'))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_UserName'), '4777')

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), '123')

WebUI.sendKeys(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/span_Servers'))

WebUI.click(findTestObject('ServersPage/a_Miscellaneous'))

WebUI.click(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/h3_StatesProvinces'))

WebUI.click(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/img'))

WebUI.check(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/input_isActive'))

WebUI.click(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/input_info-wrp-submit'))

WebUI.waitForElementPresent(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/p_The Country was successfully'), 
    10)

WebUI.refresh()

WebUI.click(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/img'))

WebUI.verifyElementChecked(findTestObject('ServersPage/MiscellaneousPage/Page_COBAN COMMAND Center Server Miscellaneous/input_isActive'), 10)

WebUI.closeBrowser()

