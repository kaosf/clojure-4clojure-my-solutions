#(
  do
    (defn fib [x] (if (or (= x 1) (= x 2)) 1 (+ (fib (- x 1)) (fib (- x 2)))))
    (map fib (map inc (range %))))
; This is not suitable for the answer because of using "def"!
