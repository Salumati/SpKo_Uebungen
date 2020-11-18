(ns SpKo-B2.A6)

(defn r3? [x] (= (rem x 3) 0))
(defn r5? [x] (= (rem x 5) 0))

(defn addT [x] (loop [n x res 0] (if (= n 0) res (if (or (r3? n) (r5? n)) (recur (dec n) (+ res n)) (recur (dec n) res)))))

(defn addT2 [] (loop [n 1000 res 0] (if (= n 0) res (if (or (r3? n) (r5? n)) (recur (dec n) (+ res n)) (recur (dec n) res)))))