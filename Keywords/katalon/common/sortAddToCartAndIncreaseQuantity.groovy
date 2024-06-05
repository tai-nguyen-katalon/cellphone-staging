package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class sortAddToCartAndIncreaseQuantity {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link 'By price'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))
        "Step 2: Click on button"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_iPhone15Case'))
        "Step 3: Click on label"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_dialogLabel'))
        "Step 4: Click on button 'Buy'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))
        "Step 5: Click on link 'Place an order' -> Navigate to page 'cart'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_placeOrderCart2'))
        "Step 6: Click on button 'Increased'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

