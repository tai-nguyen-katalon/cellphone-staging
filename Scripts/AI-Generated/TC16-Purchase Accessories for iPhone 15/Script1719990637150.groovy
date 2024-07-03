import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.browseAndSelectAccessoriesForIPhone15
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Browse and select accessories for iPhone 15"

browseAndSelectAccessoriesForIPhone15.execute()

"Step 3: Click on label black"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_black'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3: Click on label black.png')

"Step 4: Click on button buyDialog2"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4: Click on button buyDialog2.png')

"Step 5: Click on link placeOrderCart2 -> Navigate to page '/cart'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_placeOrderCart2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5: Click on link placeOrderCart2 - Navigate to page cart.png')

"Step 6: Click on button increased"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6: Click on button increased.png')

"Step 7: Click on button proceedCheckout -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7: Click on button proceedCheckout - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Purchase Accessories for iPhone 15_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
