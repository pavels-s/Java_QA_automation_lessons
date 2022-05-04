@1aFinalTask

  Feature: Find product on 1a.lv, add to the cart and buy it.

    Scenario Outline: Open home page, find a product, add to cart
      Given Open home page https://www.1a.lv/
      And Validate that HomePage is open
      When Enter product name irobot into search and click search button
      And Click on vacuum cleaner directory
      And Choose a product and click on it
      And Add it to the cart
      And Submit purchase, set product name and price
      And Enter email example@email.com for purchase
      And Choose collection at office
      And Choose Daugavpils city to collect product
      And Enter name Ivan, surname Ivanov and phone number 1111111
      Then Checkout
      And Choose payment by cash
      And Validate that price is 599,0eur
      Examples:

