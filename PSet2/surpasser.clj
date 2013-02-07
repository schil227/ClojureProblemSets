(ns ClojureProblemSet2.core)
(use 'clojure.test)



(defn num-surpassers [aSeq]
  (loop [firstVal (first aSeq) restSeq (rest aSeq) rtn 0]
    (if (empty? restSeq) rtn
     (if (< (compare firstVal (first restSeq)) 0)
            (recur firstVal (rest restSeq) (inc rtn))
            (recur firstVal (rest restSeq) rtn)
       )      
      )
    )
  )

(defn num-surpassers-handler [aSeq]
  
  )

(defn max-surpasser-count [aSeq]

  (apply max (num-surpassers-handler aSeq))
  )

(is (= 5 (num-surpassers "generating")))
(is (= 6 (num-surpassers "enerating")))
(is (= 2 (num-surpassers "nerating")))
(is (= 5 (num-surpassers "erating")))
;Tests for max-surpasser-count
;(is (= 0 (max-surpasser-count [5])))
;(is (= 0 (max-surpasser-count [\a])))
(is (= 0 (max-surpasser-count [1 0])))
;(is (= 1 (max-surpasser-count [0 1])))
;(is (= 6 (max-surpasser-count [\g \e \n \e \r \a \t \i \n \g])))
;(is (= 6 (max-surpasser-count "generating")))

       