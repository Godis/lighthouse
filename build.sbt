lazy val `lighthouse-api` = (project in file("./lighthouse-api"))
  .enablePlugins(PlayScala, DockerPlugin)

lazy val `lighthouse-deployer` = (project in file("./lighthouse-deployer"))
  .enablePlugins(PlayScala, DockerPlugin)
