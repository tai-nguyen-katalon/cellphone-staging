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

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on main object'

testObj = findTestObject('AI-Generated/Page_home/main_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page home click on main object'

testObj = findTestObject('AI-Generated/Page_home/main_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page home click on hyperlink product apple iphone new --> navigate to Page product apple-iphone-15-new'

testObj = findTestObject('AI-Generated/Page_home/hyperlink_product_apple_iphone_new')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Navigate to Page product apple-iphone-15-new --> navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 6: Navigate to Page home --> navigate to Page cart'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart')

'step 7: At Page cart click on hyperlink --> navigate to Page home'

testObj = findTestObject('AI-Generated/Page_cart/hyperlink')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page home click on main object'

testObj = findTestObject('AI-Generated/Page_home/main_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page home click on main object'

testObj = findTestObject('AI-Generated/Page_home/main_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page home click on hyperlink product apple iphone new --> navigate to Page product apple-iphone-15-new'

testObj = findTestObject('AI-Generated/Page_home/hyperlink_product_apple_iphone_new')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: Navigate to Page product apple-iphone-15-new --> navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 12: Navigate to Page home --> navigate to Page category phone'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/phone')

'step 13: At Page category phone click on hyperlink product google pixel pro --> navigate to Page product samsung-galaxy-z-fold4-silicon-cover'

testObj = findTestObject('AI-Generated/Page_category_phone/hyperlink_product_google_pixel_pro')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/phone/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: Add visual checkpoint at Page product samsung-galaxy-z-fold4-silicon-cover'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Navigation to Product Page and View Product Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
