(ns guestbook-api.repository.jdbc.message)

(def message {:id "1"
              :name "Caio Guedes"
              :email "caio.cesar.g.souza@example.com"
              :comment "♫ You are so cool! ♫"
              :created_at "2018-06-24T18:28:07-03:00"})

(defn get-message-list []
  [message])