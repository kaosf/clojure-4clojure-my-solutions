(fn f [x]
  (if (empty? x)
    x
    (cons
      (last x)
      (f (drop-last x)))))
