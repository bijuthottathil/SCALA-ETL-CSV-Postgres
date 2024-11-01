trait ETL {
  // src/main/scala/ETL.scala
  import org.apache.spark.sql.DataFrame

  trait ETL {
    def extract(): DataFrame
    def transform(df: DataFrame): DataFrame
    def show(dataFrame: DataFrame): Unit
    def save(df: DataFrame): Unit
    def load(df: DataFrame): Unit
  }

}
