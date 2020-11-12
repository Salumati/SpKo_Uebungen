(ns SpKo-B2.A7)
(defn elA [x lst] (if(empty? lst) nil (if (= (first lst) x) (el x (rest lst)) (concat (list(first lst)) (el x (rest lst))))))

