##########################################
#     Funciones de Orden superior	     #
##########################################
1qyUsYN5Eo
*************<apply>**********************
( max 3 4 5 13 )
( apply max [3 5 4] ) 	; Se lee: Aplica la función MAX sobre una N cantidad de argumentos.
	=> 5
( apply max (3 5 4) )		
	=> ClassCastException java.lang.Long cannot be cast to clojure.lang.IFn
( apply max )			
	=> ArityException Wrong number of args (1) passed to: core/apply
( apply max [] )			
	=> ArityException Wrong number of args (0) passed to: core/apply
( apply max #{10 30 20})
	=> 30
( apply + [102 3 5 6] )		; Aplica la función suma sobre N cantidad de argumentos.
	=> 116
( apply max 0 [] )
	=> 0
( apply == [3 5 4] )
	=> false
( apply = [3 5 4] )
	=> false
	
*************<Map>**********************
; Aplica la funcion sobre cada uno de los elementos de la colección
( map func col ) => ( (f ele1) (f ele2) (f ele3) )

( map inc [2 3 4])		; Aplica la funcion de incremento sobre todos los elementos
	=> 	 (3 4 5)
( map + [ [3 4 5] [6 7 8] [9 75 4] ])	; ERROR
	=> ClassCastException Cannot cast clojure.lang.PersistentVector to java.lang.Number
( map count [ [1 23 4] [5 6 8 89] [3 5 8]] )
	=> (3 4 5)
( apply count [#{ #{2} #{} #{4 5 7}}])

( map count [#{ #{2} #{} #{4 5 7}}])

(apply + ( map count #{ #{2} #{} #{4 5 7}}) )	=> 4
 
 
 ************************<Filter>*************************************
	sintaxis: (filter f col)
 ( (f ele1) (f ele2) (f eleN) )
 
 
; Se lee: Es positivo? 
; ((pos? -3) (pos? 2) (pos? -2)...(pos? -4)) which would be the meaning of the previus expresion
 (filter pos? #{-3 2 -2 3 4 -4})
 
 (filter )
 
 --------------------<empty>-------------------------
(empty? (filter pos? [-5 -3 -7]) )
  
(filter
	(fn [x] (and (>= x 5) (<= x 15) ) )
		[-4 6 3 9 -5 14 -2])

-------------------<reduce>---------------------------
sintaxis: (reduce fn vi col)

; Aplica la operacion + 'suma' sobre 100 + 3, luego 100 + 3 +2... 100 + 3 + 2 - 4 + 7
(reduce + 100 [3 2 -4 7])
;*  (+ 100 3) -> 103
;* 	  (+ 103 2) -> 105
;*		 (+ 106 -4)	-> 101
;*			(+ 101 7) -> 108
;* => 108

--------------------<reduction>-------------------------

(filter > 1 [-3 5 -7 9])