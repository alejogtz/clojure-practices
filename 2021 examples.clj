(defn intervalo [& args] 
    ( map  (fn [elem]   (  filter (fn [val] (< elem val) )  )  )  (drop-last args)   ))