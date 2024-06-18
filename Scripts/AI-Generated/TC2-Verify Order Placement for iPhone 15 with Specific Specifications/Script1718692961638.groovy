import katalon.common.inputShippingDetailsAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.browseAndFilterPhonesByPrice
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.selectIPhone15SpecificationsAndPlaceOrder

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Browse and filter phones by price range"

browseAndFilterPhonesByPrice.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select iPhone 15 specifications and place order"

selectIPhone15SpecificationsAndPlaceOrder.execute()

"Step 4: Click on button increased"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on button increased.png')

"Step 5: Click on button proceedCheckout"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button proceedCheckout.png')

"Step 6: Provide shipping details and proceed to payment"

inputShippingDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Click on radio cashOnDelivery"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on radio cashOnDelivery.png')

"Step 8: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on button completeOrder - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Order Placement for iPhone 15 with Specific Specifications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
