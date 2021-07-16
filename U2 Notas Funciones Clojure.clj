			Funciones Genericas o Polimorficas

Secuencia: Listas, conjuntos, mapas, vectores, string

Funciones: count, first&rest, cons, last&drop-last

tipos de aridad: variable, multiple
	
----------------------<Extra notes>--------------------------------
caracter:	\a \b \c \d \e \f \g \h ... \z

----------------------<Abreviaturas>-------------------------------
col: coleccion
-------------------------------------------------------------------

******************************************
*		First & rest					*
******************************************
(first (list 10 20 30))
(first (hash-map :a 10 :b 20 :c 30))
(rest  (hash-map :a 10 :b 20 :c 30))



******************************************
*		Last & drop-last				*
******************************************
	 (last 	 (vector 10 20 30))
	 (drop-last(vector 10 20 30))
(last(drop-last(vector 10 20 30)))
(last(drop-last(drop-last(vector 10 20 30))))

(last(hash-map[:a 10 :b 20 :c 30]))

******************************************
*		cons							*
******************************************
; Cons <<Se utiliza para insertar cosas>>
(cons ele col)
(cons 10 (vector))
(cons 20(cons 10 (vector)))
(cons 30(cons 20(cons 10 (vector))))
(cons 30(cons 20(cons 10 (hash-set))))

(cons [:a 30] ( cons [:b 20] ( cons [:c 10](hash-map) ) ) )
******************************************
*		conj							*
******************************************
; ---------------------------------------------< CONJ (oin) >-------------------------------------------------
( conjunto generico elemento )

( conj (vector) 10 )
( conj ( conj ( vector ) 10) 20)
( conj ( conj ( conj (vector) 10) 20) 30)

( conj ( conj ( conj (hash-map) [:a 10]) [:b 20]) [:c 30])


;<< Interpretacion
;	(10 20 30) Secuencia 
;	(10)		  Secuencia
;	10		  Numero
; 	[10 20 30] Vector

; Conj
; En listas inserta al inicio
; En vectores inserta al final
####################################################################
#		Secuencias infinitas									#
####################################################################

******************************************
*		REPEAT						*
******************************************
-----------<GENERADOR>-----------
; Retorna una secuencia perezosa
(repeat 5 10)
(repeat 4 \á)

******************************************
*		take							*
******************************************
; CONSUMIDOR
; Retorna una secuencia perezosa
(take 5 10)
(take 4 \á)

(take 3 (repeat \á) )

******************************************
*		range						*
******************************************
(take 10 (range) )			; range genera una secuencia infinita
(take 10 (range 100) )		; secuencia del 0...100
(take 10 (range 34 100) )		; range: Genera una secuencia del 34-100 (34 35 36 37 ... 100)
(take 200 (range 100) )		; No hay error: Take sólo toma los elementos disponibles

(range 0.1 1.4 0.1)			; range [start] [end] [step]


******************************************
*		cycle						*
******************************************
( cycle( list 1 2 3 4 5 6 7 8 ) )

******************************************
*		concat						*
******************************************
( concat ( list 1 2 3 4 5 ) ( list 3 6 8 9 3 2) )
( concat [1 2 3 4 5 6] [ 2 3 4 65 7] )



**************************************************************
*				   	Funciones de Orden superior (F.O.S)		*
**************************************************************
; -----------------------------------------------------<Teoría>------------------------------------------------------------
apply, map, reduce/reduction

Composición: Aplicacion  sucesiva de dos Funciones
Funcion compuesta: Es el resultado de 

   H		-> 	g°f 	=	g ( f( x ) )	Se lee: f antes que g
Funcion		Composicion						Composicion de f y g		
compuesta									f compuesta de g

-------------------------<practica>------------------------------




















