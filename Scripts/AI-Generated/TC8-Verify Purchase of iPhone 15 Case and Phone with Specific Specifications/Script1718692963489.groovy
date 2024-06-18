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

"Step 2: Hover over item accessories"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2: Hover over item accessories.png')

"Step 3: Click on link appleCategory -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_appleCategory'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3: Click on link appleCategory - Navigate to page category.png')

"Step 4: Enter input value in input priceMin"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Enter input value in input priceMin.png')

"Step 5: Enter input value in input priceMax"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5: Enter input value in input priceMax.png')

"Step 6: Click on button show6"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show6'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on button show6.png')

"Step 7: Click on button iPhone15Case2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_iPhone15Case2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on button iPhone15Case2.png')

"Step 8: Click on label dialogLabel"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_dialogLabel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8: Click on label dialogLabel.png')

"Step 9: Click on button buyDialog2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9: Click on button buyDialog2.png')

"Step 10: Hover over item phone2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phone2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10: Hover over item phone2.png')

"Step 11: Enter input value in input priceMin"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min_1)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11: Enter input value in input priceMin.png')

"Step 12: Enter input value in input priceMax"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max_1)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12: Enter input value in input priceMax.png')

"Step 13: Click on button show6"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show6'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13: Click on button show6.png')

"Step 14: Click on link iPhone15 -> Navigate to page 'product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14: Click on link iPhone15 - Navigate to page product.png')

"Step 15: Click on label 128Gb"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15: Click on label 128Gb.png')

"Step 16: Click on label blue"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16: Click on label blue.png')

"Step 17: Click on button btn1"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_btn1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17: Click on button btn1.png')

"Step 18: Click on button buy"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18: Click on button buy.png')

"Step 19: Provide shipping details and proceed to payment"

inputShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Click on radio cashOnDelivery"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20: Click on radio cashOnDelivery.png')

"Step 21: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21: Click on button completeOrder - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Purchase of iPhone 15 Case and Phone with Specific Specifications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
