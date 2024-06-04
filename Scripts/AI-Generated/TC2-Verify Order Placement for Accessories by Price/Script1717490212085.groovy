import katalon.common.completeCheckoutProcess
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.sortAndAddToCart
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

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Hover over list item.png')

"Step 3: Click on link 'Accessories' -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_accessoriesCategory'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link Accessories - Navigate to page category.png')

"Step 4: Click on link 'By price'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on link By price.png')

"Step 5: Sort products by price, add selected item to cart, and increase quantity"

sortAndAddToCart.execute()

"Step 6: Proceed through checkout steps, provide shipping info, select payment method, and complete order"

completeCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
