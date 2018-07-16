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

WebUI.click(findTestObject('HomePage/span_Servers'))

WebUI.click(findTestObject('HomePage/ServersPage/a_Servers'))

WebUI.click(findTestObject('HomePage/ServersPage/ServersPage/a_Sub'))

WebUI.click(findTestObject('HomePage/ServersPage/ServersPage/SubPage/a_Open'))

WebUI.verifyElementPresent(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/a_Scheduled Tasks'), 30)

WebUI.scrollToElement(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/a_Scheduled Tasks'), 30)

WebUI.waitForElementVisible(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/a_Scheduled Tasks'), 30)

WebUI.click(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/a_Scheduled Tasks'))

WebUI.click(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/a_Auto Export'))

WebUI.selectOptionByValue(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/select_DailyWeekly'), 'Weekly', true)

WebUI.verifyElementPresent(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/input_update-button'), 30)

WebUI.click(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/input_update-button'))

WebUI.waitForElementPresent(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/p_The server was successfully'), 
    10)

WebUI.verifyOptionPresentByValue(findTestObject('HomePage/ServersPage/ServersPage/ServerConfig/ScheduledTasks/Page_COBAN COMMAND Center ScheduleAutoExport/select_DailyWeekly'), 'Weekly', 
    true, 30)

WebUI.closeBrowser()

