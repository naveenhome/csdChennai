Feature: new Rx
As I patient
I want to upload my Rx
So that I can use whenever I want

Scenario: Valid data upload
Given "Naveen" is uploading new Rx as doctor name "Xyz" and date is "10/10/2016", time is "4.30pm" and file name is "abc.jpeg"
And "Naveen" is loggied In
When click on "Submit"
Then System display a message "Rx Recorded successfully."

@wip @regression
Scenario: InValid data upload
Given "Naveen" is uploading new Rx as doctor name " " and date is "10/10/2016", time is "4.30pm" and file name is "abc.jpeg"
When click on "Submit"
Then System display a message "Rx not recorded. Doctor name is manadotary"

Scenario: Valid file type
Given "Naveen" is uploading new Rx as doctor name "Raman" and date is "10/10/2016", time is "4.30pm" and file name is "abc.pdf"
When click on "Submit"
Then System display a message "File not valid please upload either jpeg or png file"

Scenario: Valid file type
Given User has enter correct data
When click on "Submit"
Then System display a message "Rx Recorded successfully."



