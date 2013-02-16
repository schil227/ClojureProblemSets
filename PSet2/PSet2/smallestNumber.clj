(ns ClojureProblemSet2.core)

( defn minfree [aSet]
  (loop [vect aSet val 0]
    (if (empty? vect) val
      (if (some #(= val %) vect)
        (recur vect (inc val))
         val
      )
    )
   )
 )

 (clojure.test/is (= 0 (minfree #{})))
    (clojure.test/is (= 2 (minfree #{ 0, 1 })))
    (clojure.test/is (= 2 (minfree #{ 1, 0 })))
    (clojure.test/is (= 2 (minfree #{ 0, 1, 8, 9 })))
    (clojure.test/is (= 0 (minfree #{ 1, 2, 3 })))
    (clojure.test/is (= 15 (minfree #{ 8, 23, 9, 0, 12, 11, 1, 10, 13, 7, 41, 4, 14, 21, 5, 17, 3, 19, 2, 6 })))