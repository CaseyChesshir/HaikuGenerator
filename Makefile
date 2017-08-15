all:
	javac *.java 

clean:
	rm *.class
	rm output.txt

test:
	java HaikuGenerator < dictionary.txt > output.txt
