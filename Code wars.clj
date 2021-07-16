(defn suma-digitos-al-cubo
	[cadena] 
	( reduce (fn [acumulador letra] (+ acumulador  (int (Math/pow (- (int letra) 48) 3))  ) ) 0 cadena ))
	
(defn reverse-string 
	[cadena]
	( apply str ( reverse cadena) ))

	
(defn rotate-string-by-1
	[cadena]
	;(apply str ( str (apply str(rest cadena)) (first cadena) ) ))	
	(str (apply str (rest cadena)) (str (first cadena)) ))
	
(defn split-by-sz
	[cadena sz]
	(   ))
	
(defn revrot
	[strng sz]
	; Funcion para concatenar
	((comp (fn [col] (apply str col))
	; Funcion para rotar o reverse
	(fn [col] (reduce (fn [col cadena] (if (int? (/ (suma-digitos-al-cubo cadena) 2) )
		(conj col (reverse-string cadena) ) (conj col rotate-string-by-1 cadena )  )) [] col ))
	; Funcion para separar la palabra en pedazos dados
	(fn [digits size] 
	( reduce (fn [col dig] (if (>= (count dig) 5) (conj col (apply str (take sz (drop (* (count col) 5) dig)))) col) ) [] digits ) ) ) strng sz))

(defn tostring [sequence] (apply str sequence))

(defn h 
	[digits size]	
	( reduce
	(fn [col dig] (if (>= (count dig) 5)  (conj col (apply str (take 5 (drop (* (count col) 5) dig)))  )  col   ))
	[] ))

(h 5 "sdkaskdkjasdkjaskjdkajs")
	

(revrot "12345" 5)	

(suma-digitos-al-cubo "22222")
(reverse-string "1234567890")
(rotate-string-by-1 "Alejo")

((comp str inc +) 1 2 3 4 5 )
