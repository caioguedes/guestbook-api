(ns guestbook-api.handler.message
  (:require [ring.util.response :as response]
            [guestbook-api.repository.jdbc.message :as repository]))

(defn handle-message-list [request]
  (-> {:data (repository/get-message-list)}
      (response/response)
      (response/content-type "application/json; charset=utf-8")))

(defn handle-message-get [request]
  (let [message-id (:id (:params request))]
    (-> {:data (repository/get-message message-id)}
        (response/response)
        (response/content-type "application/json; charset=utf-8"))))