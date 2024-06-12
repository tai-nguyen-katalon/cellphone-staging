import katalon.common.checkoutAndCompleteOrder
import katalon.common.viewAndFilterAppleAccessories
import katalon.common.viewAndBuyIPhone15Configuration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Navigate to Apple accessories category and filter by price range"

viewAndFilterAppleAccessories.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button iPhone15Case2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_iPhone15Case2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on button iPhone15Case2.png')

"Step 4: Click on label dialogLabel"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_dialogLabel'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on label dialogLabel.png')

"Step 5: Click on button buyDialog2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on button buyDialog2.png')

"Step 6: Hover over item phone2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phone2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Hover over item phone2.png')

"Step 7: Click on link phoneCategory2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_phoneCategory2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on link phoneCategory2.png')

"Step 8: Enter input value in input priceMin"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Enter input value in input priceMin.png')

"Step 9: Enter input value in input priceMax"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Enter input value in input priceMax.png')

"Step 10: Click on button show6"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show6'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on button show6.png')

"Step 11: View and buy specific configuration of iPhone 15"

viewAndBuyIPhone15Configuration.execute()

"Step 12: Provide shipping information and select payment method to complete order"

checkoutAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Purchase of iPhone 15 Case and Specific Phone Configuration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
