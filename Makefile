compile-cpp:
	g++ cpp/sort.cpp -o cpp/sort
	g++ cpp/shop.cpp -o cpp/shop

run-cpp: compile-cpp
	./cpp/sort
	./cpp/shop

compile-java:
	(cd java ; javac Sort.java)
	(cd java ; javac Shop.java)

run-java: compile-java
	(cd java ; java Sort)
	(cd java ; java Shop)

run-python:
	python3 python/sort.py
	python3 python/shop.py

run-ruby:
	ruby ruby/sort.rb
	ruby ruby/shop.rb