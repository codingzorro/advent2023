(ns advent2023.day01)

(defn- as-number
  "convert [1 2] into 12"
  [[a b]]
  (+ (* a 10) b))

(defn decode
  "extract digits in a string; e.g. \"a1b2\" --> [1 2]"
  [a-string]
  (->> a-string
    (re-seq #"\d")
    (map #(Integer/parseInt %))))

(defn to-int
  "Create a two-digit integer using the first and last elements of a given
  array of digits"
  [an-array]
  (->> an-array
    (#(vector (first %) (last %)))
    as-number))

(defn solution
  "Calculate the sum of the calibration of each one of the given lines"
  [decoder lines]
  (->> lines
    (map decoder)
    (map to-int)
    (reduce +)))

(defn morning01
  [lines]
  (solution decode lines))
