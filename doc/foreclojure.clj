;; gorilla-repl.fileformat = 1

;; **
;;; ## 4clojure's Function Call Graph
;; **

;; @@
(ns ^:doc foreclojure
  (:require [clojure.pprint :refer [pprint]]
            [clojure.repl :refer :all]
            [gorilla-plot.core :refer :all]
            [gorilla-repl.html :refer :all]
            [gorilla-repl.latex :refer :all]
            [gorilla-repl.table :refer :all]
            [edgewise.core :refer :all]
            [edgewise.edgelist :refer :all]
            [edgewise.tgf :refer :all]
            [clojure.java.io :as io]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; **
;;; Start by loading the data into an Edgewise graph:
;; **

;; @@
(def g (edgelist->g (io/resource "foreclojure-edges-uniq.csv")))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foreclojure/g</span>","value":"#'foreclojure/g"}
;; <=

;; @@
(count (:vertex-data g))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>365</span>","value":"365"}
;; <=

;; @@
(count (:edge-data g))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>1092</span>","value":"1092"}
;; <=

;; **
;;; ### Ranking the Vertices by Pagerank
;;; 
;;; _For a more in-depth discussion of how PageRank works, [see the documentation in Edgewise](http://viewer.gorilla-repl.org/view.html?source=github&user=bobbyno&repo=edgewise&path=doc/pagerank.clj)._
;; **

;; @@
(def ranks (pagerank g 500))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foreclojure/ranks</span>","value":"#'foreclojure/ranks"}
;; <=

;; **
;;; 
;; **

;; @@
(table-view (take 20 ranks))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/str&quot;</span>","value":"\"clojure.core/str\""},{"type":"html","content":"<span class='clj-double'>0.022142683190961392</span>","value":"0.022142683190961392"}],"value":"[\"clojure.core/str\" 0.022142683190961392]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;somnium.congomongo/fetch-one&quot;</span>","value":"\"somnium.congomongo/fetch-one\""},{"type":"html","content":"<span class='clj-double'>0.01572320959881293</span>","value":"0.01572320959881293"}],"value":"[\"somnium.congomongo/fetch-one\" 0.01572320959881293]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/seq&quot;</span>","value":"\"clojure.core/seq\""},{"type":"html","content":"<span class='clj-double'>0.01348011883457035</span>","value":"0.01348011883457035"}],"value":"[\"clojure.core/seq\" 0.01348011883457035]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/seq?&quot;</span>","value":"\"clojure.core/seq?\""},{"type":"html","content":"<span class='clj-double'>0.012145102510103298</span>","value":"0.012145102510103298"}],"value":"[\"clojure.core/seq?\" 0.012145102510103298]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/from-mongo&quot;</span>","value":"\"foreclojure.utils/from-mongo\""},{"type":"html","content":"<span class='clj-double'>0.010971109643645904</span>","value":"0.010971109643645904"}],"value":"[\"foreclojure.utils/from-mongo\" 0.010971109643645904]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.template/html-doc&quot;</span>","value":"\"foreclojure.template/html-doc\""},{"type":"html","content":"<span class='clj-double'>0.00889607189988194</span>","value":"0.00889607189988194"}],"value":"[\"foreclojure.template/html-doc\" 0.00889607189988194]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;useful.config/load-config&quot;</span>","value":"\"useful.config/load-config\""},{"type":"html","content":"<span class='clj-double'>0.008495385933302443</span>","value":"0.008495385933302443"}],"value":"[\"useful.config/load-config\" 0.008495385933302443]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.config/config&quot;</span>","value":"\"foreclojure.config/config\""},{"type":"html","content":"<span class='clj-double'>0.007875205683527457</span>","value":"0.007875205683527457"}],"value":"[\"foreclojure.config/config\" 0.007875205683527457]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;noir.session/get&quot;</span>","value":"\"noir.session/get\""},{"type":"html","content":"<span class='clj-double'>0.007647548582572564</span>","value":"0.007647548582572564"}],"value":"[\"noir.session/get\" 0.007647548582572564]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/flash-fn&quot;</span>","value":"\"foreclojure.utils/flash-fn\""},{"type":"html","content":"<span class='clj-double'>0.00706863940656449</span>","value":"0.00706863940656449"}],"value":"[\"foreclojure.utils/flash-fn\" 0.00706863940656449]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/into&quot;</span>","value":"\"clojure.core/into\""},{"type":"html","content":"<span class='clj-double'>0.006693987878565128</span>","value":"0.006693987878565128"}],"value":"[\"clojure.core/into\" 0.006693987878565128]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/list&quot;</span>","value":"\"clojure.core/list\""},{"type":"html","content":"<span class='clj-double'>0.0065168428794970526</span>","value":"0.0065168428794970526"}],"value":"[\"clojure.core/list\" 0.0065168428794970526]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;compojure.core/routes&quot;</span>","value":"\"compojure.core/routes\""},{"type":"html","content":"<span class='clj-double'>0.00617921982374618</span>","value":"0.00617921982374618"}],"value":"[\"compojure.core/routes\" 0.00617921982374618]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/get-in&quot;</span>","value":"\"clojure.core/get-in\""},{"type":"html","content":"<span class='clj-double'>0.006144909063497953</span>","value":"0.006144909063497953"}],"value":"[\"clojure.core/get-in\" 0.006144909063497953]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/true?&quot;</span>","value":"\"clojure.core/true?\""},{"type":"html","content":"<span class='clj-double'>0.0061364656840514386</span>","value":"0.0061364656840514386"}],"value":"[\"clojure.core/true?\" 0.0061364656840514386]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;ring.util.response/redirect&quot;</span>","value":"\"ring.util.response/redirect\""},{"type":"html","content":"<span class='clj-double'>0.006130896742118305</span>","value":"0.006130896742118305"}],"value":"[\"ring.util.response/redirect\" 0.006130896742118305]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;somnium.congomongo/update!&quot;</span>","value":"\"somnium.congomongo/update!\""},{"type":"html","content":"<span class='clj-double'>0.005707249925559395</span>","value":"0.005707249925559395"}],"value":"[\"somnium.congomongo/update!\" 0.005707249925559395]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/user-attribute&quot;</span>","value":"\"foreclojure.utils/user-attribute\""},{"type":"html","content":"<span class='clj-double'>0.00557724963100297</span>","value":"0.00557724963100297"}],"value":"[\"foreclojure.utils/user-attribute\" 0.00557724963100297]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/get-user&quot;</span>","value":"\"foreclojure.utils/get-user\""},{"type":"html","content":"<span class='clj-double'>0.005400740510475156</span>","value":"0.005400740510475156"}],"value":"[\"foreclojure.utils/get-user\" 0.005400740510475156]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/even?&quot;</span>","value":"\"clojure.core/even?\""},{"type":"html","content":"<span class='clj-double'>0.005327192042038938</span>","value":"0.005327192042038938"}],"value":"[\"clojure.core/even?\" 0.005327192042038938]"}],"value":"#gorilla_repl.table.TableView{:contents ([\"clojure.core/str\" 0.022142683190961392] [\"somnium.congomongo/fetch-one\" 0.01572320959881293] [\"clojure.core/seq\" 0.01348011883457035] [\"clojure.core/seq?\" 0.012145102510103298] [\"foreclojure.utils/from-mongo\" 0.010971109643645904] [\"foreclojure.template/html-doc\" 0.00889607189988194] [\"useful.config/load-config\" 0.008495385933302443] [\"foreclojure.config/config\" 0.007875205683527457] [\"noir.session/get\" 0.007647548582572564] [\"foreclojure.utils/flash-fn\" 0.00706863940656449] [\"clojure.core/into\" 0.006693987878565128] [\"clojure.core/list\" 0.0065168428794970526] [\"compojure.core/routes\" 0.00617921982374618] [\"clojure.core/get-in\" 0.006144909063497953] [\"clojure.core/true?\" 0.0061364656840514386] [\"ring.util.response/redirect\" 0.006130896742118305] [\"somnium.congomongo/update!\" 0.005707249925559395] [\"foreclojure.utils/user-attribute\" 0.00557724963100297] [\"foreclojure.utils/get-user\" 0.005400740510475156] [\"clojure.core/even?\" 0.005327192042038938]), :opts nil}"}
;; <=

