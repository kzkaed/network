(ns structure.namespaces)

(def namespaces
  ["x.y"])

(def set-of-ignored-ns
  #{"clojure.core"
    "clojure.tools.logging"
    "clojure.tools.logging.impl"
    "clojure.core.async.impl"
    "clojure.core.async.impl.ioc-macros"
    "clojure.core.async"})
