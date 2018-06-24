(ns guestbook-api.core
  (:gen-class))

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
