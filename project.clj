(defproject cell-json-api "0.1.0-SNAPSHOT"
  :description "Buddy/Liberator integration"
  :url "http://github.com/s23m/"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [liberator "0.12.2"]
                 [buddy "0.3.0-SNAPSHOT"] ; TODO: update
                 [cheshire "5.4.0"]
                 [ring-logger "0.7.6"]]
  :plugins [
    ; See https://github.com/weavejester/lein-ring
    [lein-ring "0.8.13"]
  ]
  :ring {
    :handler cell-json-api.core.handler/app
    :port 3000
  }
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
