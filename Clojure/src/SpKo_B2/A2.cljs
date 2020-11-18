(ns SpKo-B2.A2)

(defn facA [n] (if(> n 1) (apply * (range 1 (inc n))) 1))

(facA 3)

(defn facB [n] (if (> n 1) (* n (facB (dec n))) 1))

(defn facC [x] (loop [n x res 1] (if (>= 1 n) res (recur (dec n) (* res n)))))

(defn facD [n] (apply * (take n (iterate dec n))))