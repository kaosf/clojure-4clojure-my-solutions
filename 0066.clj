(fn [x y]
  (apply max
         (filter #(= 0 (+ (mod x %) (mod y %)))
                 (range 1 (inc (min x y))))))
