enablePlugins(SiteScaladocPlugin)
enablePlugins(HugoPlugin)
enablePlugins(GitHubPagesPlugin)
gitHubPagesSiteDir := baseDirectory.value / "target/site"
baseURL in Hugo := uri("https://github.com/cric96/sbt-site-hugo-problem")
