lazy val root = (project in file(".")).
  settings(
    organization := "org.openapitools",
    name := "blogAwsReferenceDataSDK",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.24" % "compile",
      "io.github.openfeign" % "feign-core" % "11.0" % "compile",
      "io.github.openfeign" % "feign-jackson" % "11.0" % "compile",
      "io.github.openfeign" % "feign-slf4j" % "11.0" % "compile",
      "io.github.openfeign.form" % "feign-form" % "3.8.0" % "compile",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.10.3" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.10.3" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.3" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.9.10" % "compile",
      "com.github.joschi.jackson" % "jackson-datatype-threetenbp" % "2.9.10" % "compile",
      "org.apache.oltu.oauth2" % "org.apache.oltu.oauth2.client" % "1.0.1" % "compile",
      "com.brsanthu" % "migbase64" % "2.2" % "compile",
      "junit" % "junit" % "4.13" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
