@echo off
:start
cls
java -jar version2.jar

set /p answer=Restart? (Y/N):

if %answer% == Y goto start
if %answer% == y goto start
