(ns SpKo-B2.A3)
(def lst '(1 2 3 -4 -5 6 -7 8 9))
(defn lastEl [lst] (if (empty? (rest lst)) (first lst) (lastEl (rest lst))))