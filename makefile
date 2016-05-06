SHELL := /usr/bin/env bash

.PHONY: doc
doc:
	lein test :doc

worksheet = open http://127.0.0.1:`cat .gorilla-port`/worksheet.html?filename=doc/$1.clj

loom:
	$(call worksheet,loom)
