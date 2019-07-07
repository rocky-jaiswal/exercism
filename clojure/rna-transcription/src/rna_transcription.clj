(ns rna-transcription)

(def complementcode {"G" "C", "C" "G", "T" "A", "A" "U", "U" "A"})

(defn is-invalid [input]
  (not (every? #{"G" "C" "T" "A" "U"} input)))

(defn to-rna [dna]
  (when 
    (is-invalid (clojure.string/split dna #""))
    (throw (AssertionError. "Wrong input.")))
  (clojure.string/join ""
    (map (fn [s] (complementcode s))
      (clojure.string/split dna #""))))

