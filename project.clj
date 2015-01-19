(defproject d3test "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665"]]

  :node-dependencies [[source-map-support "0.2.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.5.0"]
            [lein-ancient "0.6.0"]
            [com.cemerick/clojurescript.test "0.3.3"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/d3test" "d3test.js" "d3test.min.js"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :compiler {:output-to "d3test.js"
                         :output-dir "out"
                         :optimizations :none
                         :source-map true}}
             {:id "test"
              :source-paths ["src" "test"]
              :compiler {:output-to "target/test.js"
                         :pretty-print true
                         :optimizations :whitespace
                         :preamble ["d3.v3.js"]}}]
              :test-commands {"unit-tests" ["phantomjs" :runner
                                            "target/test.js"]}})
