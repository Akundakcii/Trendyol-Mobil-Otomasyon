@trendyol
Feature: Trendyol

  Scenario:Trendyol Login Steps
    When Click to Men
    When Click to  Account
    When Write email and password
    Then is login succesful
    When GotoMainPage

  Scenario: User add profile
    When Click profil Button
    When Write tall and weight
    When Write name and surname
    When Write phone number
    When Check information
    When Click Update Button
    When GotoMainPage



  Scenario: Take Computer
    When Select Electronik category
    When Select computer
    When Select gaming computer
    When Close filter info
    When Do Filter max price
    When Select product
    When Click basket
    When close info
    When GotoBasket
    When Delete Product
    When GotoMainPage


    Scenario: Searchbox product
      When Searchbox hat write
      When random one product fav add
      When go to company
      When message close
      When cupon use
      When product buy
      Then control price
      When delete product

















