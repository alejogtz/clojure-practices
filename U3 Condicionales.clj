********************************************************************
                        CONDICIONALES
********************************************************************

            ###### IF sentence.  #########
; =================>
(if true 10 20)
; =================>
(if (< 5 3) [1 2 3] [-1 -2 -3])
; =================>
(   let [x 10 y 20]
        (
         if (<= x y) [x x x x x] [y y y y y]
        )
)
; =================>
(
if (pos? 7)
    ( let [x 5 y 2]  (* x y) )
    ( let [x 4 y 3]  (+ x y) )        
)

; =================>
(
 let [x 2 y 4]
 (
     + 
        (if (>= x y)  (* 2 x) (* 3 y) )
        (if (<= y x)  (+ 4 y) (+ 5 x) )
        (* (* 6 x) (+ 7 y) )
 )    
)
; =================>
(
 let [x 3 y 4]
    {
        :a [
            [(dec x) x (inc x)]
            [(dec y) y (inc y)]
        ]
        :b {
            :a (
                if (pos? x) [x (inc x)] [y (inc y)]
            )
            :b (
                if (pos? y) (* -1 y) y
            )
        }
    }
)



            ###### COND sentence.  #########
Sintaxis:
(
 cond
    exp1 exp2
    exp3 exp4
    expN expN+1
    :else expN+2
)

; Si la exp es true se ejecuta la exp de su derecha
; Si todas son false se ejecuta la expresion a la derecha de la palabra reservada :else


(defn la-estación-del-año-de [mes]
    (   ; Let
        let [
                estaciones
                (
                    hash-map :primavera #{:marzo :abril :mayo}
                             :verano #{:junio :julio :agosto}
                             :otoño #{:septiembre :octubre :noviembre}
                             :invierno #{:diciembre :enero :febrero}
                )
            ]
        ; Begin
        (
            cond ((estaciones :primavera) mes) :primavera
             ((estaciones :verano) mes) :verano
             ((estaciones :otoño) mes) :otoño
             ((estaciones :invierno) mes) :invierno
        )
    )
)


            ###### CASE sentence.  #########

; Sintaxis
(
    case exp1
        val1    exp2
        val2    exp3
        val3    exp4
        valN    expN+1
        expN+2
)

; ********************************************************************************************************+






;**********************************************************************************************************
; Ejercicio 1   Insertar 5 en [1 2 3 4 6 7]

; Se debe razonar la salida xD
(let [x 10 xs [3 4 6 7 8]]
 (  into []
    (   concat 
            (filter (fn [y] (< y x) ) xs)
            [x]
            (filter (fn [y] (> y x) ) xs)
    )
 )
)


; -------------------------------------- <Reverse> ---------------------------------------------------

( reverse [3 5 7] )

( reverse "Hol\tab\na" )

( reverse {:a 1 :b 2 :r 4})


; -------------------------------------- <Sort> ---------------------------------------------------

(into [] ( sort [4 6 4 7 0 4 2 1]) )

(sort '(34 465 765 8 2 28))     ; Here, the output shows a sorted sequence
(sort  (34 465 765 8 2 28))     ; And here, it doesn't, 'cause >'< element is missing
(sort  [0xFF 0x88 0xAAAA])
(map  char ( sort [(int \c) (int \i) (int \g) (int \e)]
           )
)

(
    let [xs [4 7 9 3 5 7 3 1 8 6 5]](
        ; Cuerpo del Algoritmo
        
    )
)


