(ns lcmap.client.jobs.sample
  (:require [lcmap.client.http :as http]
            [lcmap.client.jobs :as jobs]))

;; Note that the client endpoint is defined  using the "/api" prefix, so the
;; following context is appended to that.

(def context (str jobs/context "/sample/os-process"))

(defn get-resources [& {keys [] :as args}]
  (http/get (str context "/")
            :lcmap-opts (or args {})))
