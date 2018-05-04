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

WebUI.navigateToUrl('http://cbsccube9:803/#/login')

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_UserName'), '4777')

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), '123')

WebUI.sendKeys(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AfterLogin/span_Officer Dashboard'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Uploaded Videos/img_uiafter'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Uploaded Videos/a_Open'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AutoDVDExport/a_Export'))

WebUI.selectOptionByValue(findTestObject('Page_COBAN COMMAND Center AutoDVDExport/select_Local'), 'AutoDVD', true)

WebUI.selectOptionByValue(findTestObject('Page_COBAN COMMAND Center AutoDVDExport/select_-- Select a server --'), '3', true)

WebUI.click(findTestObject('Page_COBAN COMMAND Center AutoDVDExport/a_Submit for Export'))

WebUI.waitForElementPresent(findTestObject('Page_COBAN COMMAND Center AutoDVDExport/p_AutoDVD export request succe'), 10)

WebUI.closeBrowser()

