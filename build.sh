
javac plusOne.java

jar --create --file plusOne.jar --manifest=META-INF/MANIFEST.MF plusOne.class

java -jar ./plusOne.jar
