package com.example

import org.scalatra._

class HelloServlet extends ScalatraServlet {

  get("/") {
    "Hello, World!"
  }
}

