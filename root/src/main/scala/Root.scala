object Root {
	Persistence.perFunc()
	Http.httpFunc()
	def rootFunc() = {
	println("This is running from from Root..")
  }
}
