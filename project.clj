(defproject guestbook-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.1"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler guestbook-api.core/app}
  :main ^:skip-aot guestbook-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[ring/ring-devel "1.6.3"]]}})
