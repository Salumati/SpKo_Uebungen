(ns SpKo-B2.A3)
(defn defn [lastEl param2 param3]
  )

(defn lastEl [lst] (if (empty? (rest lst)) (first lst) (lastEl (rest lst))))