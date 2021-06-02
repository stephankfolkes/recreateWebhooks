import jenkins.model.Jenkins

Jenkins.getInstanceOrNull().getItems(com.cloudbees.hudson.plugins.folder.AbstractFolder.class).each {
  println "Saving for WebHook recreation " + it.getFullDisplayName()
  it.save()
}
