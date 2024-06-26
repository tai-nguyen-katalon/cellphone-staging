package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillEmailSubscriptionAndShippingDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over div emailSubscription"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailSubscription'))
        "Step 2: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 3: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
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
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl'))
        "Step 10: Enter input value in input firstName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_shipping_address_first_name'])
        "Step 11: Click on input lastName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        "Step 12: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_1'))
        "Step 13: Enter input value in input lastName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_shipping_address_last_name'])
        "Step 14: Click on input address"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        "Step 15: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_2'))
        "Step 16: Enter input value in input address"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_shipping_address_address_line_1'])
        "Step 17: Click on input zipcode"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        "Step 18: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_3'))
        "Step 19: Enter input value in input zipcode"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['input_shipping_address_zip'])
        "Step 20: Click on input city"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        "Step 21: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_4'))
        "Step 22: Enter input value in input city"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_shipping_address_city'])
        "Step 23: Click on input state"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        "Step 24: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_5'))
        "Step 25: Enter input value in input state"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_shipping_address_state'])
        "Step 26: Click on input phoneShipping"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phoneShipping'))
        "Step 27: Enter input value in input phoneShipping"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phoneShipping'), data['input_shipping_address_phone'])
        "Step 28: Click on button continuePayment"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continuePayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_shipping_address_first_name'] = testData.getValue('input_shipping_address_first_name', rowIndex)
        data['input_shipping_address_last_name'] = testData.getValue('input_shipping_address_last_name', rowIndex)
        data['input_shipping_address_address_line_1'] = testData.getValue('input_shipping_address_address_line_1', rowIndex)
        data['input_shipping_address_zip'] = testData.getValue('input_shipping_address_zip', rowIndex)
        data['input_shipping_address_city'] = testData.getValue('input_shipping_address_city', rowIndex)
        data['input_shipping_address_state'] = testData.getValue('input_shipping_address_state', rowIndex)
        data['input_shipping_address_phone'] = testData.getValue('input_shipping_address_phone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_email'] = 'default_data'
        data['input_shipping_address_first_name'] = 'default_data'
        data['input_shipping_address_last_name'] = 'default_data'
        data['input_shipping_address_address_line_1'] = 'default_data'
        data['input_shipping_address_zip'] = 'default_data'
        data['input_shipping_address_city'] = 'default_data'
        data['input_shipping_address_state'] = 'default_data'
        data['input_shipping_address_phone'] = 'default_data'
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