;; **
;;; ### Ranking by Degree Centrality
;; **

;; @@
(defn degree-centrality [g direction]
  (map (fn [[k degree]] [k (degree direction)])
       (sort-by (fn [[k degree]] (degree direction)) > (degrees g))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foreclojure/degree-centrality</span>","value":"#'foreclojure/degree-centrality"}
;; <=

;; @@
(doc degrees)
;; @@
;; ->
;;; -------------------------
;;; edgewise.core/degrees
;;; ([g])
;;;   Returns a map from the :label of the vertices of g to the number of edges of the vertex as [out-degree in-degree].
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(table-view (take 20 (degree-centrality g :in)))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/seq&quot;</span>","value":"\"clojure.core/seq\""},{"type":"html","content":"<span class='clj-unkown'>55</span>","value":"55"}],"value":"[\"clojure.core/seq\" 55]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/seq?&quot;</span>","value":"\"clojure.core/seq?\""},{"type":"html","content":"<span class='clj-unkown'>46</span>","value":"46"}],"value":"[\"clojure.core/seq?\" 46]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/str&quot;</span>","value":"\"clojure.core/str\""},{"type":"html","content":"<span class='clj-unkown'>45</span>","value":"45"}],"value":"[\"clojure.core/str\" 45]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;noir.session/get&quot;</span>","value":"\"noir.session/get\""},{"type":"html","content":"<span class='clj-unkown'>29</span>","value":"29"}],"value":"[\"noir.session/get\" 29]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/get-user&quot;</span>","value":"\"foreclojure.utils/get-user\""},{"type":"html","content":"<span class='clj-unkown'>19</span>","value":"19"}],"value":"[\"foreclojure.utils/get-user\" 19]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;somnium.congomongo/fetch-one&quot;</span>","value":"\"somnium.congomongo/fetch-one\""},{"type":"html","content":"<span class='clj-unkown'>18</span>","value":"18"}],"value":"[\"somnium.congomongo/fetch-one\" 18]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/first&quot;</span>","value":"\"clojure.core/first\""},{"type":"html","content":"<span class='clj-unkown'>17</span>","value":"17"}],"value":"[\"clojure.core/first\" 17]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/list&quot;</span>","value":"\"clojure.core/list\""},{"type":"html","content":"<span class='clj-unkown'>17</span>","value":"17"}],"value":"[\"clojure.core/list\" 17]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;compojure.core/routes&quot;</span>","value":"\"compojure.core/routes\""},{"type":"html","content":"<span class='clj-unkown'>17</span>","value":"17"}],"value":"[\"compojure.core/routes\" 17]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.template/html-doc&quot;</span>","value":"\"foreclojure.template/html-doc\""},{"type":"html","content":"<span class='clj-unkown'>17</span>","value":"17"}],"value":"[\"foreclojure.template/html-doc\" 17]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/map&quot;</span>","value":"\"clojure.core/map\""},{"type":"html","content":"<span class='clj-unkown'>15</span>","value":"15"}],"value":"[\"clojure.core/map\" 15]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clout.core/route-compile&quot;</span>","value":"\"clout.core/route-compile\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"clout.core/route-compile\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;compojure.core/make-route&quot;</span>","value":"\"compojure.core/make-route\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"compojure.core/make-route\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/flash-error&quot;</span>","value":"\"foreclojure.utils/flash-error\""},{"type":"html","content":"<span class='clj-unkown'>13</span>","value":"13"}],"value":"[\"foreclojure.utils/flash-error\" 13]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/from-mongo&quot;</span>","value":"\"foreclojure.utils/from-mongo\""},{"type":"html","content":"<span class='clj-unkown'>12</span>","value":"12"}],"value":"[\"foreclojure.utils/from-mongo\" 12]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;somnium.congomongo/update!&quot;</span>","value":"\"somnium.congomongo/update!\""},{"type":"html","content":"<span class='clj-unkown'>12</span>","value":"12"}],"value":"[\"somnium.congomongo/update!\" 12]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/chunked-seq?&quot;</span>","value":"\"clojure.core/chunked-seq?\""},{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}],"value":"[\"clojure.core/chunked-seq?\" 11]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;hiccup.element/link-to&quot;</span>","value":"\"hiccup.element/link-to\""},{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}],"value":"[\"hiccup.element/link-to\" 11]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/chunk-rest&quot;</span>","value":"\"clojure.core/chunk-rest\""},{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}],"value":"[\"clojure.core/chunk-rest\" 11]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;clojure.core/chunk-first&quot;</span>","value":"\"clojure.core/chunk-first\""},{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}],"value":"[\"clojure.core/chunk-first\" 11]"}],"value":"#gorilla_repl.table.TableView{:contents ([\"clojure.core/seq\" 55] [\"clojure.core/seq?\" 46] [\"clojure.core/str\" 45] [\"noir.session/get\" 29] [\"foreclojure.utils/get-user\" 19] [\"somnium.congomongo/fetch-one\" 18] [\"clojure.core/first\" 17] [\"clojure.core/list\" 17] [\"compojure.core/routes\" 17] [\"foreclojure.template/html-doc\" 17] [\"clojure.core/map\" 15] [\"clout.core/route-compile\" 14] [\"compojure.core/make-route\" 14] [\"foreclojure.utils/flash-error\" 13] [\"foreclojure.utils/from-mongo\" 12] [\"somnium.congomongo/update!\" 12] [\"clojure.core/chunked-seq?\" 11] [\"hiccup.element/link-to\" 11] [\"clojure.core/chunk-rest\" 11] [\"clojure.core/chunk-first\" 11]), :opts nil}"}
;; <=

