(ns guestbook-api.core
  (:require [compojure.core :refer [GET defroutes]])
  (:gen-class))

(defroutes app-routes
           (GET "/" [] {:status 200
                        :headers {"Content-Type" "text/plain"}
                        :body "Hello World"}))

(def app
  app-routes)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
