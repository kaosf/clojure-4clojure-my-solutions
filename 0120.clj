(fn [l]
  (count
    (filter
      (fn [x]
        (< x
           (apply +
                  (map #(let [y (Integer/parseInt (str %))]
                          (* y y))
                       (str x)))))
      l)))
