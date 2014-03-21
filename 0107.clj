(fn [x] (fn [y] (apply * (take x (repeat y)))))
