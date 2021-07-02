Feature: To verify that top menu link and Enquiry form validation

  Scenario: To verify that top menu link validation
    Given The user need to be on Growth Engineering home page
    When The user need to click the top menu option and validate it
      | Our Products | Our Approach  | Resources | About Us                 |
      | academy-lms  | brain-science | resources | about-growth-engineering |
    Then The user need to close the browser

  Scenario: To verify that enquiry form validation on Contact page
    Given The user need to be on Growth Engineering Contact page
    When The user need to fill the forms on contact page
      | First name | Last name | Work Email     | Telephone  | Company name | Country | Describes Your Role | Purpose of your enquiry                        |
      | TestFirst  | TestLast  | first@test.com | 9876543210 | Globallogic  | India   | Others              | To find out how Growth Engineering can help me |
	Then The user need to close the browser