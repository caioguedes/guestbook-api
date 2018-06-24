(ns guestbook-api.core-test
  (:require [clojure.test :refer :all]
            [guestbook-api.core :refer :all]
            [ring.mock.request :refer [request]]))

(deftest test-app
  (testing "Request homepage endpoint"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World")))))
