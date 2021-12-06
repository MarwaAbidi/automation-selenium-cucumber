$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authenticationfeature/Autentication.feature");
formatter.feature({
  "line": 2,
  "name": "Tester la page connexion",
  "description": "ETQ utilisateur je souhaite tester la page connexion",
  "id": "tester-la-page-connexion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentication"
    }
  ]
});
formatter.before({
  "duration": 25582922000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Tester la page connexion - ORANGE HRM",
  "description": "",
  "id": "tester-la-page-connexion;tester-la-page-connexion---orange-hrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecter sur l\u0027application Orange HRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le UserName",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le buton Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je me redirige vers la page Home",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 2403071800,
  "status": "passed"
});
});