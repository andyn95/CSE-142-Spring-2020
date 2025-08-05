JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

CLASSES = \
	Main.java

CLASSFILES = $(CLASSES:.java=.class)

all: $(CLASSFILES)

clean:
	rm -f *.class    