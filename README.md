# Parking-Lot-Application-Spark
Parking Lot Application Files:

PkLot.java: parking lot java code(should be ran from submit-application)

PkLotSearch.scala parking lot scala code(should be ran from submit-application)

scala.txt : parking lot scala code (should be ran in spark-shell)

5.xml : the sample of data set;the path of 5.xml file in both java and scala codes should be set.


*How to Run scala.txt from spark-shell:
copy and past the code in spark-shell
/home/sparktp/spark-1.4.0-bin-hadoop2.6/bin/spark-shell


*How to Run java app/scala app from submit-application:
Before starting, sbt needs to be installed. then folder /sparksample /src/main/java or scala should be created.
Now file sparksample.sbt should be edited:
name := "Spark Sample"
version := "1.0"
scalaVersion := "2.10.4"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.0"

Then, sbt could be ran from /home/sparktp/sparksample/ in order to create jar file. Now, code(java/scala) could be compiled by sbt. 
sbt (Enter)
compile (Enter)
if successful there is no error in code, so we can create package by typing package.
Now jar file in ready to be submitted,so follow below command to sumbit the jar code:
/home/sparktp/spark-1.4.0-bin-hadoop2.6/bin: ./spark-submit --class "PkLotsj" --master spark://10.0.0.10:7077 /home/sparktp/sparksample/target/scala-2.10/spark-sample_2.10-1.0.jar
(please see Parking lot application codes.pdf for more information)
