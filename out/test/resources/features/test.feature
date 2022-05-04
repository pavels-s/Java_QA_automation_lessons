@SmokeTest
  @WIP
  @Wip
  @Jira-19423
  Feature: I will test something here

    @ScenarioTag
    Scenario: I will do something here
      Given I do something
      And I do something more
      When I change something
      And I change something else
      Then Something has changed

      Scenario Outline: I do some tests here
        Given I start do <startWordAction>
        When I change <changeWordAction>
        Then <resultWordAction>

        Examples:
        | startWordAction | changeWordAction | resultWordAction |
        | anything       | anything        | anything        |
        | something      | something       | something       |