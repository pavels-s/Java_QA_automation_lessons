@1a

  Feature: Find product, add to the basket and buy it.

    Scenario: Open home page and try to find a product
      Given Open HomePage
      And Validate that HomePage is open
      When Enter product into search and click search button
      And Click on vacuum cleaner directory
      And Choose a product and click on it
      And Add it to the cart
      And Submit purchase (+set product name and price)
      And Enter email for purchase
      And Choose collection at office
      And Choose city to collect product
      And Enter name, surname and phone number
      Then Checkout
      And Choose payment by cash
      And Validate that price is

