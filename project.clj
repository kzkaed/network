(defproject gorilla-template "0.1.0-SNAPSHOT"
  :description ""
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [edgewise "0.3.0"]]
  :pedantic? :warn
  :profiles {:dev {:plugins [[lein-gorilla "0.3.6"]]}
             :test {:dependencies [[gorilla-repl "0.3.6"]]}}
  :test-paths ["test" "doc"]
  :test-selectors {:default (fn [m] (not (or (:perf m) (:doc m))))
                   :perf :perf
                   :doc :doc})
