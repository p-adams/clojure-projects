(ns cljs-kanban.prod
  (:require [cljs-kanban.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
