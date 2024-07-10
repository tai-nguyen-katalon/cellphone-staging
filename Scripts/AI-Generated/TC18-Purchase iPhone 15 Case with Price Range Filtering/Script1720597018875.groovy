import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.enterShippingDetailsAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to category/*"

TrueTestScripts.navigate("category/${GlobalVariable.category_id}")

"Step 2: Enter input value in input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), var_1_input_priceMin)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2: Enter input value in input priceMin.png')

"Step 3: Enter input value in input priceMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), var_2_input_priceMax)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3: Enter input value in input priceMax.png')

"Step 4: Click on button show0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show0'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4: Click on button show0.png')

"Step 5: Click on button iPhone15Case2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_saleMagSafeCharger9900'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5: Click on button iPhone15Case2.png')

"Step 6: Click on label dialogLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_256Gb'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6: Click on label dialogLabel.png')

"Step 7: Click on button buyDialog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7: Click on button buyDialog2.png')

"Step 8: Hover over item phone2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phone2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8: Hover over item phone2.png')

"Step 9: Enter input value in input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), var_3_input_priceMin)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9: Enter input value in input priceMin.png')

"Step 10: Enter input value in input priceMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), var_4_input_priceMax)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10: Enter input value in input priceMax.png')

"Step 11: Click on button show0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show0'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11: Click on button show0.png')

"Step 12: Click on link iPhone15 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12: Click on link iPhone15 - Navigate to page product.png')

"Step 13: Click on label 128Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13: Click on label 128Gb.png')

"Step 14: Click on label blue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14: Click on label blue.png')

"Step 15: Click on button btn1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_btn1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 15: Click on button btn1.png')

"Step 16: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 16: Click on button buy.png')

"Step 17: Provide shipping information, select shipping method, and continue to payment"

enterShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on radio cashOnDelivery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18: Click on radio cashOnDelivery.png')

"Step 19: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19: Click on button completeOrder - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Purchase iPhone 15 Case with Price Range Filtering_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}