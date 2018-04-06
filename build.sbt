lazy val `lighthouse-web` = (project in file("./lighthouse-web"))
  .enablePlugins(PlayScala, DockerPlugin)

lazy val `lighthouse-deployer` = (project in file("./lighthouse-deployer"))
  .enablePlugins(PlayScala, DockerPlugin)
