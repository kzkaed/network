## Code as Network

Part of an ongoing experiment in analyzing the function call graph of Clojure projects.

### Datasets

Included in the `resources` directory are the function call graphs as adjacency lists from:

#### [Loom](https://github.com/aysylu/loom)

loom-edges.csv contains 1846 edges and 414 vertices extracted from commit `cef64fe`.

loom-all.csv contains 6147 edges: loom-edges was produced by removing duplicates from loom-all with `sort loom-all.csv | uniq > loom.csv`.


### Getting Started

Start the Gorilla REPL: `lein run gorilla`

Open a new terminal and open one of the worksheets: `make loom`
