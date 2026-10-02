# Day 29 - Graphs

## 📌 Internship
**Internnova Java Development Internship**

## 🎯 Objective

The objective of Day 29 is to understand **Graph Data Structures** and learn important graph traversal, cycle detection, shortest path, topological sorting, minimum spanning tree, and graph-based problem-solving techniques.

## 📚 Topics Covered

### Graph Basics
- Introduction to Graphs
- Types of Graphs Based on Edges
- Graph Representations
- Graph Applications
- Creating a Graph using Adjacency List

### Graph Traversal
- BFS (Breadth First Search)
- DFS (Depth First Search)
- Finding Path using DFS

### Graph Problems
- Connected Components
- Cycle in Graphs
- Cycle Detection in Undirected Graph using DFS
- Bipartite Graph
- Cycle Detection in Directed Graph using DFS

### Topological Sorting
- Topological Sorting using DFS
- Topological Sort using BFS (Kahn's Algorithm)
- Topological Sort using BFS Code
- All Paths from Source to Target

### Shortest Path Algorithms
- Dijkstra's Algorithm
- Dijkstra's Algorithm Code
- Bellman-Ford Algorithm
- Bellman-Ford Code
- Cheapest Flights within K Stops

### Minimum Spanning Tree
- What is MST?
- Prim's Algorithm
- Prim's Code
- Connecting Cities
- Connecting Cities Code
- Kruskal's Algorithm

### Other Graph Topics
- Disjoint Set Union
- Flood Fill Algorithm
- Graph Practice Questions

## 🌐 What is a Graph?

A **Graph** is a non-linear data structure consisting of:

- **Vertices (Nodes)**
- **Edges**

Graphs are used to represent relationships and connections between different entities.

Examples include:

- Computer networks
- Road networks
- Social networks
- Flight routes
- Communication systems

## 🔹 Types of Graphs

Graphs can be classified based on their edges, including:

- Directed Graph
- Undirected Graph
- Weighted Graph
- Unweighted Graph

## 🔗 Graph Representation

Graphs can be represented using different methods.

One commonly used representation is the **Adjacency List**.



Adjacency Lists are useful for efficiently storing sparse graphs.

## 🔍 BFS - Breadth First Search

**BFS** traverses a graph level by level.

It generally uses a **Queue**.

### Basic Idea

1. Start from a source vertex.
2. Mark it as visited.
3. Add it to the queue.
4. Remove a vertex from the queue.
5. Visit its unvisited neighbours.
6. Continue until the queue becomes empty.

## 🔎 DFS - Depth First Search

**DFS** explores a graph deeply before backtracking.

It can be implemented using:

* Recursion
* Stack

DFS is useful for:

* Path finding
* Connected components
* Cycle detection
* Graph traversal

## 🔄 Cycle Detection

Cycle detection determines whether a graph contains a cycle.

Different approaches are used for:

* Undirected Graphs
* Directed Graphs

DFS can be used to detect cycles by keeping track of visited vertices and their relationships.

## ⚖️ Bipartite Graph

A graph is **bipartite** if its vertices can be divided into two sets such that no two vertices within the same set are directly connected.

Bipartite graphs can be checked using graph traversal and coloring.

## 📋 Topological Sorting

Topological sorting is used for **Directed Acyclic Graphs (DAGs)**.

It produces an ordering of vertices such that for every directed edge:


u → v


`u` appears before `v`.

### Methods Covered

* DFS-based Topological Sort
* BFS-based Topological Sort
* Kahn's Algorithm

## 🛣️ Shortest Path

### Dijkstra's Algorithm

Dijkstra's Algorithm is used to find shortest paths from a source vertex in graphs with non-negative edge weights.

### Bellman-Ford Algorithm

Bellman-Ford is another shortest path algorithm and can handle negative edge weights.

## ✈️ Cheapest Flights Within K Stops

This problem applies shortest-path concepts to find the cheapest route between cities while limiting the number of allowed stops.

## 🌲 Minimum Spanning Tree

A **Minimum Spanning Tree (MST)** connects all vertices of a weighted graph with minimum possible total edge weight.

### Algorithms Covered

* Prim's Algorithm
* Kruskal's Algorithm

## 🔗 Disjoint Set Union

**Disjoint Set Union (DSU)** is a data structure used to maintain a collection of non-overlapping sets.

It is commonly used in:

* Kruskal's Algorithm
* Connected Components
* Cycle Detection

Important operations include:

* Find
* Union

## 🌊 Flood Fill Algorithm

Flood Fill is used to replace connected regions of the same value.

It can be implemented using:

* BFS
* DFS

A common application is the **paint bucket tool** in image editing.

## 🧠 Key Concepts Learned

* Graphs consist of vertices and edges.
* Graphs can be represented using adjacency lists.
* BFS uses level-order traversal with a queue.
* DFS explores vertices deeply using recursion or a stack.
* DFS can be used for path finding and cycle detection.
* Topological sorting is used for directed acyclic graphs.
* Dijkstra and Bellman-Ford are shortest-path algorithms.
* Prim's and Kruskal's algorithms are used for MST.
* DSU helps efficiently manage connected components.
* Flood Fill can be solved using BFS or DFS.

## ⏱️ Important Complexity Concepts

| Topic               | Typical Complexity        |
| ------------------- | ------------------------- |
| BFS                 | `O(V + E)`                |
| DFS                 | `O(V + E)`                |
| Topological Sort    | `O(V + E)`                |
| Dijkstra            | Depends on implementation |
| Bellman-Ford        | `O(VE)`                   |
| Prim's Algorithm    | Depends on implementation |
| Kruskal's Algorithm | `O(E log E)`              |

`V` = Number of vertices
`E` = Number of edges

## 💻 Java Concepts Used

* Classes and Objects
* ArrayList
* LinkedList / Queue
* PriorityQueue
* Recursion
* Arrays
* Adjacency List
* Graph Traversal
* HashSet
* Disjoint Set Union



## 📈 Day 29 Progress

* [x] Learned Graph Basics
* [x] Learned Graph Types
* [x] Studied Graph Representations
* [x] Created Graph using Adjacency List
* [x] Learned BFS
* [x] Learned DFS
* [x] Practiced Path Finding using DFS
* [x] Studied Connected Components
* [x] Learned Cycle Detection
* [x] Studied Bipartite Graphs
* [x] Learned Topological Sorting
* [x] Learned Kahn's Algorithm
* [x] Studied Dijkstra's Algorithm
* [x] Studied Bellman-Ford Algorithm
* [x] Learned Minimum Spanning Trees
* [x] Practiced Prim's Algorithm
* [x] Practiced Kruskal's Algorithm
* [x] Learned Disjoint Set Union
* [x] Practiced Flood Fill

## 🔗 Connection with Previous Topics

Day 29 continues the Data Structures and Algorithms journey after learning about:

* **AVL Trees**
* **Heaps**
* **Priority Queues**
* **Tries**

Graphs introduce another important non-linear data structure used to represent relationships and connections.

## 🚀 Key Takeaway

Graphs are powerful data structures used to model real-world relationships and networks. Day 29 provided practice with **graph traversal, path finding, cycle detection, topological sorting, shortest paths, minimum spanning trees, DSU, and Flood Fill**.

## 🏷️ Tags

#Java #DSA #Graphs #BFS #DFS #Dijkstra #BellmanFord #MST #Prim #Kruskal #TopologicalSort #DSU #FloodFill #DataStructures #Algorithms #Internnova #JavaDevelopment #Day29

```
```
