import katalon.common.checkoutAndCompleteOrder
import katalon.common.viewAndFilterAppleAccessories
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.purchaseIPhone15CaseAndAccessories


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Navigate to Apple accessories category and filter by price range"

viewAndFilterAppleAccessories.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select and purchase iPhone 15 case and accessories"

purchaseIPhone15CaseAndAccessories.execute()

"Step 4: Provide shipping information and select payment method to complete order"

checkoutAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Purchase of iPhone 15 Case and Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
