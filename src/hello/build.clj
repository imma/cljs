(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:output-to "out/hello/main.js"
                       :output-dir "out/hello"
                       :main 'hello.core
                       :target :nodejs
                       :optimizations :none
                       })

