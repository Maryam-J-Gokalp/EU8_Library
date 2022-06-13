@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  #OnceYouClick onYour StepItsSayNoDocumentToBeFound-->COZ ThereIsNotMatchingToMakeMyStepsAsAction
  #ToGetMyStepsDefinitionIGoToRunnerClass-->WeImportWhereMyProjectIsGenerated. WeDecidedWhereMyFeatureFileIsStore
  #WeDecideWhereMyProjectIsCreated COZ RunnerClass IsWhereWeAreGoingToControl&ManageTheWholeProject
  #IsWhere,MyStepAreCreated.ProjectGenerate,FeatureAreStore,WhereWeRunTheCodeItself ToRun myFeature
  # FilesToGetMyDefinitionSnips

  #1st scenario
  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    #2rd scenario
  @student @db
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

    #3rd scenario
  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

  #this is how we add comments in feature file

  #this is how we add comments in feature file
  #Keywords WHEN, AND,THEN,BUT IsOnly ToCommunicate TheyDon't change the TestExecution Function

  # RESOURCES&FEATURES FOLDER-->Look like create different folders for different type of files
  # WhatWe Did? 1st WeCreateFeatureFileNamed-->login.feature
  # 2rd We Created OurScenario--> Scenario:Login as librarian
  #3rdWeCreatedOurSteps->When userEnters admin username.And userEnters admin password.Then userShould C the dashboard
  #YOUR USER StoryMustMatchWithUserStorySteps WithLogInStepsClass

  # Test suppose to be readable and implement for different scenario of my class
  #The reason for his is to give us less code into our class
