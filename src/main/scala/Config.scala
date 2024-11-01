// src/main/scala/Config.scala
case object Config {
  // Database configuration
  val dbUrl = "jdbc:postgresql://localhost:5432/postgres" // Replace with your PostgreSQL database URL
  val dbTable = "public.people" // Replace with your target table in PostgreSQL
  val inputPath = "src/main/resources/input/newemployees.csv"

}
