Feature: Regression Test

  Scenario Outline: Testing only
    Given user enter <Patient Name>, <Doctor Name>
    When click on <iButton>
    Then System dispaly <Message>

    Examples: 
      | Patient Name | Doctor Name | iButton  | Message   |
      | "Xyz"        | "Abc"       | "Submit" | "Success" |
      | "MNO"        | "PQR"       | "Reset"  | "Fail"    |
