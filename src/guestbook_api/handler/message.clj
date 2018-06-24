(ns guestbook-api.handler.message
  (:require [ring.util.response :as response]))

(defn handle-message-list [request]
  (-> {:messages []}
      (response/response)
      (response/content-type "application/json; charset=utf-8")))