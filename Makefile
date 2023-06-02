clean:
	./gradlew clean

build:
	./gradlew clean build

start:
	./gradlew bootRun

install:
	./gradlew installDist


test:
	./gradlew test

generate-migrations:
	gradle diffChangeLog

db-migrate:
	./gradlew update

.PHONY: build