;; @@
(table-view (take 20 (degree-centrality g :out)))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.template/html-doc&quot;</span>","value":"\"foreclojure.template/html-doc\""},{"type":"html","content":"<span class='clj-unkown'>36</span>","value":"36"}],"value":"[\"foreclojure.template/html-doc\" 36]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/show-solutions-page&quot;</span>","value":"\"foreclojure.problems/show-solutions-page\""},{"type":"html","content":"<span class='clj-unkown'>33</span>","value":"33"}],"value":"[\"foreclojure.problems/show-solutions-page\" 33]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/run-code&quot;</span>","value":"\"foreclojure.problems/run-code\""},{"type":"html","content":"<span class='clj-unkown'>26</span>","value":"26"}],"value":"[\"foreclojure.problems/run-code\" 26]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.mongo/reconcile-solved-count&quot;</span>","value":"\"foreclojure.mongo/reconcile-solved-count\""},{"type":"html","content":"<span class='clj-unkown'>26</span>","value":"26"}],"value":"[\"foreclojure.mongo/reconcile-solved-count\" 26]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/code-box&quot;</span>","value":"\"foreclojure.problems/code-box\""},{"type":"html","content":"<span class='clj-unkown'>25</span>","value":"25"}],"value":"[\"foreclojure.problems/code-box\" 25]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/problems-routes&quot;</span>","value":"\"foreclojure.problems/problems-routes\""},{"type":"html","content":"<span class='clj-unkown'>23</span>","value":"23"}],"value":"[\"foreclojure.problems/problems-routes\" 23]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.users/user-profile&quot;</span>","value":"\"foreclojure.users/user-profile\""},{"type":"html","content":"<span class='clj-unkown'>23</span>","value":"23"}],"value":"[\"foreclojure.users/user-profile\" 23]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.core/dynamic-routes&quot;</span>","value":"\"foreclojure.core/dynamic-routes\""},{"type":"html","content":"<span class='clj-unkown'>23</span>","value":"23"}],"value":"[\"foreclojure.core/dynamic-routes\" 23]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.settings/do-update-settings!&quot;</span>","value":"\"foreclojure.settings/do-update-settings!\""},{"type":"html","content":"<span class='clj-unkown'>21</span>","value":"21"}],"value":"[\"foreclojure.settings/do-update-settings!\" 21]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.core/host-handlers&quot;</span>","value":"\"foreclojure.core/host-handlers\""},{"type":"html","content":"<span class='clj-unkown'>20</span>","value":"20"}],"value":"[\"foreclojure.core/host-handlers\" 20]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/create-problem&quot;</span>","value":"\"foreclojure.problems/create-problem\""},{"type":"html","content":"<span class='clj-unkown'>20</span>","value":"20"}],"value":"[\"foreclojure.problems/create-problem\" 20]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.users/get-ranked-users&quot;</span>","value":"\"foreclojure.users/get-ranked-users\""},{"type":"html","content":"<span class='clj-unkown'>19</span>","value":"19"}],"value":"[\"foreclojure.users/get-ranked-users\" 19]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/record-golf-score!&quot;</span>","value":"\"foreclojure.problems/record-golf-score!\""},{"type":"html","content":"<span class='clj-unkown'>15</span>","value":"15"}],"value":"[\"foreclojure.problems/record-golf-score!\" 15]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/approve-problem&quot;</span>","value":"\"foreclojure.problems/approve-problem\""},{"type":"html","content":"<span class='clj-unkown'>15</span>","value":"15"}],"value":"[\"foreclojure.problems/approve-problem\" 15]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.settings/settings-page&quot;</span>","value":"\"foreclojure.settings/settings-page\""},{"type":"html","content":"<span class='clj-unkown'>15</span>","value":"15"}],"value":"[\"foreclojure.settings/settings-page\" 15]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/edit-problem&quot;</span>","value":"\"foreclojure.problems/edit-problem\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"foreclojure.problems/edit-problem\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/store-completed-state!&quot;</span>","value":"\"foreclojure.problems/store-completed-state!\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"foreclojure.problems/store-completed-state!\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.ring/wrap-debug&quot;</span>","value":"\"foreclojure.ring/wrap-debug\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"foreclojure.ring/wrap-debug\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.graphs/un-group&quot;</span>","value":"\"foreclojure.graphs/un-group\""},{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"}],"value":"[\"foreclojure.graphs/un-group\" 14]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.login/try-to-email&quot;</span>","value":"\"foreclojure.login/try-to-email\""},{"type":"html","content":"<span class='clj-unkown'>13</span>","value":"13"}],"value":"[\"foreclojure.login/try-to-email\" 13]"}],"value":"#gorilla_repl.table.TableView{:contents ([\"foreclojure.template/html-doc\" 36] [\"foreclojure.problems/show-solutions-page\" 33] [\"foreclojure.problems/run-code\" 26] [\"foreclojure.mongo/reconcile-solved-count\" 26] [\"foreclojure.problems/code-box\" 25] [\"foreclojure.problems/problems-routes\" 23] [\"foreclojure.users/user-profile\" 23] [\"foreclojure.core/dynamic-routes\" 23] [\"foreclojure.settings/do-update-settings!\" 21] [\"foreclojure.core/host-handlers\" 20] [\"foreclojure.problems/create-problem\" 20] [\"foreclojure.users/get-ranked-users\" 19] [\"foreclojure.problems/record-golf-score!\" 15] [\"foreclojure.problems/approve-problem\" 15] [\"foreclojure.settings/settings-page\" 15] [\"foreclojure.problems/edit-problem\" 14] [\"foreclojure.problems/store-completed-state!\" 14] [\"foreclojure.ring/wrap-debug\" 14] [\"foreclojure.graphs/un-group\" 14] [\"foreclojure.login/try-to-email\" 13]), :opts nil}"}
;; <=

