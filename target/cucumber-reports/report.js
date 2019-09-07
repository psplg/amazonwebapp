$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/amazon/amazonwebapp/feature/OpenMRSTest.feature");
formatter.feature({
  "name": "MRS application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MRSTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "MRS app test",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is logged in to MRS app",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "username",
        "userpassword"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin123"
      ]
    }
  ]
});
formatter.step({
  "name": "user clicks on option \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on Apppoinment Scheduling",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to \"\u003ctitle\u003e\" page",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "location",
        "title"
      ]
    },
    {
      "cells": [
        "Inpatient Ward",
        "OpenMRS Electronic Medical Record"
      ]
    }
  ]
});
formatter.step({
  "name": "user is logged in to MRS app",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on option \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Apppoinment Scheduling",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Manage Service Types",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able to view a tabular list of Services",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location"
      ]
    },
    {
      "cells": [
        "Inpatient Ward"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MRS app test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MRSTest"
    }
  ]
});
formatter.step({
  "name": "user is logged in to MRS app",
  "rows": [
    {
      "cells": [
        "username",
        "userpassword"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin123"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "MRSHomePageTest.user_is_logged_in_to_MRS_app(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on option \"Inpatient Ward\"",
  "keyword": "When "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on Apppoinment Scheduling",
  "keyword": "And "
});
formatter.match({
  "location": "MRSHomePageTest.clicks_on_Apppoinment_Scheduling()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to \"\u003ctitle\u003e\" page",
  "rows": [
    {
      "cells": [
        "location",
        "title"
      ]
    },
    {
      "cells": [
        "Inpatient Ward",
        "OpenMRS Electronic Medical Record"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MRSHomePageTest.user_is_navigated_to_title_page(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is logged in to MRS app",
  "keyword": "Given "
});
formatter.match({
  "location": "MRSHomePageTest.user_is_logged_in_to_MRS_app(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on option \"Inpatient Ward\"",
  "keyword": "When "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Apppoinment Scheduling",
  "keyword": "And "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_Apppoinment_Scheduling()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Manage Service Types",
  "keyword": "And "
});
formatter.match({
  "location": "MRSHomePageTest.user_clicks_on_Manage_Service_Types()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view a tabular list of Services",
  "keyword": "Then "
});
formatter.match({
  "location": "MRSHomePageTest.user_should_be_able_to_view_a_tabular_list_of_Services()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});