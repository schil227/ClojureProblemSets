(ns trigram) 
(use '[clojure.string :only (split)])


(defn generateTrigram [strArr]
  (take-while #(= (count %) 3) 
    (map #(take 3 %) 
      (take (count strArr) (iterate rest strArr) ))))

(defn countOccurrences [vecOfTrigrams] 
  (frequencies vecOfTrigrams)
  
  )

(defn splitOnSpaces [bigString]
   (filter #(not= "" %) (split bigString #"\s"))
  )

(defn tri-gram-from-files [& [setOfFiles]]
   (apply merge-with + (pmap #(countOccurrences (generateTrigram (splitOnSpaces (slurp %)) )) setOfFiles))
  
  )

(println (tri-gram-from-files ["src/Baltimora.jpg", "src/Baltimora.jpg"]));["src/allswell.txt", "src/GBAddress.txt", "http://shakespeare.mit.edu/asyoulikeit/full.html","http://shakespeare.mit.edu/comedy_errors/full.html"]))

(print "thats all?")
;(reduce #(assoc %1 %2 (inc (%1 %2 0)))
;	        {}
;	        (re-seq #"\w+" s))