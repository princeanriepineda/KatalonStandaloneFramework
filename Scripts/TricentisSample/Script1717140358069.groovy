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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sampleapp.tricentis.com/101/index.php')

WebUI.click(findTestObject('Object Repository/Tricentis/Page_Tricentis Vehicle Insurance/a_Automobile'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/select_please select                       _4f72fa'), 
    'Nissan', true)

WebUI.setText(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/input_Engine Performance kW_kW'), '1200')

WebUI.setText(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/input_Date of Manufacture_Date of Manufacture'), 
    '02/23/1996')

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/select_please select                       _9e925e'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/select_please select                       _b55154'), 
    'Diesel', true)

WebUI.setText(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/input_List Price_List Price'), '1200')

WebUI.setText(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/input_Annual Mileage mi_Annual Mileage'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Tricentis/Page_Enter Vehicle Data/button_Next'))

WebUI.closeBrowser()

