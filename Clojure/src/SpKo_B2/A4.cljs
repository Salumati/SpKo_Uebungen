(ns SpKo-B2.A4)
(def lst '(1 2 3 -4 -5 6 -7 8 9))
(defn brack [x] (conj nil x))
(defn brackets [lst] (map brack lst))