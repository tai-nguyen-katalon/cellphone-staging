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

'step 1: Navigate to Page home --> navigate to Page category apple'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/apple')

'step 2: At Page category apple click on hyperlink product apple iphone new --> navigate to Page product apple-iphone-15-new'

testObj = findTestObject('AI-Generated/Page_category_apple/hyperlink_product_apple_iphone_new')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/apple/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Navigate to Page product apple-iphone-15-new'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 4: Add visual checkpoint at Page product apple-iphone-15-new'

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify Navigation to Product Page and View Product Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
