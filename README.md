# TestProjectCGI_10092022
***************************************************************************************************************
Goal:
This is a Utility Project (REST based API) that can receive a call with a mass of text and
returns the 10 most frequent words and their frequencies. 

***************************************************************************************************************
Details specific to this Utility:
1. For simplicity we have the text file placed in the resource folder which have the mass of text 
to operate upon.
(Path: src/main/resources/MyFile.txt)
2. This Utility will extract and count only words and not consider spaces, new lines or special characters.
3. This Utility is not case sensitive so lower case and upper case will be treated as the same word.
4. We can manipulate the number of most frequent words (here 10) from the code (update limit as required)
***************************************************************************************************************

Usage - To Access this utility :
1. We need to download this project or gitclone to the local system,
A zip file TestProjectCGI_10092022.zip will get downloaded to your system.

2. Unzip the zip file downloaded

3. Have the TestProjectCGI_10092022 imported in your IDE (Eclipse/IntelliJ)

4. Run the project as Maven Project and Start the project - You can simply run the TestProjectCgiApplication.java
as a Java Application 

5. Verify the MyFile.txt in resource folder - Update if needed the file

6. On Postman tool we can hit the POST method - localhost:3000/count and we will get the 10 most frequently used words in the file
with their frequencies.

***************************************************************************************************************
Example : 

We can update the file MyFile.txt as per requirement as mentioned in step 5.

As mentioned in step 6 we hit this request and expect below response showing 10 most frequent words in the file.

REQUEST : localhost:3000/count
RESPONSE : {
    "dog": 60,
    "banana": 40,
    "cat": 40,
    "apple": 20,
    "swadesh": 10,
    "nayak": 2,
    "barman": 1
}
***************************************************************************************************************



