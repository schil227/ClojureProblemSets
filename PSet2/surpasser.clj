(ns ClojureProblemSet2.core)
(use 'clojure.test)



(defn num-surpassers [aSeq]
  
  )


(defn max-surpasser-count [aSeq]
  (apply max (num-surpassers))
  )

;(is (= 5 (num-surpassers "generating")))
;(is (= 6 (num-surpassers "enerating")))
;(is (= 2 (num-surpassers "nerating")))
;(is (= 5 (num-surpassers "erating")))
;Tests for max-surpasser-count
;(is (= 0 (max-surpasser-count [5])))
;(is (= 0 (max-surpasser-count [\a])))
;(is (= 0 (max-surpasser-count [1 0])))
;(is (= 1 (max-surpasser-count [0 1])))
;(is (= 6 (max-surpasser-count [\g \e \n \e \r \a \t \i \n \g])))
;(is (= 6 (max-surpasser-count "generating")))
 (apply max [1 2 3 4 5 5 4 2 12 3])