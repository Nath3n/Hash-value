The Prog2301 class demonstrates a basic implementation of a hash function in Java. It uses a simple hashing technique to compute hash values for a list of Java keywords, printing the resulting hash values along with their corresponding keywords. This class highlights how string values (keywords) can be hashed into a fixed-size hash table using a modulus operation to ensure positive hash values.

Features
Implements a hash function that takes a string key and computes its hash value based on its characters.
Uses a prime multiplier (37) and a modulus operation to ensure that the hash values are within a specified table size.
Outputs a list of Java keywords with their respective hash values based on a table size of 46.
