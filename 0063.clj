(fn g [f l]
  (if (empty? l)
    {}
    (let [x (first l)
          k (f x)
          m (g f (rest l))]
      (assoc m k (conj (m k) x)))))
