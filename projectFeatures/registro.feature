
Feature: Prueba de registro
  Yo como usuario de guru99 telecom
  quiero realizar el registro cuando ingrese a la pagina
  ingreasando mis datos 

  
  Scenario: Registro de usuario
    Given El usuario esta en la pagina de registro
    When Cuando ingresa datos validos
    And da clic en submmit
    Then El usuario puede ver que su registro halla sido exitoso
