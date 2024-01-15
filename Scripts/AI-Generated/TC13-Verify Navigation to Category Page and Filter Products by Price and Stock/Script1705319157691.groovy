import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page cart'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart')

'step 2: At Page cart click on hyperlink go to cart'

testObj = findTestObject('AI-Generated/Page_cart/hyperlink_go_to_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page cart click on hyperlink go to cart'

testObj = findTestObject('AI-Generated/Page_cart/hyperlink_go_to_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page cart click on hyperlink --> navigate to Page category accessories'

testObj = findTestObject('AI-Generated/Page_cart/hyperlink')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page category accessories click on hyperlink category accessories'

testObj = findTestObject('AI-Generated/Page_category_accessories/hyperlink_category_accessories')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page category accessories click on hyperlink category accessories'

testObj = findTestObject('AI-Generated/Page_category_accessories/hyperlink_category_accessories')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page category accessories input on input price min'

testObj = findTestObject('AI-Generated/Page_category_accessories/input_price_min')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_price_min)

'step 8: At Page category accessories input on input price max'

testObj = findTestObject('AI-Generated/Page_category_accessories/input_price_max')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_price_max)

'step 9: At Page category accessories click on input in stock'

testObj = findTestObject('AI-Generated/Page_category_accessories/input_in_stock')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page category accessories click on button object'

testObj = findTestObject('AI-Generated/Page_category_accessories/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page category accessories click on hyperlink product apple iphone silicone case with --> navigate to Page product apple-iphone-15-new'

testObj = findTestObject('AI-Generated/Page_category_accessories/hyperlink_product_apple_iphone_silicone_case_with')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/accessories/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: Navigate to Page product apple-iphone-15-new'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 13: Add visual checkpoint at Page product apple-iphone-15-new'

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Navigation to Category Page and Filter Products by Price and Stock_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
