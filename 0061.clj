(fn f [keys vals]
  (if (or (empty? keys) (empty? vals))
    {}
    (conj (f (rest keys) (rest vals))
          (hash-map (first keys) (first vals)))))
