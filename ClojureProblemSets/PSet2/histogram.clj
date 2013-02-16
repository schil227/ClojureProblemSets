(ns ClojureProblemSet2.core)

 (defn build-histogram
   [aStr] 
   (if (clojure.string/blank? aStr) {}
   (flatten (sort-by clojure.string/ (frequencies  aStr))))
   )



(clojure.test/is (= {} (build-histogram "")))
(clojure.test/is (= {\a 1, \b 1, \c 1}) 
    (build-histogram "cba"))
(clojure.test/is (= {\x 3})
    (build-histogram "xxx"))
(clojure.test/is (= {\space 3, \a 1, \c 2, \e 3, \h 1, \i 3, \, 2, \M 3, \N 1, \n 2, \o 2, \P 1, \r 2, \s 2, \t 1} 
    (build-histogram "Nic McPhee, Morris, Minnesota")))
