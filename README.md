# Test frameworks
testCompile 'junit:junit:4.12'<br/>
 testCompile group: 'org.mockito', name: 'mockito-core', version: ‘1.10.19'

# Requirement (in BDD way) - stage I

**GIVEN** that a user is not signed in<br/>
**WHEN** a user sign in with a password shorter then 6 character<br/>
**THEN** user account manager notify user that there’s an error with message ‘Password shorter then 6 characters’

**GIVEN** that a user is not signed in <br/>
**WHEN** a user sign in with a username shorter then 5 character <br/>
**THEN** user account manager notify user that there’s an error with message ‘Username shorter then 5 characters’

**GIVEN** that a user is not signed in and the app is not connected to internet <br/>
**WHEN** a user sign in with a valid password and username<br/>
**THEN** user account manager notify user that there’s an error with message ‘No internet connection’

**GIVEN** that a user is not signed in <br/>
**WHEN** a user sign in with a valid username and password <br/>
**THEN** user account manager will make a request to server to sign In

**GIVEN** that a user sign in request is success <br/>
**WHEN** a user sign in with a invalid password and username <br/>
**THEN** user account manager will make a request to server to sign In and notify user with message ‘Invalid username or password’

**GIVEN** that a user sign in request is success <br/>
**WHEN** a user sign in with a valid password and username <br/>
**THEN** user account manager will navigate the user to welcome screen

# Requirement (in BDD way) - stage II

**GIVEN** that a user is not registered <br/>
**WHEN** a user create account with a password shorter then 6 character <br/>
**THEN** user account manager notify user that there’s an error with message ‘Password shorter then 6 characters’

**GIVEN** that a user is not registered <br/>
**WHEN** a user create account with invalid email <br/>
**THEN** user account manager notify user that there’s an error with message ‘Please enter valid email Id’

**GIVEN** that a user is not registered and the app is not connected to internet <br/>
**WHEN** a user create account with a valid first name, last name, email, username and password <br/>
**THEN** user account manager notify user that there’s an error with message ‘No internet connection’

**GIVEN** that a user is not registered <br/>
**WHEN** a user create account with any empty field <br/>
**THEN** user account manager notify user that there’s an error with message ‘[given field] can't be empty!’

**GIVEN** that a user is not registered <br/>
**WHEN** a user create account with a valid first name, last name, email, username and password <br/>
**THEN** user account manager will make a request to server to create account

**GIVEN** that a user is not registered <br/>
**WHEN** a user create account with a valid first name, last name, email, username and password <br/>
**THEN** user account manager will navigate the user to welcome screen

