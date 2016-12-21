(ns calculator.core
  (:import (java.util Scanner)))

(def scan (Scanner. *in*))
(def fst "enter first value: ")
(def scd "enter second value: ")

(defn add []
  (println fst)
  (let [fst-val (.nextInt scan)]
    (println scd)
    (let [scd-val (.nextInt scan)]
      (println (str
                  "The sum is: " (+ fst-val scd-val))))))

(defn sub []
  (println fst)
  (let [fst-val (.nextInt scan)]
    (println scd)
    (let [scd-val (.nextInt scan)]
      (println (str
                  "The difference is: " (- fst-val scd-val))))))

(defn mlt []
  (println fst)
  (let [fst-val (.nextInt scan)]
    (println scd)
    (let [scd-val (.nextInt scan)]
      (println (str
                  "The product is: " (* fst-val scd-val))))))

(defn div []
  (println fst)
  (let [fst-val (.nextInt scan)]
    (println scd)
    (let [scd-val (.nextInt scan)]
      (println (str
                  "The quotient is: " (/ fst-val scd-val))))))

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
      :else "exiting program...")))

(defn -main
  "Simple calculator app"
  [& args]
  (operation-menu))
