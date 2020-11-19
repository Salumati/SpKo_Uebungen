(ns SpKo-B2.A7)
(defn el [x lst] (filter #(not= % x) lst))
(defn elB [x lst] (loop[x x lst (el x lst) res '()] (if (empty? lst) res (recur x (rest lst) (if (list? (first lst)) (concat res (list (el 2 (first lst)))) )))))


(defn elC [x lst] (loop[x x lst (el x lst) res '()] (if (empty? lst) res (recur x (rest lst) (if (list? (first lst)) (concat res (list (elB 2 (first lst)))) )))))