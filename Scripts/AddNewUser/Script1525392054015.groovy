import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('WebURL').getValue(1, 1))

WebUI.click(findTestObject('Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(1, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(2, 1))

WebUI.sendKeys(findTestObject('Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AfterLogin/span_Users'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AddUser/a_Add User'))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center AddUser/input_firstNameAdd'), findTestData('AddNewUser').getValue(1, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center AddUser/input_lastNameAdd'), findTestData('AddNewUser').getValue(2, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center AddUser/input_emailAdd'), findTestData('AddNewUser').getValue(3, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center AddUser/input_officerIdAdd'), findTestData('AddNewUser').getValue(4, 1))

WebUI.setText(findTestObject('Page_COBAN COMMAND Center AddUser/input_passwordOfficerAdd'), findTestData('AddNewUser').getValue(
        5, 1))

WebUI.check(findTestObject('Page_COBAN COMMAND Center AddUser/input_userActive'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AddUser/Create_User_Button'))

WebUI.click(findTestObject('Page_COBAN COMMAND Center AddUser/p_The user was successfully sa'))

WebUI.closeBrowser()

