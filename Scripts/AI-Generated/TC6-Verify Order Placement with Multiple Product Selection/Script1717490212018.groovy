import katalon.common.completeCheckoutProcess
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_productsSlider'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3: Hover over div.png')

"Step 3: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productsSliderWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on div.png')

"Step 4: Hover over link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Hover over link.png')

"Step 5: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on link.png')

"Step 6: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on link.png')

"Step 7: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8: Click on link.png')

"Step 8: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on link.png')

"Step 9: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10: Click on link.png')

"Step 10: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11: Click on link.png')

"Step 11: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12: Click on link.png')

"Step 12: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13: Click on link.png')

"Step 13: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14: Click on link.png')

"Step 14: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15: Click on link.png')

"Step 15: Click on link"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNextChevron'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16: Click on link.png')

"Step 16: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_samsungGalaxyZfold4Cover'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17: Hover over div.png')

"Step 17: Click on button 'Add to cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18: Click on button Add to cart.png')

"Step 18: Click on link 'Place an order' -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeOrderCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19: Click on link Place an order - Navigate to page cart.png')

"Step 19: Click on button 'Increased'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20: Click on button Increased.png')

"Step 20: Proceed through checkout steps, provide shipping info, select payment method, and complete order"

completeCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
