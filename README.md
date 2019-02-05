Deploy Java Spring Boot App to Azure Webapp for Containers using JIB (Java Image Builder)
=========================================================================================

Create Spring Boot app
======================

Clone the repo:

git clone <https://github.com/milindvb/mbjavajibspring.git>

cd mbjavajibspring

Update pom.xml
==============

Edit pom.xml to update the “to” image name, docker registry login and
password.

The “from” image name can also be updated to select a different version
of base image.

More image types available here :
<https://hub.docker.com/_/microsoft-java-jdk>

&lt;plugin&gt;

&lt;groupId&gt;com.google.cloud.tools&lt;/groupId&gt;

&lt;artifactId&gt;jib-maven-plugin&lt;/artifactId&gt;

&lt;configuration&gt;

&lt;from&gt;

&lt;image&gt;mcr.microsoft.com/java/jdk:8u202-zulu-centos&lt;/image&gt;

&lt;/from&gt;

&lt;to&gt;

&lt;image&gt;registry.hub.docker.com/milindvb/mbjibimage:1.1&lt;/image&gt;

&lt;auth&gt;

&lt;username&gt;yourDockerHubLogin&lt;/username&gt;

&lt;password&gt;yourDockerHubPassword&lt;/password&gt;

&lt;/auth&gt;

&lt;/to&gt;

&lt;ports&gt;

&lt;port&gt;80&lt;/port&gt;

&lt;/ports&gt;

&lt;/configuration&gt;

&lt;/plugin&gt;

Build the docker image
======================

JIB will build and push the image to container registry of your choice.

Command used: **mvn compile jib:build**

\$ mvn compile jib:build

\[INFO\] Scanning for projects...

\[WARNING\]

\[WARNING\] Some problems were encountered while building the effective
model for com.mibelhe:mbjavajib:jar:0.0.1-SNAPSHOT

\[WARNING\] 'build.plugins.plugin.version' for
com.google.cloud.tools:jib-maven-plugin is missing. @ line 71, column 12

\[WARNING\]

\[WARNING\] It is highly recommended to fix these problems because they
threaten the stability of your build.

\[WARNING\]

\[WARNING\] For this reason, future Maven versions might no longer
support building such malformed projects.

\[WARNING\]

\[INFO\]

\[INFO\]
------------------------------------------------------------------------

\[INFO\] Building sample-code 0.0.1-SNAPSHOT

\[INFO\]
------------------------------------------------------------------------

\[INFO\]

\[INFO\] --- maven-resources-plugin:3.0.2:resources (default-resources)
@ mbjavajib ---

\[INFO\] Using 'UTF-8' encoding to copy filtered resources.

\[INFO\] skip non existing resourceDirectory
/home/mibelhe/mbjavajib/src/main/resources

\[INFO\] skip non existing resourceDirectory
/home/mibelhe/mbjavajib/src/main/resources

\[INFO\]

\[INFO\] --- maven-compiler-plugin:3.7.0:compile (default-compile) @
mbjavajib ---

\[INFO\] Nothing to compile - all classes are up to date

\[INFO\]

\[INFO\] --- jib-maven-plugin:1.0.0:build (default-cli) @ mbjavajib ---

\[INFO\]

\[INFO\] Containerizing application to milindvb/mbjibimage:1.1...

\[INFO\]

\[INFO\] Container entrypoint set to \[java, -cp,
/app/resources:/app/classes:/app/libs/\*, com.mibelhe.mbjavajib.App\]

\[INFO\]

\[INFO\] Built and pushed image as milindvb/mbjibimage:1.1

\[INFO\] **Executing tasks:**

\[INFO\] **\[==============================\] 100.0% complete**

\[INFO\]

\[INFO\]
------------------------------------------------------------------------

\[INFO\] BUILD SUCCESS

\[INFO\]
------------------------------------------------------------------------

\[INFO\] Total time: 6.515 s

\[INFO\] Finished at: 2019-02-05T02:06:19+00:00

\[INFO\] Final Memory: 25M/61M

\[INFO\]
------------------------------------------------------------------------

Create new Azure Webapp
=======================

![](./media/image1.png)

![](./media/image2.png)

Click Apply and then Create

Once the Webapp is Deployed, browse the url to test:

https://mbjavajib4.azurewebsites.net/echo?text=world
