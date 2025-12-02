# Load .env if it exists
ifneq (,$(wildcard .env))
	include .env
	export
endif

SRC := $(shell find src/main/java -name "*.java")
OUT := out
#default if environment variable is not set
JFX ?= $(JAVAFX_PATH)

build:
	mkdir -p $(OUT)
	javac -cp "$(JFX)" -d $(OUT) $(SRC)

run: build
	java -cp "$(OUT):$(JFX)" de.mathiiis.musicplayer.MainApp

clean:
	rm -rf $(OUT)
