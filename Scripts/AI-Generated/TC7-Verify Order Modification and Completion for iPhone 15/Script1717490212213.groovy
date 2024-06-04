import katalon.common.completeCheckoutProcess
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.viewAndPurchaseIphone15
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

"Step 2: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Hover over list item.png')

"Step 3: Click on link 'Apple'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_appleCategory2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on link Apple.png')

"Step 4: Navigate to iPhone 15 product page, select options, and place an order"

viewAndPurchaseIphone15.execute()

"Step 5: Click on button 'Increased'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on button Increased.png')

"Step 6: Click on button 'Remove'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_remove'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on button Remove.png')

"Step 7: Click on link 'Go shopping!' -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on link Go shopping - Navigate to page .png')

"Step 8: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Hover over list item.png')

"Step 9: Click on link 'Apple'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_appleCategory2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on link Apple.png')

"Step 10: Navigate to iPhone 15 product page, select options, and place an order"

viewAndPurchaseIphone15.execute()

"Step 11: Proceed through checkout steps, provide shipping info, select payment method, and complete order"

completeCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
