(ns hello.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main []
  (println "hey"))

(set! *main-cli-fn* -main)
