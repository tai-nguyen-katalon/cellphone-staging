import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.purchaseAccessoriesAndProceedToCheckout
import katalon.common.fillShippingAddressAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.common.exploreAppleAccessoriesAndFilterByPrice

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Explore Apple accessories and filter by price range"

exploreAppleAccessoriesAndFilterByPrice.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button addToCart"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3: Click on button addToCart.png')

"Step 4: Purchase accessories and proceed to checkout"

purchaseAccessoriesAndProceedToCheckout.execute()

"Step 5: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on radio cashOnDelivery"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6: Click on radio cashOnDelivery.png')

"Step 7: Click on button completeOrder -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7: Click on button completeOrder - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Add Accessories to Cart and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
