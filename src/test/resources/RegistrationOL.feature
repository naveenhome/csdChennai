Feature: Registration Outline

  Scenario Outline: Sign up via manual form
    Given user details like first name <firstName> and email as <email> and enter password <password> and confirm password as <confirmPassword> and gender as <gender>
    When clicks on <button> button
    Then app should validate the data and if its valid, should logs the user into the application and show the <result> page

    Examples: 
      | firstName | email           | password | confirmPassword | gender   | button   | result |
      | "Navya"   | "n4r@a-cti.com" | "123"    | "123"           | "Female" | "Submit" | "Home" |
