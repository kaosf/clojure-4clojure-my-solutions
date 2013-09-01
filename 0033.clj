(fn [c n]
  (reduce
    concat
    (map #(take n (repeat %)) c)))
