package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class checkoutAndCompleteOrder {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button proceedCheckout -> Navigate to page 'checkout/info'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedCheckout'))
        "Step 2: Hover over div emailSubscription"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailSubscription'))
        "Step 3: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 4: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        "Step 5: Click on checkbox marketingInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_marketingInfo'))
        "Step 6: Click on button continueShipping -> Navigate to page 'checkout/shipping-address'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueShipping'))
        "Step 7: Click on radio usshipping"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/radio_usshipping'))
        "Step 8: Hover over div muiInputBase"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBase'))
        "Step 9: Click on input firstName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        "Step 10: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl'))
        "Step 11: Enter input value in input firstName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_shipping_address_first_name'])
        "Step 12: Click on input lastName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        "Step 13: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_1'))
        "Step 14: Enter input value in input lastName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_shipping_address_last_name'])
        "Step 15: Click on input address"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        "Step 16: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_2'))
        "Step 17: Enter input value in input address"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_shipping_address_address_line_1'])
        "Step 18: Click on input zipcode"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        "Step 19: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_3'))
        "Step 20: Enter input value in input zipcode"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['input_shipping_address_zip'])
        "Step 21: Click on input city"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        "Step 22: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_4'))
        "Step 23: Enter input value in input city"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_shipping_address_city'])
        "Step 24: Click on input state"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        "Step 25: Hover over div muiFormControl"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControl_5'))
        "Step 26: Enter input value in input state"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_shipping_address_state'])
        "Step 27: Click on input phoneShipping"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phoneShipping'))
        "Step 28: Enter input value in input phoneShipping"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phoneShipping'), data['input_shipping_address_phone'])
        "Step 29: Click on button continuePayment -> Navigate to page 'checkout/payment'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continuePayment'))
        "Step 30: Click on radio cashOnDelivery"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))
        "Step 31: Click on button completeOrder"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))
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

