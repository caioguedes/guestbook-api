(ns guestbook-api.core-test
  (:require [clojure.test :refer :all]
            [guestbook-api.core :refer :all]
            [ring.mock.request :refer [request]]
            [cheshire.core :refer [parse-string generate-string]]))

(deftest test-app
  (testing "Request homepage endpoint"
    (let [response (app (request :get "/"))]
      (is (= {:status 200
              :headers {"Content-Type" "text/plain"}
              :body "Hello World"}
             response))))

  (testing "list messages endpoint"
    (let [response (app (request :get "/api/v1/messages"))
          expected-body {:messages [{:id "1"
                                     :name "Caio Guedes"
                                     :email "caio.cesar.g.souza@example.com"
                                     :comment "♫ You are so cool! ♫"
                                     :created_at "2018-06-24T18:28:07-03:00"}]}]
      (is (= {:status 200
              :headers {"Content-Type" "application/json; charset=utf-8"}
              :body (generate-string expected-body)}
             response))
      (is (= expected-body (parse-string (:body response) true))))))
