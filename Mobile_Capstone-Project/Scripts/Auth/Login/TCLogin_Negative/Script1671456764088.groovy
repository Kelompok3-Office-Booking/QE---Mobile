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


// 3

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update (1) 13-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Emailexamplegmail.com'), '',
	0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), '', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View'), 0)
//
Mobile.delay(2)

Mobile.closeApplication()

// 4

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update (1) 13-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Emailexamplegmail.com'), '',
	0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), GlobalVariable.globalPass, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View'), 0)
//
Mobile.delay(2)

Mobile.closeApplication()

// 5

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update (1) 13-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Emailexamplegmail.com'), GlobalVariable.globalEmail,
	0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), '', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View'), 0)
//
Mobile.delay(2)

Mobile.closeApplication()

// 6

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update (1) 13-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Emailexamplegmail.com'), GlobalVariable.globalInvalidEmail,
	0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), GlobalVariable.globalPass, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View'), 0)
//
Mobile.delay(2)

Mobile.closeApplication()

// 7

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update (1) 13-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Emailexamplegmail.com'), GlobalVariable.globalEmail,
	0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), GlobalVariable.globalInvalidPass, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View'), 0)
//
Mobile.delay(2)

Mobile.closeApplication()