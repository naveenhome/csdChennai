Feature: Google

@naveen
Scenario: Examples
Given user open "Firefox" browser
And open "Google" in brower
And enter "Leanpitch" in search box
When click on "submit"
Then result should more than 12000
