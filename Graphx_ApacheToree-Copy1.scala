val data = Seq((1,2,3), (4,5,6), (6,7,8), (9,19,10))
val ds = spark.createDataset(data)
ds.show()


Import org.apache.spark.graphx._


spark-shell

val nodes = sc.textfile("/Users/arunbonam/Downloads/higgs-social_network.edgelist")

val nodes = sc.textFile("/Users/arunbonam/Downloads/higgs-social_network.edgelist")

nodes

print(nodes)

val nodes2= GraphLoader.edgeListFile(sc,"/Users/arunbonam/Downloads/higgs-social_network.edgelist")

import org.apache.spark.graphx.GraphLoader

val nodes2= GraphLoader.edgeListFile(sc,"/Users/arunbonam/Downloads/higgs-social_network.edgelist")

nodes2

println(nodes2.collect())

val edges: RDD[(VertexId, VertexId)] = nodes2.map(line => line.split(" "))
      .map(line =>
        (MurmurHash.stringHash(line(0).toString), MurmurHash.stringHash(line(1).toString)))


#####################STARTS HERE#####################
val fileRdd = sc.textFile("/Users/arunbonam/Downloads/sample12.txt")
file.collect.foreach(println)

import scala.util.MurmurHash
import org.apache.spark.graphx.Graph
import org.apache.spark.rdd.RDD
import org.apache.spark.graphx.VertexId

val edges: RDD[(VertexId, VertexId)] = file.map(line => line.split(" "))
      .map(line =>
        ((line(0).toInt),(line(1).toInt)))

edges.collect.foreach(println)

val graph=Graph.fromEdgeTuples(edgesRDD,null)

graph.triplets.collect.foreach(println)

graph.vertices.collect.foreach(println)

graph.edges.collect.foreach(println)

val i = graph.inDegrees

print(i)

i.collect.foreach(println)

val numNodes =graph.numVertices

val PairReverse = i.map(X => (X._2,X._1))

PairReverse.collect.foreach(println)

val countMap=PairReverse.countByKey()




val countList=countMap.toList

val countRdd =sc.parallelize(countList)

val finalrdd =countRdd.map(v=>(v._1,v._2/numNodes.toDouble))

finalrdd.collect.foreach(println)

finalrdd.saveAsTextFile("/Users/arunbonam/Downloads/dataset2.txt")




