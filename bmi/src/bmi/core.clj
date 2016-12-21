(ns bmi.core
  (:import (java.util Scanner)))

(def scan (Scanner. *in*))

(defn calc-result [result]
  (cond
    (< result 18.5) "Underweight"
    (and (>= result 18.5 ) (<= result 24.9)) "Normal"
    (and (>= result 25) (<= result 29.9)) "Overweight"
     :else "Obese"))

(defn get-std-height []
  (println "Height: ")
  (let [h (.nextInt scan)]
    h))

(defn get-std-weight []
  (println "weight: ")
  (let [w (.nextInt scan)]
    w))

(defn get-met-height []
  (println "Height: ")
  (let [h (.nextDouble scan)]
    h))

(defn get-met-weight []
  (println "weight: ")
  (let [w (.nextDouble scan)]
    w))

(defn eng-calc []
  (let [height (get-std-height)
        weight (get-std-weight)
        result (* (float(/ weight (* height height))) 703)]
          (calc-result result)))

(defn met-calc []
  (let [height (get-met-height)
        weight (get-met-weight)
        result (* (float(/ weight (* height height))))]
          (calc-result result)))

(defn calc-bmi []
  (println "1) English ")
  (println "2) Metric ")
  (println "Enter 1 for lbs and inches; 2 for Kg and meters ")
  (let [option (read-line)]
    (case option
      "1" (eng-calc)
      "2" (met-calc))))

(defn -main
  "Body mass index calculator."
  [& args]
  (calc-bmi))