;; **
;;; ## Potential YAGNI
;;; 
;;; What vertices have no incoming edges?
;; **

;; @@
(filter #(zero? (second %)) (degree-centrality g :in))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.core/register-heartbeat&quot;</span>","value":"\"foreclojure.core/register-heartbeat\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.core/register-heartbeat\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.problems/mongo-key-from-number&quot;</span>","value":"\"foreclojure.problems/mongo-key-from-number\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.problems/mongo-key-from-number\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.core/app&quot;</span>","value":"\"foreclojure.core/app\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.core/app\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.ring/wrap-debug&quot;</span>","value":"\"foreclojure.ring/wrap-debug\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.ring/wrap-debug\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.core/-main&quot;</span>","value":"\"foreclojure.core/-main\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.core/-main\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.mongo/prepare-mongo&quot;</span>","value":"\"foreclojure.mongo/prepare-mongo\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.mongo/prepare-mongo\" 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;foreclojure.utils/image-builder&quot;</span>","value":"\"foreclojure.utils/image-builder\""},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[\"foreclojure.utils/image-builder\" 0]"}],"value":"([\"foreclojure.core/register-heartbeat\" 0] [\"foreclojure.problems/mongo-key-from-number\" 0] [\"foreclojure.core/app\" 0] [\"foreclojure.ring/wrap-debug\" 0] [\"foreclojure.core/-main\" 0] [\"foreclojure.mongo/prepare-mongo\" 0] [\"foreclojure.utils/image-builder\" 0])"}
;; <=

;; **
;;; It can also be insightful to look at the degree distribution to see if the data fits a power law seen in scale-free networks.
;; **

;; @@
(doc degree-distribution)
;; @@
;; ->
;;; -------------------------
;;; edgewise.core/degree-distribution
;;; ([g])
;;;   Returns a map from :out and :in degrees k to the number of vertices with degree k in g.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(compose (list-plot (into [] (:out (degree-distribution g))))
         
		 (list-plot (into [] (:in (degree-distribution g)))  
                    :color :red))
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"e291c967-98c5-471b-a96a-49ff6941b779","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"e291c967-98c5-471b-a96a-49ff6941b779","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}],"data":[{"name":"e291c967-98c5-471b-a96a-49ff6941b779","values":[{"x":0,"y":194},{"x":7,"y":7},{"x":20,"y":2},{"x":1,"y":33},{"x":4,"y":24},{"x":15,"y":3},{"x":21,"y":1},{"x":33,"y":1},{"x":13,"y":2},{"x":36,"y":1},{"x":6,"y":6},{"x":25,"y":1},{"x":3,"y":20},{"x":12,"y":5},{"x":2,"y":16},{"x":23,"y":3},{"x":19,"y":1},{"x":11,"y":5},{"x":9,"y":6},{"x":5,"y":16},{"x":14,"y":4},{"x":26,"y":2},{"x":10,"y":6},{"x":8,"y":6}]},{"name":"50e738ce-b0df-4ade-9a6b-6cbc4a292544","values":[{"x":0,"y":7},{"x":7,"y":3},{"x":1,"y":213},{"x":55,"y":1},{"x":46,"y":1},{"x":4,"y":10},{"x":15,"y":1},{"x":13,"y":1},{"x":29,"y":1},{"x":6,"y":11},{"x":17,"y":4},{"x":3,"y":25},{"x":12,"y":2},{"x":2,"y":55},{"x":19,"y":1},{"x":11,"y":4},{"x":9,"y":9},{"x":5,"y":6},{"x":14,"y":2},{"x":45,"y":1},{"x":10,"y":2},{"x":18,"y":1},{"x":8,"y":4}]}],"marks":[{"type":"symbol","from":{"data":"e291c967-98c5-471b-a96a-49ff6941b779"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"fill":{"value":"steelblue"},"fillOpacity":{"value":1}},"update":{"shape":"circle","size":{"value":70},"stroke":{"value":"transparent"}},"hover":{"size":{"value":210},"stroke":{"value":"white"}}}},{"type":"symbol","from":{"data":"50e738ce-b0df-4ade-9a6b-6cbc4a292544"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"fill":{"value":"red"},"fillOpacity":{"value":1}},"update":{"shape":"circle","size":{"value":70},"stroke":{"value":"transparent"}},"hover":{"size":{"value":210},"stroke":{"value":"white"}}}}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"e291c967-98c5-471b-a96a-49ff6941b779\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"e291c967-98c5-471b-a96a-49ff6941b779\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}], :data ({:name \"e291c967-98c5-471b-a96a-49ff6941b779\", :values ({:x 0, :y 194} {:x 7, :y 7} {:x 20, :y 2} {:x 1, :y 33} {:x 4, :y 24} {:x 15, :y 3} {:x 21, :y 1} {:x 33, :y 1} {:x 13, :y 2} {:x 36, :y 1} {:x 6, :y 6} {:x 25, :y 1} {:x 3, :y 20} {:x 12, :y 5} {:x 2, :y 16} {:x 23, :y 3} {:x 19, :y 1} {:x 11, :y 5} {:x 9, :y 6} {:x 5, :y 16} {:x 14, :y 4} {:x 26, :y 2} {:x 10, :y 6} {:x 8, :y 6})} {:name \"50e738ce-b0df-4ade-9a6b-6cbc4a292544\", :values ({:x 0, :y 7} {:x 7, :y 3} {:x 1, :y 213} {:x 55, :y 1} {:x 46, :y 1} {:x 4, :y 10} {:x 15, :y 1} {:x 13, :y 1} {:x 29, :y 1} {:x 6, :y 11} {:x 17, :y 4} {:x 3, :y 25} {:x 12, :y 2} {:x 2, :y 55} {:x 19, :y 1} {:x 11, :y 4} {:x 9, :y 9} {:x 5, :y 6} {:x 14, :y 2} {:x 45, :y 1} {:x 10, :y 2} {:x 18, :y 1} {:x 8, :y 4})}), :marks ({:type \"symbol\", :from {:data \"e291c967-98c5-471b-a96a-49ff6941b779\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 1}}, :update {:shape \"circle\", :size {:value 70}, :stroke {:value \"transparent\"}}, :hover {:size {:value 210}, :stroke {:value \"white\"}}}} {:type \"symbol\", :from {:data \"50e738ce-b0df-4ade-9a6b-6cbc4a292544\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :fill {:value :red}, :fillOpacity {:value 1}}, :update {:shape \"circle\", :size {:value 70}, :stroke {:value \"transparent\"}}, :hover {:size {:value 210}, :stroke {:value \"white\"}}}})}}"}
;; <=

;; **
;;; ### What namespaces have the most functions?
;;; 
;;; Collect the set of labels.
;;; 
;; **

;; @@
()
;; @@

;; **
;;; ### How can we navigate around the graph?
;;; 
;;; How do the extracted edges compare to the original code?
;;; https://github.com/aysylu/loom/blob/master/src/loom/label.cljc#L81
;; **

;; @@
(-> g (v (label-index g "foreclojure.utils/get-user")) in (props :label) pprint)
;; @@
;; ->
;;; [[&quot;foreclojure.golf/opt-in-page&quot;]
;;;  [&quot;foreclojure.golf/set-golfer&quot;]
;;;  [&quot;foreclojure.home/welcome-page&quot;]
;;;  [&quot;foreclojure.problems/code-box&quot;]
;;;  [&quot;foreclojure.problems/next-problem-link&quot;]
;;;  [&quot;foreclojure.problems/reject-problem&quot;]
;;;  [&quot;foreclojure.problems/show-solutions&quot;]
;;;  [&quot;foreclojure.problems/show-solutions-page&quot;]
;;;  [&quot;foreclojure.problems/wants-no-javascript-codebox?&quot;]
;;;  [&quot;foreclojure.settings/do-update-settings!&quot;]
;;;  [&quot;foreclojure.settings/settings-page&quot;]
;;;  [&quot;foreclojure.users/follow-user&quot;]
;;;  [&quot;foreclojure.users/generate-datatable-users-list&quot;]
;;;  [&quot;foreclojure.users/generate-user-list&quot;]
;;;  [&quot;foreclojure.users/get-solved&quot;]
;;;  [&quot;foreclojure.users/sort-by-following&quot;]
;;;  [&quot;foreclojure.users/user-profile&quot;]
;;;  [&quot;foreclojure.users/users-routes&quot;]
;;;  [&quot;foreclojure.utils/get-theme&quot;]]
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; **
;;; This commit seems like a weird decision given the testing focus in the prod library...can we see it in the network as such?
;;; 
;;; https://github.com/aysylu/loom/commit/42f7995a16eab9535273ff19dcd6db794c8975d2
;; **

;; **
;;; ### What does the namespace network look like for this graph?
;;; 
;;; 
;; **

;; @@
(defn line->edge
  [g csv-dyad]
  (let [[outv inv] (clojure.string/split csv-dyad #",")
        [ons _] (clojure.string/split outv #"/")
        [ins _] (clojure.string/split inv #"/")]
    (add-edge g ons ins)))

(defn edgelist->nsg [file]
  (with-open [r (clojure.java.io/reader file)]
    (reduce line->edge (empty-graph) (line-seq r))))
;; @@

;; @@
(def ns-g (edgelist->nsg (io/resource "loom-edges.csv")))
;; @@

;; @@
(g->edgelist-csv ns-g "resources/ns-network.csv")
;; @@

;; **
;;; The network still has duplicate edges at this point. We can remove them with sort and uniq for now and reload. Removing self-loops gets the data ready for visualization with something like Gephi.
;; **

;; @@
(def ns-g (remove-self-loops (edgelist->g (io/resource "ns-network-uniq.csv"))))
;; @@

;; @@
(g->edgelist-csv ns-g "resources/ns-network-no-loops.csv")
;; @@

;; @@
(->tgf g "/tmp/fn-graph.tgf")
;; @@

;; **
;;; ### What other questions do you want to ask about this data?
;; **

;; @@

;; @@
