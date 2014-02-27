(fn f [s l]
  (if (= (count l) 1)
    l
    (cons (first l) (cons s (f s (rest l))))))
