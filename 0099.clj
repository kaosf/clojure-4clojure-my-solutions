(fn [x y] (map #(Integer/parseInt %) (map str (seq (str (* x y))))))
