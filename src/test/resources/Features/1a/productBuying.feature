@1a

  Feature: Find product, add to the basket and buy it

    Scenario: Open home page and try to find a product
      Given Open HomePage
      And Validate that HomePage is open
      When Enter product into search
      Then Press search button
