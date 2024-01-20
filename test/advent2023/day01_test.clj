(ns advent2023.day01-test
  (:require [clojure.test :refer :all]
            [advent2023.utils :refer :all]
            [advent2023.day01 :refer :all]))


(def sample-data
  (parse-aoc-file "resources/day01-sample-input.txt"))

(deftest decode-test
  (testing "Extract the digits in a given string"
    (is (= (decode (sample-data 0)) [1 2]))
    (is (= (decode (sample-data 1)) [3 8]))
    (is (= (decode (sample-data 2)) [1 2 3 4 5]))
    (is (= (decode (sample-data 3)) [7]))))

(deftest to-int-test
  (testing "Extract the digits in a given string"
    (is (= (to-int [1 2]) 12))
    (is (= (to-int [3 8]) 38))
    (is (= (to-int [1 3 5]) 15))
    (is (= (to-int [7 7]) 77))
    ))

(deftest morning01-test
  (testing "calibration of a list of lines"
    (is (= (morning01 sample-data) 142))))

; uncomment the following line to evaluate the solution using the full input
; (morning01 (parse-aoc-file "resources/day01-full-input.txt"))
