(fn f
  ([v] v)
  ([v operator operand & rest]
    (apply f (cons (operator v operand) rest))))
