@authentication
Feature: Tester la page connexion
  ETQ utilisateur je souhaite tester la page connexion

  @Cnx
  Scenario: Tester la page connexion - ORANGE HRM
    Given Je me connecter sur l'application Orange HRM
    When Je saisie le UserName "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le buton Login
    Then Je me redirige vers la page Home

   Scenario: Tester la page connexion - ORANGE HRM
    Given Je me connecter sur l'application Orange HRM
    When Je saisie le UserName "Admi"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le buton Login
    Then Je me redirige vers la page Home