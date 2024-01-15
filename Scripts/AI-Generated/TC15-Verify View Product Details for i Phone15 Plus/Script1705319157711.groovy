import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page product apple-iphone-15-plus'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/apple-iphone-15-plus')

'step 2: Add visual checkpoint at Page product apple-iphone-15-plus'

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify View Product Details for i Phone15 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
