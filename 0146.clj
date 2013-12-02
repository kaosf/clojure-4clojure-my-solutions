(fn [input]
  (apply hash-map
    (reduce concat
      (for [row input
            col (second row)
            :let [row-name (first row)
                  col-name (first col)
                  body (second col)]]
        [[row-name col-name] body]))))
