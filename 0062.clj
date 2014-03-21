(fn g [f x] (cons x (lazy-seq (g f (f x)))))
