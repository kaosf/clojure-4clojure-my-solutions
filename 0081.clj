(fn [a b]
  ((fn f [a]
     (if (empty? a)
       #{}
       (let [x (first a)
             xs (f (rest a))]
         (if (true? (some #(= % x) b))
           (conj xs x)
           xs))))
    a))
