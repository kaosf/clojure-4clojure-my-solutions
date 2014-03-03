(fn [l n]
  (map (fn [[i x]] x)
       (filter (fn [[i x]]
                 (not= (mod i n)
                       (dec n)))
               (map-indexed (fn [i x] [i x])
                            l))))
