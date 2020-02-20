# Galamsey
There are two versions of this program.

Version1 contains 4 classes which are position, galamsey, observatory, monitoring and monitoringIO2.

all of these methods are called in monitoringIO2 because it is the only one that contains the main method.

Version 2 contains 6 classes which are ENTER_Galamsey, Monitoringselection, observatory, SHOWSTATS, DBconnection, and Monitoring_Gui.
These classes were generated using netbeans.

DBconnection creates a connection to the database and manually enters data in the galamsey relation to test it. To connect to the database, you first have to download mysql connector and add it to your java libraries. Then create a database named Galamseys with two relations: galamsey and observatory in mysql.

ENTER_Galamsey prompts the user to input galamsey values and immediately creates a connection to the database to store these information.

observatory class prompts the user to input galamsey values and immediately creates a connection to the database to store these information.

Monitoringselection class provides the user with a menu in a form of buttons to pick the service he wants.

SHOWSTATS prints data from the database to the console.

Monitoring_Gui calls all of the above methods. 
The first page is a login page and the user name is     admin    while the password is       1234

the second page presents a menu with 4 buttons where the user can choose whichever he wants.

Depending on which button clicked, the user can enter galamsey data, observatory data, show statistics or exit.
