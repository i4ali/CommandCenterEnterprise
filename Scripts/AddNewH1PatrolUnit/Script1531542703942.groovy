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

WebUI.click(findTestObject('HomePage/span_Patrol Units'))

WebUI.click(findTestObject('HomePage/PatrolUnitsPage/a_FOCUS H1'))

WebUI.click(findTestObject('HomePage/PatrolUnitsPage/DeviceSpecificPage/a_Create Unit'))

WebUI.setText(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/input_patrolUnitNameAdd'), findTestData('AddNewH1PatrolUnit').getValue(
        1, 1))

WebUI.setText(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/input_descriptionAdd'), findTestData('AddNewH1PatrolUnit').getValue(
        2, 1))

WebUI.selectOptionByValue(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/select_template_type'), '44', 
    true)

WebUI.selectOptionByValue(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/select_template'), '5', 
    true)

WebUI.selectOptionByValue(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/select_Base Station'), '1', true)

WebUI.click(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/input_patrolUnitActive'))

WebUI.click(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/input_append'))

WebUI.waitForElementPresent(findTestObject('HomePage/PatrolUnitsPage/CreateUnitPage/p_Saved unit succeeded unit_id'), 30)

WebUI.closeBrowser()

