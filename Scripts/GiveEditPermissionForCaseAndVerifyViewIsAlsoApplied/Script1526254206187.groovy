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

'Needs a case before this can be executed'
WebUI.navigateToUrl(findTestData('WebURL').getValue(1, 1))

WebUI.click(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(
        1, 1))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(
        2, 1))

WebUI.click(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input'))

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/span_Officer Dashboard'))

WebUI.click(findTestObject('OfficerDashboard/Page_COBAN COMMAND Center OfficerDashboard/span_Cases'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Cases/span_Case TestImranEvent Type'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/a_ Add'))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_users'), findTestData('PermissionUser').getValue(
        1, 1))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/a_Khan Qaiser'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_editUsr'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_submit'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_PermissionChange'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/img_img-wrp'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_user_group'))

WebUI.verifyElementChecked(findTestObject('Page_COBAN COMMAND Center CaseDetails/input_viewUsr'), 30)

WebUI.closeBrowser()

