(ns SpKo-B2.A2)

(defn facA [n] (if(> n 1) (apply * (range 1 (inc n))) 1))

(defn facB [n] (if (> n 1) (* n (facB (dec n))) 1))

