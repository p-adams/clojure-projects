(ns calculator.core
  (:import (java.util Scanner)))

(def scan (Scanner. *in*))



(defn get-op []
  (println "Enter first val")
  (let [val (.nextInt scan)]
    val))

(defn operation-menu []
  (println "choose from the options below: ")
  (println "a) + ")
  (println "b) - ")
  (println "c) * ")
  (println "d) / ")
  (println "e) exit"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn reload []
  (use 'calculator.core :reload))