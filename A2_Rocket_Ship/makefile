JFLAGS = -g

MAIN = Rocketship

all: $(MAIN)

$(MAIN): $(MAIN).java
	javac $(JFLAGS) $(MAIN).java
	echo "#/bin/bash" > $(MAIN)
	echo "java $(MAIN)" >> $(MAIN)
	chmod +x $(MAIN)

run: all
	./$(MAIN)

clean:
	rm -f *.class $(MAIN)

