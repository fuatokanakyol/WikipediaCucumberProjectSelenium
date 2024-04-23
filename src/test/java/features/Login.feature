Feature: Login Wikipedia

  Scenario: Login with valid user
  When Check Login Button
  When Click Login Button
  When Write Valid UserName "Fuatokanakyol"
  When Write ValidPassword "Fuat.1234"
  When Click Login
  Then check LoginPage


  Scenario: Login with invalid userName
    When Check Login Button
    When Click Login Button
    When Write Invalid UserName "AAAAAA"
    When Write ValidPassword "Fuat.1234"
    When Click Login
    Then check Error Message

  Scenario: Login with invalid Password
    When Check Login Button
    When Click Login Button
    When Write Valid UserName "Fuatokanakyol"
    When Write InValidPassword "123213131"
    When Click Login
    Then check Error Message


  Scenario: Login with invalid Password and invalid userName
    When Check Login Button
    When Click Login Button
    When Write Invalid UserName "BBBBBB"
    When Write InValidPassword "F1232131"
    When Click Login
    Then check Error Message