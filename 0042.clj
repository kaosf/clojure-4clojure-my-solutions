(fn f [x] (if (= x 0) 1 (* x (f (dec x)))))
