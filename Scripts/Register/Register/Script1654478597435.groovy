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

Mobile.startApplication('C:\\Users\\fathi\\Downloads\\Register_v2.0_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Name'), 'yuni', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Phone'), '081285846465', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Alternate phones (one per line)'), '081317288360', 
    0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Email'), 'yuni@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Alternate emails (one per line)'), 'yuni2@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Notes'), 'new register', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView (1)'), 0)

Mobile.closeApplication()

