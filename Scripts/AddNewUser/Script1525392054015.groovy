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

WebUI.callTestCase(findTestCase('SuccessfulLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/span_Users'))

WebUI.click(findTestObject('HomePage/UsersPage/a_Add User'))

WebUI.setText(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_firstNameAdd'), findTestData('AddNewUser').getValue(
        1, 1))

WebUI.setText(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_lastNameAdd'), findTestData('AddNewUser').getValue(
        2, 1))

WebUI.setText(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_emailAdd'), findTestData('AddNewUser').getValue(
        3, 1))

WebUI.setText(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_officerIdAdd'), findTestData('AddNewUser').getValue(
        4, 1))

WebUI.setText(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_passwordOfficerAdd'), findTestData('AddNewUser').getValue(
        5, 1))

WebUI.check(findTestObject('HomePage/UsersPage/CreateNewUserPage/input_userActive'))

WebUI.click(findTestObject('HomePage/UsersPage/CreateNewUserPage/Create_User_Button'))

WebUI.waitForElementPresent(findTestObject('HomePage/UsersPage/CreateNewUserPage/p_The user was successfully sa'), 30)

WebUI.closeBrowser()

