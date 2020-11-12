(ns SpKo-B2.A1)
(def lst '(1 2 3 -4 -5 6 -7 8 9))
(defn pos [x] (> x 0))
((defn posF
  "get all numbers larger than 0"
  [lst]
  (filer pos lst)))


defn posR [lst] (if (empty? lst) nil (if (pos (first lst)) (concat (list(first lst)) (posR(rest lst))) (concat nil (posR(rest lst))))))