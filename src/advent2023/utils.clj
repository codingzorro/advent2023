(ns advent2023.utils
  (:require [advent2023.utils :as u]
            [clojure.string :as str]))

(defn parse-aoc-file
  "convert the typical Advent Of Code file into a seq of lines"
  [file-name]
  (->> file-name
    slurp
    (str/split-lines)))

