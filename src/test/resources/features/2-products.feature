Feature: CP02 - Validar carrito de compras

  Background: Realizar 3 validaciones en el carrito de compras
    Given el usuario navega al sitio web
    When ingresa credenciales validas

    Scenario: 1 - Listar los productos en el carrito de compras
      And agrega productos al carrito
      And da click en el icono del carrito
      Then el sistema deberia listar los productos agregados en el carrito de compras

    Scenario: 2 - Cuando la cesta este vacia de productos, no procesar la compra
      And da click en el icono del carrito
      Then el sistema deberia mostrar la cesta sin productos

    Scenario: 3 - Cuando se quiera procesar la compra, se mostrara un mensaje de compra exitosa
      