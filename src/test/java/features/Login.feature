@debug
Feature: Login Wikipedia

  Scenario Outline: Login with <username> and <password>
    When Check Login Button
    When Click Login Button
    When Write UserName "<username>"
    When Write Password "<password>"
    When Click Login
    Then check <expected_result>

    Examples:
      | username        | password    | expected_result   |
      | Fuatokanakyol   | Fuat.1234   | LoginPage         |
      | AAAAAA          | Fuat.1234   | Error Message     |
      | Fuatokanakyol   | 123213131   | Error Message     |
      | BBBBBB          | F1232131    | Error Message     |
