(fn f [x]
  (if (empty? (rest x))
    x
    (if (= (first x) (second x))
      (f (rest x))
      (cons (first x) (f (rest x))))))
