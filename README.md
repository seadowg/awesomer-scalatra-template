# Awesomer Scalatra Template

[![Build Status](https://travis-ci.org/seadowg/awesomer-scalatra-template.png?branch=master)](https://travis-ci.org/seadowg/awesomer-scalatra-template)

A simple Scalatra project template for the masses. Originally based on
[Lauri Lehmijoki's template](https://github.com/laurilehmijoki/sbt-scalatra-skeleton).

## Features

* Scala 2.10.2
* Scalatra 2.2.1
* Heroku deployable out of the box (also Cloud Foundry\*)

## Requirements

1. sbt

That's it. sbt is a tool for managing dependencies and building used with Scala (think Maven, Ant, Bundler etc). The
`build.sbt` file in the root directory will be read by sbt to determine Scala version, dependencies and such.

You can learn about and install sbt [here](http://www.scala-sbt.org/).

## Usage

To build/test:

    > sbt compile test

To start:

    > sbt stage
    > PORT=<your favourite web port> target/start

## What do all these files do?

Scalatra has a couple of files lying around that you may be like "Wait?
What's this? DELETE". Hold on though. Here's what's up:

### HelloServlet.scala

This is where the `HelloServlet` class lives. This is the only actual
Scalatra code (apart from specs). It looks something like this:

```scala
class HelloServlet extends ScalatraServlet {

  get("/") {
    "Hello, World!"
  }
}
```

You should change the class/package name and directory structure to suit yourself. Or leave it as HelloServlet. That
kinda sucks though...

### JettyLauncher.scala

Used so Scalatra can be launched outside of sbt. You shouldn't
need to change this except to update the reference to the Servlet class name (which is currently `HelloServlet`).

### ScalatraBootstrap.scala

Scalatra configuration class. More info [here](http://www.scalatra.org/guides/deployment/configuration.html).

More about project structure for Scalatra apps can be found [here](http://www.scalatra.org/2.2/getting-started/project-structure.html).

*\*Cloud Foundry will require you to add `command: target/start` to your
manifest.yml and specify the Scala build pack that can be found [here](https://github.com/heroku/heroku-buildpack-scala).
