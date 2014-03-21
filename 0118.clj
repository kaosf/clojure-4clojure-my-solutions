(fn g [f l]
  (if (empty? l)
    '()
    (cons (f (first l)) (lazy-seq (g f (rest l))))))
