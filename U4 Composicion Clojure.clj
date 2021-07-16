; -********************************************************
                COMPOSICIÓN
; -********************************************************

"Los numeros pares triplicados"
"Triplicados los numeros pares"

f(x) = x*3;
g(x) = x%2==0

"Los numeros pares triplicados"
f(x)°g(x)

"Triplicados los numeros pares"
g(x)°f(x)

(defn triple [x] (x*3))

(defn pares [xs] 
    (filter even? xs)  )

(defn triplicados [x]
     (map 
        (fn [x] (* 3 x)) x )
     )




     ((comp triplicados pares) [1 2 3 4 5 6])


; Let
( let [xs[10 20 30 40 50]]
    (map vector xs (rest xs))
    )