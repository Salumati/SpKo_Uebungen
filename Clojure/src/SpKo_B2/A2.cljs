(ns SpKo-B2.A2)



(defn facB [n] (if (> n 1) (* n (facB (dec n))) 1))