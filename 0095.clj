(fn f [x]
  (or (and
        (counted? x)
        (= (count x) 3)
        (and (f (second x)) (f (last x))))
      (nil? x)))
