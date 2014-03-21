(fn f [n]
  (if (= n 1)
    [1]
    (let [l (f (dec n))
          x (concat [0] l)
          y (concat l [0])]
      (map + x y))))
