package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class exploreAppleAccessoriesAndFilterByPrice {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over item accessories"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))
        "Step 2: Click on link appleCategory -> Navigate to page 'category/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_appleCategory'))
        "Step 3: Enter input value in input priceMin"
        WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), data['input_price_min'])
        "Step 4: Enter input value in input priceMax"
        WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), data['input_price_max'])
        "Step 5: Click on button show0"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_show0'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_price_min'] = testData.getValue('input_price_min', rowIndex)
        data['input_price_max'] = testData.getValue('input_price_max', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_price_min'] = 'default_data'
        data['input_price_max'] = 'default_data'
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

