import katalon.common.inputShippingDetailsAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.addIPhone15CaseAndProceedToCheckout
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Hover over item accessories.png')

"Step 3: Click on link accessoriesCategory -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_accessoriesCategory'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Click on link accessoriesCategory - Navigate to page category.png')

"Step 4: Click on link sortByPrice"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on link sortByPrice.png')

"Step 5: Click on link sortByPrice"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Click on link sortByPrice.png')

"Step 6: Add iPhone 15 case, increase quantity, and proceed to checkout"

addIPhone15CaseAndProceedToCheckout.execute()

"Step 7: Provide shipping details and proceed to payment"

inputShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on radio cashOnDelivery"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on radio cashOnDelivery.png')

"Step 9: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9: Click on button completeOrder - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Purchase of iPhone 15 Case with Quantity Increase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
