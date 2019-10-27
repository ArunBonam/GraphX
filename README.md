# GraphX
Jupyter Notebook-ApacheToree-Scala


Step1: Install Java ---1.8
Step2:Install Python ---brew install python
Step3: Download Spark --2.7

##Contents to be added in .bash_profile#########

export JAVA_HOME=$(/usr/libexec/java_home)
export SPARK_HOME=~/spark/spark-2.2.0-bin-hadoop2.7
PATH=/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin:/usr/X11/bin
export PATH=$PATH$JAVA_HOME/bin
export PATH=$PATH:$SPARK_HOME/bin
###################################################

Verify Spark in terminal----   spark-shell |||pyspark

Step4:Install jupyter -----pip install jupyter and verify jupyter notebook which opens in browser

Stpe5:install Apache Toree---- for Scala kernel

Step6:To add Scala,Spark SQL kernels to jupyter 
command in terminal ::::
jupyter toree install --spark_home /Users/arunbonam/spark-2.2/spark-2.2.0-bin-hadoop2.7/ --interpreters=Scala,SQL --user
Note:Pyspark kernel no more supported with Toree.  Pyspark kernel needs to be added seperately.

#####Done with setup .Now you can write scala,spark with scala in jupyter notebook#####################







