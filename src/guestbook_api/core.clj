(ns guestbook-api.core
  (:require [compojure.core :refer [GET defroutes context]]
            [ring.util.response :as response])
  (:gen-class))

(defroutes app-routes
           (GET "/" [] (response/content-type (response/response "Hello World") "text/plain")))

(def app
  app-routes)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
