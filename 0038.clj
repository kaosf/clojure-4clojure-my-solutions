(fn m [x & xs]
  (if (empty? xs)
    x
    (let
      [y (apply m xs)]
      (if (> x y) x y))))
