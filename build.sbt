name := "group3_SBT"
version :="1.0"
scalaVersion := "2.12.12"


lazy val persistence = project.in(file("persistence"))
  .settings(

    libraryDependencies ++= Seq(  "com.typesafe.slick" %% "slick" % "3.3.2" , 
			   "mysql" % "mysql-connector-java" % "8.0.22",
			"org.scalatest" %% "scalatest" % "3.2.3" % Test,
			"com.h2database" % "h2" % "1.4.200" % Test,
		                   "org.mockito" %% "mockito-scala-scalatest" % "1.16.2"%Test
						
)
)


lazy val http = project.in(file("http"))
  .settings(

    libraryDependencies ++= Seq(    "com.typesafe.akka" %% "akka-http-core" % "10.0.1",
			     "com.typesafe.akka" %% "akka-actor" % "2.6.10",
			    "com.typesafe.akka" %% "akka-stream" % "2.6.10",
			"com.typesafe.akka" %% "akka-http-testkit" % "10.2.1" % Test,
			    "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.9" % Test,
			  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.10" % Test		
			
)
)


lazy val root = project.in(file("root")).dependsOn(persistence,http)
lazy val app = project.in(file(".")).dependsOn(root)
