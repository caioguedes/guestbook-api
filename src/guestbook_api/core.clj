(ns guestbook-api.core
  (:require [compojure.core :refer [GET defroutes context]]
            [compojure.route :as route]
            [ring.util.response :as response]
            [ring.middleware.json :refer [wrap-json-response]]
            [guestbook-api.handler.message :refer [handle-message-list handle-message-get]])
  (:gen-class))

(defroutes app-routes
           (GET "/" []
             (response/content-type (response/response "Hello World") "text/plain"))
           (GET "/api/v1/messages" [] handle-message-list)
           (GET "/api/v1/messages/:id" [] handle-message-get)
           (route/not-found {:body {:message "Resource not found."}}))

(def app
  (-> app-routes
      wrap-json-response))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
