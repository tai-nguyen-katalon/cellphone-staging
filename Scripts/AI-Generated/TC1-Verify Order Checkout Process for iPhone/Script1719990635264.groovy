import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillShippingAddressAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.common.navigateToPhoneCategoryAndFilterByPrice
import katalon.common.selectIPhoneAndPlaceOrder

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Navigate to phone category and filter by price range"

navigateToPhoneCategoryAndFilterByPrice.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select iPhone, choose specifications, and place order"

selectIPhoneAndPlaceOrder.execute()

"Step 4: Click on button increased"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on button increased.png')

"Step 5: Click on button proceedCheckout"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button proceedCheckout.png')

"Step 6: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Click on radio cashOnDelivery"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on radio cashOnDelivery.png')

"Step 8: Click on button completeOrder -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on button completeOrder - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Order Checkout Process for iPhone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
