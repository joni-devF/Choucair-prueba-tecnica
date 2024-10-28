@Orange
  Feature: Proceso de contratación

    Background: Reliza el proceso de contratacion de una persona exitosamente

      Scenario:
        Given el usuario ingrese al sitio web
        And inicie sesion correctamente
        When ingrese al modulo recruitment
        And doy clic al boton Add
        And realizo los pasos para contratar un candidato
        Then me dirijo al modulo recruitment
        And el estado del candidato debe ser Hiring