enablePlugins(SiteScaladocPlugin)
enablePlugins(HugoPlugin)
enablePlugins(GitHubPagesPlugin)
gitHubPagesSiteDir := baseDirectory.value / "target/site"
baseURL in Hugo := uri("https://cric96.github.io/sbt-site-hugo-problem/")
