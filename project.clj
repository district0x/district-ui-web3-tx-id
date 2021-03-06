(defproject district0x/district-ui-web3-tx-id "1.0.1"
  :description "district UI module for associating arbitrary id with web3 transactions"
  :url "https://github.com/district0x/district-ui-web3-tx-id"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[akiroz.re-frame/storage "0.1.2"]
                 [cljs-web3 "0.19.0-0-9"]
                 [day8.re-frame/forward-events-fx "0.0.5"]
                 [district0x/district-ui-web3-accounts "1.0.4"]
                 [district0x/district-ui-web3-tx "1.0.8"]
                 [district0x/re-frame-spec-interceptors "1.0.1"]
                 [medley "1.0.0"]
                 [mount "0.1.11"]
                 [org.clojure/clojurescript "1.9.946"]
                 [re-frame "0.10.2"]]

  :doo {:paths {:karma "./node_modules/karma/bin/karma"}}

  :npm {:devDependencies [[karma "1.7.1"]
                          [karma-chrome-launcher "2.2.0"]
                          [karma-cli "1.0.1"]
                          [karma-cljs-test "0.1.0"]]}

  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]
                                  [day8.re-frame/test "0.1.5"]
                                  [district0x/district-ui-smart-contracts "1.0.2"]
                                  [org.clojure/clojure "1.8.0"]
                                  [org.clojure/tools.nrepl "0.2.13"]]
                   :plugins [[lein-cljsbuild "1.1.7"]
                             [lein-doo "0.1.8"]
                             [lein-npm "0.6.2"]]}}

  :cljsbuild {:builds [{:id "tests"
                        :source-paths ["src" "test"]
                        :compiler {:output-to "tests-output/tests.js"
                                   :output-dir "tests-output"
                                   :main "tests.runner"
                                   :optimizations :none}}]})
