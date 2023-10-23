package io.github.rafaelszp.actions;

import io.javalin.Javalin;

public class HelloAPI{
  public static void main(String[] args) {
      var app = Javalin.create(/*config*/)
          .get("/", ctx -> ctx.result("Hello World"))
          .start(7070);
  }
}