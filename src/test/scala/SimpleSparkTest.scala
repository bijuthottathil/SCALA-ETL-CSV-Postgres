// SimpleDataFrameExampleTest.scala
import org.apache.spark.sql.{SparkSession, DataFrame}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterAll

class SimpleSparkTest extends  AnyFunSuite with BeforeAndAfterAll {

  // Initialize a Spark session for testing
  lazy val spark: SparkSession = SparkSession.builder()
    .appName("SimpleDataFrameExampleTest")
    .master("local[*]")
    .getOrCreate()

  override def afterAll(): Unit = {
    spark.stop()
  }

  test("createDataFrame should create a DataFrame with the correct data") {
    // Call the createDataFrame method
    val df: DataFrame = SimpleDataFrameExample.createDataFrame(spark)

    // Expected data
    val expectedData = Seq(
      ("Alice", 29),
      ("Bob", 35),
      ("Cathy", 27),
      ("David", 30)
    )
    import spark.implicits._
    val expectedDf = expectedData.toDF("name", "age")

    // Check that the data matches
    assert(df.collect() === expectedDf.collect())

    // Check that the schema matches
    assert(df.schema === expectedDf.schema)
  }
}
