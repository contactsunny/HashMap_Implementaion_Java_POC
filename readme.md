> ### All data structures implementations
>
> For a list of all the data structures I have implemented, click [here](https://gist.github.com/contactsunny/4a97886c7da57461efa8cd2538a49dbc).

---

# HashMap Implementation POC in Java

This is a simple example of a hash map implementation in Java. We create a custom ```Node``` class which can take keys and values of
generic type ```K, V```, so that we can create maps of different types using the same implementation class. We also create a 
```HashMap``` class which will hold the actual nodes of the hash map.

# Use of the generic classes ```K``` and ```V```

If you check the ```Node``` class, I'm taking the generic classes ```K``` and ```V``` as the types of the key and value fields. This is so that during
runtime, we can have maps of any type. ```K``` and ```V``` are generic classes in Java,
the type of which can be decided in runtime.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/HashMapImplementation-1.0-SNAPSHOT.jar
```