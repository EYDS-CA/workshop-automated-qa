# Workshop - Automated Quality Assurance Pipelines

Nothing beats manual QA, but what can we automate in this process to increase velocity? Participants will be learning how create automated functional and non-functional tests, run automatically through GitHub Actions pipelines. Includes web-driver tests (Selenium), security tests (ZAP), and accessibility tests (pa11y).

Learning is broken down into "milestones", and each milestone in this repo will be a PR into the branch of the milestone before it. The `main` branch has all milestones so please check the Pull Requests of this repo to see each milestone/lesson separately. 

You are encouraged to not follow the exact steps we have used here, and to focus just on the high level learning goals, using this repo as an example. 

### Example real-world codebases

Here are some open-source codebases that our team has worked on which have automated QA pipelines in various shapes. Please do reach out to the contributors on these codebases if you have any questions. 

-	https://github.com/bcgov/ehpr2
-	https://github.com/bcgov/myhealthBC-symptom-checker
-	https://github.com/bcgov/hcap

## Milestone 1

### Goals
-	Set-up a GitHub repo and get a Hello World action or test running on each PR.
-	Implement a very simple e2e test (we are using WebDriver IO to run Selenium in Javascript) running against chosen web-app in pipeline.

You are encouraged **not to follow the code in this repo exactly**. Please write your own code, expand this code here, or maybe start on some tests for a different web-app.

### Steps
- Create a new repo in GitHub for your project.
- Follow the Getting Started steps at https://webdriver.io/docs/gettingstarted to create some starting tests. (We used `yarn` here.)
- Check that these tests run locally. We added a `test` script to my `package.json` so we could run `yarn test` and check that they worked.
- Add a github workflow file (see .github/workflows/pr-check.yml) which will trigger these tests to run on every PR raised or changed.
