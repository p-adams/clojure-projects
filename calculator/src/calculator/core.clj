(ns calculator.core
  (:import (java.util Scanner)))


(def scan (Scanner. *in*))

;;(let [val (.nextInt scan)]
    ;;val)

(defn add [] (println "add"))
(defn sub [] (println "sub"))
(defn mlt [] (println "mlt"))
(defn div [] (println "div"))


(defn operation-menu []
  (println "choose from the options below: ")
  (println "a) + ")
  (println "b) - ")
  (println "c) * ")
  (println "d) / ")
  (println "e) exit")
  (let [operation (read-line)]
    (cond
      (= operation "a") (add)
      (= operation "b") (sub)
      (= operation "c") (mlt)
      (= operation "d") (div)
      :else "exit")))

(defn -main
  "Simple calculator app"
  [& args]
  (operation-menu))

(defn reload []
  (use 'calculator.core :reload))