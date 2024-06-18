import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.inputShippingDetailsAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link categorySamsung -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categorySamsung'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2: Click on link categorySamsung - Navigate to page category.png')

"Step 3: Click on button productsItemInStock"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_productsItemInStock'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3: Click on button productsItemInStock.png')

"Step 4: Click on label dialogLabel"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_dialogLabel'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4: Click on label dialogLabel.png')

"Step 5: Click on button buyDialog2 -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5: Click on button buyDialog2 - Navigate to page cart.png')

"Step 6: Click on button increased"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6: Click on button increased.png')

"Step 7: Click on button proceedCheckout"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7: Click on button proceedCheckout.png')

"Step 8: Provide shipping details and proceed to payment"

inputShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on radio cashOnDelivery"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9: Click on radio cashOnDelivery.png')

"Step 10: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10: Click on button completeOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Purchase of Samsung Category Product with Cash On Delivery_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
