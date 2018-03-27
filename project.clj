(defproject tracy/tracy.halboy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [tracy "0.1.1"]
                 [halboy "3.0.0"]]
  :profiles {:dev {:dependencies
                   [[http-kit.fake "0.2.2"]]}})
