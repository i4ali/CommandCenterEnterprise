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

WebUI.click(findTestObject('HomePage/span_Templates'))

WebUI.click(findTestObject('HomePage/TemplatesPage/a_FOCUS H1'))

WebUI.click(findTestObject('HomePage/TemplatesPage/a_Add Template'))

WebUI.setText(findTestObject('HomePage/TemplatesPage/AddTemplate/input_templateNameAdd'), findTestData('AddNewH1Template').getValue(
        1, 1))

WebUI.setText(findTestObject('HomePage/TemplatesPage/AddTemplate/input_descriptionAdd'), findTestData('AddNewH1Template').getValue(
        2, 1))

WebUI.click(findTestObject('HomePage/TemplatesPage/AddTemplate/input_append'))

WebUI.waitForElementPresent(findTestObject('HomePage/TemplatesPage/AddTemplate/p_Template saved successfully.'), 30)

WebUI.closeBrowser()

