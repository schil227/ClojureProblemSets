(ns ClojureProblemSet2.core)

( defn intoCamelCase [words]
  (let [ word ( clojure.string/split words #"-")]
     (apply str (first word) (map clojure.string/capitalize (rest word)))
    )
 )

(clojure.test/is (= (intoCamelCase "something") "something"))
(clojure.test/is (= (intoCamelCase "multi-word-key") "multiWordKey"))
(clojure.test/is (= (intoCamelCase "leaveMeAlone") "leaveMeAlone"))
(clojure.test/is (= (intoCamelCase "leave-All-the-spaghetti-on-The-FLOOR") "leaveAllTheSpaghettiOnTheFloor"))