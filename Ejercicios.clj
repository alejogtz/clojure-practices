(defn diferencia-de-uno? [x y] (== (max x y) (inc (min x y))))

(diferencia-de-uno? 10 11)
(diferencia-de-uno? 11 10)
(diferencia-de-uno? -11 -11)
(diferencia-de-uno? -11 -10)
(diferencia-de-uno? -10 -11)

let [alfa [\a \á \b \cdeéfghiíjklmnñoópqrstuúüvwxyz]]
(
    defn cifrado-mediante-ROT13 [cadena]
    let [alfa [\a \á \b \c \d \e \é \f \g \h \i \í \j \k \l \m \n \ñ \o \ó \p \q \r \s \t \u \ú \ü \v \w \x \y \z]]
    (

    )
)

(defn cifrado-mediante-ROT13 [cadena]
    (let [alfa [\a \á \b \c \d \e \é \f \g \h \i \í \j \k \l \m \n \ñ \o \ó \p \q \r \s \t \u \ú \ü \v \w \x \y \z]]
        (
            apply
            (fn [letra] (  get (+ (.indexOf alfa letra) 13) letra ))
            cadena
        )
    )
)
(string? cadena nil)

(cifrado-mediante-ROT13 "Hello")


(let [a "alejo" b (clojure.string/upper-case a)]  (apply str (concat a b)))


(defn ROT13 [textoclaro]
  
  (let [minuscula "aábcdeéfghiíjklmnñoópqrstuúüvwxyz"
        mayuscula "AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ"]
    
    (defn calcular-posicion [actual]
      (mod (+ actual 13) 33))
    
    (defn auxiliar [recorrer c]
      (if (empty? recorrer)
        c
        (auxiliar (rest recorrer)
                (apply str (concat c
                                   (str (if (Character/isLetter (first recorrer))
                                          (if (Character/isLowerCase (first recorrer))
                                            (get minuscula (calcular-posicion
                                                        (clojure.string/index-of minuscula (first recorrer))))
                                            (get mayuscula (calcular-posicion
                                                        (clojure.string/index-of mayuscula (first recorrer)))))
                                          (first recorrer)
                                          )
                                        )
                                   )
                       )
                )
        )
      )

    (apply str (auxiliar textoclaro ""))
   
  ))

;; ------------------------

(defn pos [i] (cond  (nil? i) -1

                        (or(and (> i 19) (< i 33)) (> i 52)) (- i 20) 

                        :else (+ i 13)))

(defn rot13 [x] (let [abc "aábcdeéfghiíjklmnñoópqrstuúüvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ"]

                           (or (get abc ( pos (clojure.string/index-of abc x)) )
                               x
                            )
                )
)

(defn cifrado-mediante-ROT13 [c] (apply str (if (string? c) (map rot13 c))))
;; --------------------
(defn cifrado-mediante-ROT13 [texto]
  (cond
    (string?  texto) ( ROT13 texto)
    :else "")
  )
;; =================================
(defn [x]
(
    cond
        (>= (clojure.string/index-of alfaMin x) 0) (get alfaMin (mod (+ (clojure.string/index-of alfaMin x) 13) (.length alfaMin)) )
        (>= (clojure.string/index-of alfaMay x) 0) (get alfaMay (mod (+ (clojure.string/index-of alfaMay x) 13) (.length alfaMay)))
        :else x
        )
)

(defn nueva-pos [i] (
    (mod (+ (clojure.string/index-of alfaMin x) 13) 33)
))

(defn cifrado-mediante-ROT13 [cadena]
    (
        let [alfaMin "aábcdeéfghiíjklmnñoópqrstuúüvwxyz" alfaMay (clojure.string/upper-case alfaMin)]
            (
                apply 
                str
                (
                    map
                    (fn [x] (
                        cond
                        (>= (clojure.string/index-of alfaMin x) 0) (get alfaMin (clojure.string/index-of pos) )
                        (>= (clojure.string/index-of alfaMay x) 0) 
                        :else x
                    ))
                    cadena
                )
            )  
    )
)


;; dasklkjfdkjdsakjdnas

(defn rot13 [x] (let alfa "aábcdeéfghiíjklmnñoópqrstuúüvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ")

)


(defn pos [i] (cond  (nil? i) -1

                        (or(and (> i 19) (< i 33)) (> i 52)) (- i 20) 

                        :else (+ i 13)))


(defn rot13 [x] (let [abc "aábcdeéfghiíjklmnñoópqrstuúüvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ"]





                           (or (get abc 

                                    (pos (clojure.string/index-of abc x)))

                               x)))

(defn cifrado-mediante-ROT13 [c] (apply str (if (string? c) (map rot13 c))))
;;dsakjdkjaskjdjkasd


(get "aábcdeéfghiíjklmnñoópqrstuúüvwxyz" (mod (+ (.indexOf "aábcdeéfghiíjklmnñoópqrstuúüvwxyz" "a") 13) 33))

(cifrado-mediante-ROT13 "hello Worl")

(>= 0 (.indexOf "aábcdeéfghiíjklmnñoópqrstuúüvwxyz" "b"))

;; ===================================
(
    let [a "Alejo"](
        apply str (
            concat
                (rest a)
                (rest a)
        )        
    
)

(defn nuevapos [i] (mod (+ i 13) 33))

(defn reemplazar
	[char](let [alfa "aábcdeéfghiíjklmnñoópqrstuúüvwxyz" alfaupper "AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ" ]
	(cond (clojure.string/index-of alfa char) ( get alfa (nuevapos (clojure.string/index-of alfa char)) )
         (clojure.string/index-of alfaupper char) ( get alfaupper (nuevapos (clojure.string/index-of alfaupper char))) :else char))
)

(defn cifrar-string-rot13 [textoPlano](apply str(map reemplazar textoPlano)))

(defn cifrado-mediante-ROT13 [arg] (if (string? arg) (cifrar-string-rot13 arg) ""))

(= (cifrado-mediante-ROT13 "Hola Mundo") ())


(.indexOf "Hola " " ")


    

