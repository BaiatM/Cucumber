Feature: To Test Login Functionality
  Developer - Maggie
  Tester - Kristo

  Background:
    Given user open website
    And verify user is on login page

  @Smoke @Chirag
  Scenario Outline: Verify Login Successful
    When user entered username "<admin>" and password "<admin123>"
    Then user is navigated to homepage
    Examples:
      | admin | admin123 |
      | user  | test123  |
      | admin | test123  |
      | user  | admin123 |
      | admin |          |
      |       | admin123 |
      |       |          |

  @Regression @Baiat
  Scenario Outline: Verify User Cannot Login With Invalid Credentials
    When user entered username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples:
      | username | password |
      | user     | test123  |
      | admin    | test123  |
      | user     | admin123 |
      | admin    |          |
      |          | admin123 |
      |          |          |

  @Wip
  Scenario: Verify Dropdown Option
    Then verify dropdown option
      | Art      |
      | Baby     |
      | Books    |
      | Business |
      | Watches  |

  @List @Baiat
  Scenario: Verify Data In Website
    Then verify table data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 11/27/2008 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 10/8/2009  |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 1/11/2009  |
      | Bradley Greer      | Software Engineer             | London        | 41 | 10/12/2012 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 6/6/2011   |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 12/1/2012  |
      | Bruno Nash         | Software Engineer             | London        | 38 | 5/2/2011   |
      | Caesar Vance       | Pre-Sales Support             | New York      | 21 | 12/11/2011 |
      | Cara Stevens       | Sales Assistant               | New York      | 46 | 12/5/2011  |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     | 22 | 3/28/2012  |

