(defproject my-stuff "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/HibikineKage/my-stuff"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.0.0"]]
  :main ^:skip-aot my-stuff.core
  :target-path "target/%s"
  :aot [my-stuff.core]
  :profiles {:dev {:dependencies [[ring/ring-devel "1.4.0"]]}})
