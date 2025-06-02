@Home-Page

  Feature: Home Page

    @TC001
    Scenario: Verify user successfully navigate to Product Category Page from Home Page
      Given user land to alfagift website
      And user click category menu on Home Page
      When user select category "Kebutuhan Dapur" on Home Page
      And user select sub category "Perlengkapan Dapur & Ruang Makan" on Home Page
      Then user successfully navigate to "Perlengkapan Dapur & Ruang Makan" on Home Page

    @TC002
    Scenario: Verify user successfully search product from Home Page
      Given user land to alfagift website
      When user search product "Ultra Milk Susu UHT Stroberi Kotak 125 ml" on Home Page
      Then user should discover product contains "Ultra Milk Susu UHT Stroberi Kotak 125 ml" on Home Page
