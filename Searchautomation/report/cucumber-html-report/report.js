$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/search.feature");
formatter.feature({
  "line": 2,
  "name": "Loga_search",
  "description": "",
  "id": "loga-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search_Feature"
    }
  ]
});
formatter.scenario({
  "line": 13,
  "name": "Valid Search option",
  "description": "",
  "id": "loga-search;valid-search-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open the URL in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Enter the valid value in Search option",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on enter",
  "keyword": "Then "
});
formatter.match({
  "location": "Validsearch_def.open_the_URL_in_browser()"
});
formatter.result({
  "duration": 15675864200,
  "status": "passed"
});
formatter.match({
  "location": "Validsearch_def.enter_the_valid_value_in_Search_option()"
});
formatter.result({
  "duration": 518221300,
  "status": "passed"
});
formatter.match({
  "location": "Validsearch_def.click_on_enter()"
});
formatter.result({
  "duration": 3170685000,
  "status": "passed"
});
});