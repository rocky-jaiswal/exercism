(ns two-fer)

(defn two-fer [ &[name]]
  (if (nil? name) (str "One for you, one for me") (str "One for " name ", one for me")))
