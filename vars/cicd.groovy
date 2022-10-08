def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(ip,contextpath)
{
  
deploy adapters: [tomcat9(credentialsId: 'ef64fce5-f11a-43dc-9520-ba6a5eb57d31', path: '', url: "${ip}")], contextPath: "${contextpath}", war: '**/*.war'
}


def runSelenium(path)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${path}/testing.jar"
}
  
