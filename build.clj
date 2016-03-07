(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:output-to "out/main.js"
                       :output-dir "out"
                       :main 'hello.core
                       :target :nodejs
                       :optimizations :simple
                       })

