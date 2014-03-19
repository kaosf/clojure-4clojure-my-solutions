(fn f [a b]
  (if (empty? a)
    #{}
    (let [x (first a)
          xs (f (rest a) b)]
      (if (true? (some #(= % x) b))
        (conj xs x)
        xs))))
