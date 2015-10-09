(ns bob)


(defn response-for
  "Gives Bobs response"
  [sentence]
  (cond
    (clojure.string/blank? sentence) "Fine. Be that way!"
    (and (not (empty? (every? #(Character/isUpperCase %) (filter #(Character/isLetter %) sentence))))) "Whoa, chill out!"
    (=(last sentence) \!) "Whoa, chill out!"
    (=(last sentence) \?) "Sure."
    :else "Whatever."

  )
)
