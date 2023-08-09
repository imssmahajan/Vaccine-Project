Feature: SignUp functionality

  Scenario: SignUp functionality
    Given User lauches browser
    Then User enters url "https://vaccineledger.com/"
    When Click on SignUp Link
    And Enter Username and Lastname "Satish", "Mahajan"
    Then User Enter Email Id "dev.statwig.com"
    And User Enter Mobile Number "8007541331"
    When Select Tipo de Organization "HOSPITAL"
    And Select Nombre de la Organization "Hospital CIMA"
    Then User clicks on Continuar
