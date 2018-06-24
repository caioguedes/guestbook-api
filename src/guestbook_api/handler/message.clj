(ns guestbook-api.handler.message
  (:require [ring.util.response :as response]
            [guestbook-api.repository.jdbc.message :as repository]))

(defn handle-message-list [request]
  (-> {:messages (repository/get-message-list)}
      (response/response)
      (response/content-type "application/json; charset=utf-8")))