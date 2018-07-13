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

WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(
        1, 1))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/span_Officer Dashboard'))

WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('OfficerDashboard/Page_COBAN COMMAND Center Uploaded Videos/img_uiafter'))

WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('DVDExport/Page_COBAN COMMAND Center DVDExport/a_Export'))

WebUI.waitForAngularLoad(30)

WebUI.selectOptionByValue(findTestObject('DVDExport/Page_COBAN COMMAND Center DVDExport/select_Local'), 'AutoDVD', true)

WebUI.selectOptionByLabel(findTestObject('DVDExport/Page_COBAN COMMAND Center DVDExport/select_-- Select a server --'), 
    '2000i Rimage', false)

WebUI.click(findTestObject('DVDExport/Page_COBAN COMMAND Center DVDExport/a_Submit for Export'))

WebUI.waitForElementPresent(findTestObject('DVDExport/Page_COBAN COMMAND Center DVDExport/p_AutoDVD export request succe'), 
    10)

WebUI.closeBrowser()

