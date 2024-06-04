package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class viewAndPurchaseIphone15 {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link 'iPhone 15' -> Navigate to page 'product/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))
        "Step 2: Click on label"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))
        "Step 3: Click on label"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))
        "Step 4: Click on button"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_btn1'))
        "Step 5: Click on button 'Buy'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        "Step 6: Click on link 'Place an order'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrder'))
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

