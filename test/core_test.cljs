(ns d3test-test.core
  (:require-macros [cemerick.cljs.test
                    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]))


(deftest somewhat-less-wat
  (is (= 1 (inc 0))))
