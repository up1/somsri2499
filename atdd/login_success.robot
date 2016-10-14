*** Settings ***
Library    Selenium2Library
Test Setup    Goto login page

*** Variables ***
${URL}   http://localhost:8080/demo

*** Testcase ***
Login สำเร็จด้วย username
  กรอกข้อมูลของ username somsri
  กรอกข้อมูลของ password somsri2499
  กดปุ่ม Login
  ต้องไปหน้า HOME

*** Keywords ***
Goto login page
  Open Browser    ${URL}/login.html

ต้องไปหน้า HOME
  Wait Until Page Contains    SUCCESS

กดปุ่ม Login
  Click Element   id=btn_login

กรอกข้อมูลของ password somsri2499
  Input Text    id=text_password   somsri2499

กรอกข้อมูลของ username somsri
  Input Text    id=text_user   somsri
