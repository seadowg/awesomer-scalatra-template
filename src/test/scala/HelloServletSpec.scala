import com.example._
import org.scalatra.test.specs2.MutableScalatraSpec

class HelloServletSpec extends MutableScalatraSpec {
  addServlet(classOf[com.example.HelloServlet], "/*")

  "GET / on HelloServlet" should {
    "return a greeting" in {
      get("/") {
        body must equalTo("Hello, World!")
      }
    }
  }
}
