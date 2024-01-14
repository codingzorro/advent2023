(ns advent2023.day01-test
  (:require [clojure.test :refer :all]
            [advent2023.day01 :refer :all]))

(deftest decode-test
  (testing "Extract the digits in a given string"
    (is (= (decode "1abc2") [1 2]))
    (is (= (decode "pqr3stu8vwx") [3 8]))
    (is (= (decode "a1b2c3d4e5f") [1 2 3 4 5]))
    (is (= (decode "treb7uchet") [7]))
    ))

(deftest to-int-test
  (testing "Extract the digits in a given string"
    (is (= (to-int [1 2]) 12))
    (is (= (to-int [3 8]) 38))
    (is (= (to-int [1 3 5]) 15))
    (is (= (to-int [7 7]) 77))
    ))
