(ns cljs-api-gen.config)

;; location of the clojure & clojurescript repos to parse
(def repos-dir "repos")

(def edn-result-file "autodocs.edn")
(def refs-dir "refs")

;; location of the documents generated by this program
(def ^:dynamic *output-dir* nil)

