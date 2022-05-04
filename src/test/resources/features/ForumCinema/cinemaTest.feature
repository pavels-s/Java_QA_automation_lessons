@Cinema
  @CinemaLogin

  Feature: Test ForumCinema login and enter profile.

    Scenario: Open login page and enter profile
      Given Open login page
      And Validate that login page is opened
      When Enter your login and password
      And Enter your profile
      Then Validate name and surname

