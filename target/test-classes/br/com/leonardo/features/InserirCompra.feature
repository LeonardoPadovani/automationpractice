
Feature: Inserir uma compra com um item do tipo women com sucesso
 
  Scenario: validar total da compra com um produto women
    Given que estou na home page do sistema
    When eu seleciono um produto do menu women
    And eu adiciono o produto ao carrinho
    And finalizo a compra
    Then eu verifico o valor total de "$18.51"
    

  
 