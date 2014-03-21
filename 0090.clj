(fn [x y] (apply hash-set (for [i x j y] [i j])))
