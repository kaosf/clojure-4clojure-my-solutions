(fn f [s l]
  (case (count l)
    0 '()
    1 l
    (cons (first l) (cons s (f s (rest l))))))
