package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class enterShippingDetailsAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div emailSubscription"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailSubscription'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['var_1_input_email'])
        
        "Step 4: Click on checkbox marketingInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_marketingInfo'))
        
        "Step 5: Click on button continueShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueShipping'))
        
        "Step 6: Click on radio usshipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/radio_usshipping'))
        
        "Step 7: Hover over div muiInputBase"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 8: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 9: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 10: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_2_input_firstName'])
        
        "Step 11: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 12: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 13: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_3_input_lastName'])
        
        "Step 14: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 15: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 16: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_4_input_address'])
        
        "Step 17: Click on input zipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 18: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 19: Enter input value in input zipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_5_input_zipcode'])
        
        "Step 20: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 21: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 22: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_6_input_city'])
        
        "Step 23: Click on input state"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 24: Hover over div muiFormControl"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        
        "Step 25: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_7_input_state'])
        
        "Step 26: Click on input phoneShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 27: Enter input value in input phoneShipping"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName_1'), data['var_8_input_phoneShipping'])
        
        "Step 28: Click on button continuePayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continuePayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_email'] = testData.getValue('var_1_input_email', rowIndex)
        data['var_2_input_firstName'] = testData.getValue('var_2_input_firstName', rowIndex)
        data['var_3_input_lastName'] = testData.getValue('var_3_input_lastName', rowIndex)
        data['var_4_input_address'] = testData.getValue('var_4_input_address', rowIndex)
        data['var_5_input_zipcode'] = testData.getValue('var_5_input_zipcode', rowIndex)
        data['var_6_input_city'] = testData.getValue('var_6_input_city', rowIndex)
        data['var_7_input_state'] = testData.getValue('var_7_input_state', rowIndex)
        data['var_8_input_phoneShipping'] = testData.getValue('var_8_input_phoneShipping', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_email'] = 'default_data'
        data['var_2_input_firstName'] = 'default_data'
        data['var_3_input_lastName'] = 'default_data'
        data['var_4_input_address'] = 'default_data'
        data['var_5_input_zipcode'] = 'default_data'
        data['var_6_input_city'] = 'default_data'
        data['var_7_input_state'] = 'default_data'
        data['var_8_input_phoneShipping'] = 'default_data'
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

