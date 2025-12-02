SRC := $(shell find src/main/java -name "*.java")
OUT := out

build:
	mkdir -p $(OUT)
	javac -d $(OUT) $(SRC)

run: build
	java -cp $(OUT) de.mathiiis.musicplayer.MainApp

clean:
	rm -rf $(OUT)