import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.lang.ref.ReferenceQueue.Null as Null
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
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('SuccessfulLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/span_Officer Dashboard'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/a_Courier'))

WebUI.waitForElementPresent(findTestObject('HomePage/OfficerDashboardPage/CourierPage/courier_table'), 30)

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CourierPage/input_ch1'))

WebUI.click(findTestObject('HomePage/OfficerDashboardPage/CourierPage/input_expbtn'))

'Define Custom Path where file needs to be downloaded'
String downloadPath = 'C:\\temp'

'Wait for Some time so that file gets downloaded and Stored in user defined path'
WebUI.delay(10)

'Verifying the file is download in the User defined Path'
Assert.assertTrue(isFileDownloaded(downloadPath, '.csv'), 'Failed to download Expected document')

WebUI.closeBrowser() //Iterating a loop for number of files available in the folder to verify file name in the folder

boolean isFileDownloaded(String downloadPath, String fileName) {
    boolean flag = false

    'Creating an object for File and passing the download Path as argument'
    File dir = new File(downloadPath)

    'Creating an Array where it will store all the files from that folder'
    File[] dir_contents = dir.listFiles()

    for (int i = 0; i < dir_contents.length; i++) {
        println('File Name at 0 is : ' + dir_contents[i].getName())

        'Verifying the file name is available in the folder '
        if (dir_contents[i].getName().contains(fileName)) {
            'If the file is found then it will return a value as true'
            return flag = true
        }
    }
    
    'If the file is found then it will return a value as false'
    return flag
}

