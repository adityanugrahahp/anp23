import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps"

Given("User is on Sepulsa homepage", () =>{
    console.log("Test1")
});

When("User clicks on Login button", () =>{
    console.log("Test2")
});

And("User enters valid email and password", () =>{
    console.log("Test3")
});

And("User clicks on Loginn button", () =>{
    console.log("Test3")
});

Then("User should be redirected to Sepulsa dashboard", () =>{
    console.log("Test4")
});

When("User clicks on Top Up button", () =>{
    console.log("Test2")
});

And("User selects a product", () =>{
    console.log("Test3")
});

And("User selects payment method", () =>{
    console.log("Test3")
});

And("User completes the payment process", () =>{
    console.log("Test3")
});

Then("User should receive a successful top up message", () =>{
    console.log("Test4")
});