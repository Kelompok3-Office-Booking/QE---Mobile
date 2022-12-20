import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Homepage/Voucher/TCVoucher'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Search/TCSearch_Building'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Recommendation/TCOffices_Recommendation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Popular/TCPopular'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Office_for_Rent/TCOffice_For_Rent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Meeting_Rooms/TCMeeting_Room'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Notification/TCNotification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Homepage/Booking_Offices/TCBooking_Offices'), [:], FailureHandling.STOP_ON_FAILURE)

