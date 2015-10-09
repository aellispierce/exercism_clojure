(ns bob)

(defn response-for
  "Gives Bobs response"
  [sentence]
  (cond
    (=(last sentence) \?) "Sure."
    (=(last sentence) \!) "Whoa, chill out!"
    (every? #(Character/isUpperCase %) sentence) "Whoa, chill out!"
    (clojure.string/blank? sentence) "Fine. Be that way!"
    :else "Whatever."

  )
)
