import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillShippingAddressAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.common.navigateToPhoneCategoryAndFilterByPrice

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

"Step 3: Click on link iPhone15 -> Navigate to page 'product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3: Click on link iPhone15 - Navigate to page product.png')

"Step 4: Click on label 128Gb"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4: Click on label 128Gb.png')

"Step 5: Click on label blue"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5: Click on label blue.png')

"Step 6: Click on link placeOrderCart2 -> Navigate to page '/cart'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrderCart2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6: Click on link placeOrderCart2 - Navigate to page cart.png')

"Step 7: Click on button increased"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7: Click on button increased.png')

"Step 8: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Click on radio cashOnDelivery"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9: Click on radio cashOnDelivery.png')

"Step 10: Click on button completeOrder -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10: Click on button completeOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Complete Order with Cash on Delivery for iPhone 15 Blue 128GB_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
