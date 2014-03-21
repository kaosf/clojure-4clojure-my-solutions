(fn [v1 v2]
  (apply +
         (map-indexed
           (fn [i x] (* x (v2 i)))
           v1)))
