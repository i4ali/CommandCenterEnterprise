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

WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input'))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_UserName'), findTestData('LoginCredentials').getValue(
        1, 1))

WebUI.setText(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), findTestData('LoginCredentials').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('LoginPage/Page_COBAN COMMAND Center Login/input_Password'), Keys.chord(Keys.ENTER))

WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('HomePage/Page_COBAN COMMAND Center HomePage/span_Users'))

WebUI.click(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/a_Add User'))

WebUI.setText(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_firstNameAdd'), findTestData('AddNewUser').getValue(
        1, 1))

WebUI.setText(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_lastNameAdd'), findTestData('AddNewUser').getValue(
        2, 1))

WebUI.setText(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_emailAdd'), findTestData('AddNewUser').getValue(
        3, 1))

WebUI.setText(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_officerIdAdd'), findTestData('AddNewUser').getValue(
        4, 1))

WebUI.setText(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_passwordOfficerAdd'), findTestData('AddNewUser').getValue(
        5, 1))

WebUI.check(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/input_userActive'))

WebUI.click(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/Create_User_Button'))

WebUI.click(findTestObject('UsersPage/Page_COBAN COMMAND Center UsersPage/p_The user was successfully sa'))

WebUI.closeBrowser()

