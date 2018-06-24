(ns guestbook-api.core-test
  (:require [clojure.test :refer :all]
            [guestbook-api.core :refer :all]
            [ring.mock.request :refer [request]]))

(deftest test-app
  (testing "Request homepage endpoint"
    (let [response (app (request :get "/"))]
      (is (= {:status 200
              :headers {"Content-Type" "text/plain"}
              :body "Hello World"}
             response))))

  (testing "list messages endpoint"
    (let [response (app (request :get "/api/v1/messages"))]
      (is (= {:status 200
              :headers {"Content-Type" "application/json; charset=utf-8"}
              :body "{\"messages\":[]}"}
             response)))))
