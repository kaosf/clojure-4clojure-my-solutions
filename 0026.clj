#(
  do
    (defn fib [x] (if (or (= x 1) (= x 2)) 1 (+ (fib (- x 1)) (fib (- x 2)))))
    (map fib (map inc (range %))))
; This is not suitable for the answer because of using "def"!

(fn [n]
  (map
    (fn fib [x]
      (if (or (= x 1) (= x 2))
        1
        (+ (fib (- x 1)) (fib (- x 2)))))
    (map inc (range n))))

(fn fib [n]
  (case n
    1 '(1)
    2 '(1 1)
    (concat
      (fib (dec n))
      (list
        (+
          (last (fib (- n 1)))
          (last (fib (- n 2))))))))
