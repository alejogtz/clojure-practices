<pre><code>
(defn calcula-la-abundancia-de
	([] -1)
	([x] ( - (reduce (fn [y z] ( if (== 0 (mod x z)) (+ y z) y )) (range 1 (inc x)) ) (* 2 x) ))	)
	
"***************************** Abundantes *************************************"

(defn es-número-abundante? 
	([] false)
	([x] (and (number? x)(pos? x)( > (reduce (fn [y z] ( if (== 0 (mod x z)) (+ y z) y )) (range 1 (inc x)) ) (* 2 x) ))))
	
(defn son-números-abundantes?
	([] false)
	([xs] (reduce (fn [x y] ( and (true? x) (es-número-abundante? y)) ) true xs)))

(defn los-abundantes-en
	([] [])
	([xs] (reduce ( fn [col x] (if (and (pos? x) (number? x) (es-número-abundante? x)) (conj col x) col )) [] xs ) ) )
		
(defn es-la-abundancia-de?
	([] false)
	([o] false)
	([x y] (== (calcula-la-abundancia-de x) y ) ))

(defn las-abundancias-de
	([] {})	
	([xs] 
	(reduce	(fn [col value] (if (and (number? value) (es-número-abundante? value))
					(conj col [value (calcula-la-abundancia-de value)]) (conj col [value -1]) )) {} xs )))


"Cualquier múltiplo propio de un número perfecto, y cualquier múltiplo de un número abundante es abundante."
(defn el-siguiente-número-abundante 
	[x]
	( if (and (number? x) (es-número-abundante? x) )		
		((comp (fn [lista] ( lista 1 ) ) (fn [n] ( los-abundantes-en (range x (* x x)) ) ) ) x) -1 ) )
		
"**************************** Defectivos *************************************"

(defn es-número-defectivo? 
	([] false)
	([x] ( and (number? x) (int? x)
	(> x (reduce ( fn [acum n] (if (int? (/ x n)) (+ acum n) acum  ) ) 0 (range 1 x))) )))
	
(defn son-números-defectivos?
	([] false)
	([xs] (and (vector? xs) (reduce (fn [x y] ( and (true? x) (es-número-defectivo? y)) ) true xs))
	))

(defn los-defectivos-en
	([] [])
	([xs] (reduce ( fn [coll x] (if (and (pos? x) (number? x) (es-número-defectivo? x)) (conj coll x) coll )) [] xs )))

(defn el-siguiente-número-defectivo 
	[x]
	( if (and (number? x) (es-número-defectivo? x) )
		((comp (fn [lista] ( lista 1 ) ) (fn [n] ( los-defectivos-en (range x (* x x)) ) ) ) x) -1 ) )

 
 </code></pre>
 
