# lcmap-client-clj

LCMAP REST Service Client for Clojure

[Very WIP ... not ready for use]

## Usage

```bash
$ lein repl
```

```clojure
user=> (require '[lcmap-client.l8.surface-reflectance :as sr])
nil
user=> (sr/get-resources)
"{\"links\":[\"/api/L1/T/Landsat/8/SurfaceReflectance/:tiles\",
             \"/api/L1/T/Landsat/8/SurfaceReflectance/:rod\"]}"
user=> (sr/get-tile :extent ([1 2] [3 4]) :time "2015/01/01-2015/02/02" :band 4)
TBD
user=> (sr/get-tiles :point [1,2] :time "2015/01/01-2015/02/02" :band 2)
TBD
user=> (sr/get-rod :point [1,2] :time "2015/01/01" :band 4)
TBD
```

To explicitly set the version number of the REST service API:

```clojure
user=> (sr/get-resources :version 2.0)
```

To generate debug output:

```clojure
user=> (sr/get-resources :debug true)
```

## License

TBD
