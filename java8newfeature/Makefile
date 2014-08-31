sep:=:
empty:=
space:=$(empty) $(empty)

# use wildcard function to generate classpaths array, the first dot means the current directory
CLASSPATHS=. $(wildcard /Users/sean/bin/*.jar)
CLASSPATH=$(subst $(space),$(sep),$(CLASSPATHS))
JC := javac
JV := java
JFLAGS := -verbose -d bin

all:build

build:clean
	mkdir bin
	@@$(JC) $(JFLAGS) $(wildcard $(shell pwd)/*.java)

clean:
	rm -rf bin/

