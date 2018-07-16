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

WebUI.callTestCase(findTestCase('SuccessfulLogin'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.openBrowser('')

//WebUI.navigateToUrl(findTestData('WebURL').getValue(1, 1))

//WebUI.waitForAngularLoad(30)

//WebUI.click(findTestObject('LoginPage/input'))

//WebUI.setText(findTestObject('LoginPage/input_UserName'), findTestData('LoginCredentials').getValue(
        //1, 1))

//WebUI.setText(findTestObject('LoginPage/input_Password'), findTestData('LoginCredentials').getValue(
        //2, 1))

//WebUI.sendKeys(findTestObject('LoginPage/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HomePage/span_Officer Dashboard'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/span_Cases'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/a_Create Case'))

WebUI.setText(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/assigned-to'), findTestData('AddNewCase').getValue(
        1, 1))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/a_4777'))

WebUI.setText(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/input_caseName'), findTestData('AddNewCase').getValue(
        2, 1))

WebUI.setText(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/input_description'), findTestData('AddNewCase').getValue(
        3, 1))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/button_ddList'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/label_Default Event'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CasesPage/CreateCase/input_1'))

WebUI.verifyTextPresent(findTestData('AddNewCase').getValue(2, 1), false)

WebUI.closeBrowser()

