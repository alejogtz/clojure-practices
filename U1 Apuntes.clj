;; Filter
    ; Filtra los elementos que cumplen la expresion dada
    (filter even? [1 2 3 4 5 6 7])
    =>  ()

;; Map
    ; Mapea la función dada sobre un conjuto de elementos, 
    ; es decir, 
    ; Aplica la funcion dada sobre cada uno de los elemementos de la coleccion
    (map sig 10 [1 2 3 4 5 6])
    => [11 12 13 14 15 16]

;; Apply
    ; Aplica la funcion dada de manera incremental sobre un conjunto de elementos
    (apply + (1 2 3 4 5))
    =>  15
;; Reduce
    ; Aplica la funcion dada sobre el argumento dado y sobre cada uno de los elementos de la coleccion

;; ' apostrofe evita la evaluacion de los simbolos 

    ;; Secuencia  ==  (1 2 3 4 5 6)
    ;; Vector     ==  [1 2 3 4 5 6]
    ;; Conjunto   ==  #{1 2 3 4 5}
    ;; Mapa       ==  {:a 10 :b 20 :c 30}


;; EJERCICIOS   
