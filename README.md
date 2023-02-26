# Test_P_Movie
Compairing data(Release date and countryof origin) between Wiki and Imdb

Instruction For Executing Testscript:

Clone project to your local machine using git command git clone using url "https://github.com/h-binekar/Test_P_Movie.git".

Save Project as it is in any folder of your machine.

Open Project whole project in Eclipse.

Here in src/main/java inside config package config.properties file is present where all detail are present releted to chromebrowser and url of wiki "https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise" and Imdb "https://www.imdb.com/title/tt9389998/".

In src/main/java inside Base package code for read config file is present.

In src/main/java inside Pages package two seperated class i have created for Wiki and Imdb and maintained repository for both in their related class.

For Running project go to src/test/java in that E2ETest.java class is present Click on Run Project(Run as java application).

For compairing both Result i have used Soft assert.

Check Output on Console What are the test cases pass and failed 

Also check Output Result on Running class

If Expected and Actual Result will not match Test case will failed.

Means Country in Wiki and Imdb is not same then Test case has failed

Also Release date in Wiki and Imdb is not matching then test case has failed.
