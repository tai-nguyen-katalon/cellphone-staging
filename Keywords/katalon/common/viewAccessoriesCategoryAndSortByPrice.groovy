package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class viewAccessoriesCategoryAndSortByPrice {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item accessories"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))
        
        "Step 2: Click on link accessoriesCategory -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_phoneCategory'))
        
        "Step 3: Click on link sortByPrice"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))
        
        "Step 4: Click on link sortByPrice"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sortByPrice'))
        
        "Step 5: Click on button newiPhone15SiliconeCase"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_saleMagSafeCharger9900'))
        
        "Step 6: Click on label dialogLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_256Gb'))
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

