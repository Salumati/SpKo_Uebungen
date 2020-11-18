(ns SpKo-B2.A8)

(defn sumrec [lst] (loop[lst lst res 0] (if (= (count lst) 0) res (recur (rest lst) (+ res (first lst))))))