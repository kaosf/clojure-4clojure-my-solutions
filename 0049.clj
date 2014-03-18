(fn [x l]
  [(take x l)
   (take-last (- (count l) x) l)])
