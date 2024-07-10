import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div productsItemWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productsItemWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2: Click on div productsItemWrapper.png')

"Step 3: Click on div iLikeWorkingWithThe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_iLikeWorkingWithThe'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3: Click on div iLikeWorkingWithThe.png')

"Step 4: Click on div iLikeWorkingWithThe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_iLikeWorkingWithThe'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4: Click on div iLikeWorkingWithThe.png')

"Step 5: Click on div iLikeWorkingWithThe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_iLikeWorkingWithThe'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5: Click on div iLikeWorkingWithThe.png')

"Step 6: Click on image jackFrequentBuyer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_jackFrequentBuyer'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6: Click on image jackFrequentBuyer - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Verify Product Selection and User Preferences on Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}