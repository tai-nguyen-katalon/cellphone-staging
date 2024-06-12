package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class purchaseIPhone15CaseAndAccessories {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button iPhone15Case2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_iPhone15Case2'))
        "Step 2: Click on label dialogLabel"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_dialogLabel'))
        "Step 3: Click on button buyDialog2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buyDialog2'))
        "Step 4: Click on link placeOrderCart2 -> Navigate to page 'cart'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_placeOrderCart2'))
        "Step 5: Click on button increased"
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

