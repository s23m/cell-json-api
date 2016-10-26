(ns buddy-liberator.core.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [buddy-liberator.core.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (simple-routes (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello Anonymous")))) ; unauthenticated state

  (testing "not-found route"
    (let [response (simple-routes (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
