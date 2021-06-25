
Feature: Inserir compra com sucesso

 
  Scenario: validar total da compra
    Given que estou na home page do sistema
    When eu adiciono produtos ao carrinho
    And finalizo a compra
    Then eu verifico o valor total de "$35.02"
    


 