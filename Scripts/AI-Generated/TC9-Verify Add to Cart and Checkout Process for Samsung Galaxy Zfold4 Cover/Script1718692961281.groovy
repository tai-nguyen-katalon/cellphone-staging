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

"Step 2: Hover over div productsSlider"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_productsSlider'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2: Hover over div productsSlider.png')

"Step 3: Click on div productsSliderWrapper"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productsSliderWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3: Click on div productsSliderWrapper.png')

"Step 4: Hover over link productsSliderNext"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4: Hover over link productsSliderNext.png')

"Step 5: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5: Click on link productsSliderNextChevron.png')

"Step 6: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6: Click on link productsSliderNextChevron.png')

"Step 7: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7: Click on link productsSliderNextChevron.png')

"Step 8: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8: Click on link productsSliderNextChevron.png')

"Step 9: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9: Click on link productsSliderNextChevron.png')

"Step 10: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10: Click on link productsSliderNextChevron.png')

"Step 11: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11: Click on link productsSliderNextChevron.png')

"Step 12: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12: Click on link productsSliderNextChevron.png')

"Step 13: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13: Click on link productsSliderNextChevron.png')

"Step 14: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14: Click on link productsSliderNextChevron.png')

"Step 15: Click on link productsSliderNextChevron"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15: Click on link productsSliderNextChevron.png')

"Step 16: Hover over div samsungGalaxyZfold4Cover"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_samsungGalaxyZfold4Cover'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16: Hover over div samsungGalaxyZfold4Cover.png')

"Step 17: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17: Click on button addToCart.png')

"Step 18: Click on link placeOrderCart2 -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeOrderCart2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18: Click on link placeOrderCart2 - Navigate to page cart.png')

"Step 19: Click on button increased"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19: Click on button increased.png')

"Step 20: Click on button proceedCheckout"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20: Click on button proceedCheckout.png')

"Step 21: Provide shipping details and proceed to payment"

inputShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 22: Click on radio cashOnDelivery"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22: Click on radio cashOnDelivery.png')

"Step 23: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23: Click on button completeOrder - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Add to Cart and Checkout Process for Samsung Galaxy Zfold4 Cover_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
