(fn [v c] (reduce conj {} (map (fn [k] {k v}) c)))
