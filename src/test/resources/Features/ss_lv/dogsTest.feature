@SSlv
  @Dogs
  Feature: Test ss.lv dogs page filtering and validates it

    Scenario: Open dog page and change price, age and region
      Given Open HomePage
      And Open Dog Category
      And Validate that Dog page is open
      When Set min price to 1000 and max price to 0
      And Set min age to 1 and max age to 12
      And Change region to Riga
      Then Press search button


#    basePage.openChromeByUrl("https://www.ss.com/lv/");
#    homePagePom.openPageByCategory("dogs");
#    dogsPagePom.validatePageUrl();
#    dogsPagePom.setPrice("1000", "");
#    dogsPagePom.setAge("1", "12");
#    dogsPagePom.validateAge("1", "12");
#    dogsPagePom.selectRegion("Riga");
#    dogsPagePom.pressMekletButton();