(ns armstrong-numbers)

(defn to-arr [num]
  (clojure.string/split (str num) #""))

(defn sum [arr]
  (reduce + (map
             (fn [e] (.pow (BigInteger. e) (count arr))) arr)))

(defn armstrong? [num]
  (= (BigInteger. (str num))
     (BigInteger. (str (let [arr (to-arr num)]
                         (sum arr))))))
