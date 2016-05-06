;; gorilla-repl.fileformat = 1

;; **
;;; ## Loom's Function Call Graph
;; **

;; @@
(ns ^:doc loom
  (:require [clojure.pprint :refer [pprint]]
            [clojure.repl :refer :all]
            [gorilla-plot.core :refer :all]
            [gorilla-repl.html :refer :all]
            [gorilla-repl.latex :refer :all]
            [gorilla-repl.table :refer :all]
            [edgewise.core :refer :all]
            [edgewise.edgelist :refer :all]
            [clojure.java.io :as io]))
;; @@

;; **
;;; Start by loading the data into an Edgewise graph:
;; **

;; @@
(def g (edgelist->g (io/resource "loom-edges.csv")))
;; @@

;; @@
(count (:vertex-data g))
;; @@

;; @@
(count (:edge-data g))
;; @@

;; **
;;; ### Ranking the Vertices by Pagerank
;;; 
;;; _For a more in-depth discussion of how PageRank works, [see the documentation in Edgewise](http://viewer.gorilla-repl.org/view.html?source=github&user=bobbyno&repo=edgewise&path=doc/pagerank.clj)._
;; **

;; @@
(def ranks (pagerank g 500))
;; @@

;; **
;;; 
;; **

;; @@
(table-view (take 20 ranks))
;; @@

;; **
;;; ## 
;; **

;; **
;;; ### Ranking by Degree Centrality
;; **

;; @@
(defn degree-centrality [g direction]
  (map (fn [[k degree]] [k (degree direction)])
       (sort-by (fn [[k degree]] (degree direction)) > (degrees g))))
;; @@

;; @@
(table-view (take 20 (degree-centrality g :in)))
;; @@

;; @@
(table-view (take 20 (degree-centrality g :out)))
;; @@

;; **
;;; What vertices have no incoming edges?
;; **

;; @@
(filter #(zero? (second %)) (degree-centrality g :in))
;; @@

;; **
;;; ...that aren't tests?
;; **

;; @@
;; todo
;; @@

;; **
;;; It can also be insightful to look at the degree distribution to see if the data fits a power law seen in scale-free networks.
;; **

;; @@
(doc degree-distribution)
;; @@

;; @@
(compose (list-plot (into [] (:out (degree-distribution g))))
         
		 (list-plot (into [] (:in (degree-distribution g)))  
                    :color :red))
;; @@

;; **
;;; ### What do these metrics mean in this domain?
;; **

;; @@
;; todo
;; @@

;; **
;;; ### How can we navigate around the graph?
;;; 
;;; How do the extracted edges compare to the original code?
;;; https://github.com/aysylu/loom/blob/master/src/loom/label.cljc#L81
;; **

;; @@
(pprint (-> g (v (label-index g "loom.label/add-labeled-edges")) out (props :label)))
;; @@

;; **
;;; This commit seems like a weird decision given the testing focus in the prod library...can we see it in the network as such?
;;; 
;;; https://github.com/aysylu/loom/commit/42f7995a16eab9535273ff19dcd6db794c8975d2
;; **

;; **
;;; ### What does the namespace network look like for this graph?
;; **

;; @@
;; todo
;; @@

;; **
;;; 
;; **

;; **
;;; ### What other questions do you want to ask about this data?
;; **

;; @@

;; @@
