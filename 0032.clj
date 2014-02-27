(fn f [l]
  (if (empty? l)
    '()
    (let [x (first l)]
      (cons x (cons x (f (rest l)))))))
