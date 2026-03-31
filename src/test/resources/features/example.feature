Feature: Búsqueda en Google
  Scenario: Buscar un término específico
    Given que el usuario está en la página de Google
    When busca la palabra "QA Automation"
    Then debería ver resultados relacionados