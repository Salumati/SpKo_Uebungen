(ns SpKo-B2.A5)
(def lst '(1 2 3 -4 -5 6 -7 8 9))
(defn rev [lst] (if (empty? lst) '() (concat (rev (rest lst)) (list(first lst)))))