(fn f [a b]
  (if (or (empty? a) (empty? b))
    nil
    (cons (first a) (cons (first b) (f (rest a) (rest b))))))
