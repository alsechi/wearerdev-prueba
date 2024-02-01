#Author: haunter42@gmail.com

Feature: hacer pedido
  como Usuario Admin
  quiero registrar un pedido de un cliente con un producto


  Scenario: Hacer un pedido con los usuarios y productos regitrados
    Given como admin ingreso a la pagina
    And   al modulo pedidos
    When  Creo un nuevo pedido
    Then  entoces confirmo el valor de envio del pedido
