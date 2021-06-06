Создаем Докер файл

FROM openjdk:16-jdk-alpine
ADD HelloWordDocker.java .
RUN javac HelloWordDocker.java
CMD ["java" , "HelloWordDocker"]

Первая строка - скачивает образ openjdk:16-jdk-alpine
Вторая строка - добавляет мой файл java в образ
Третья строка - запускает компелятор javac
Четвертая - запускает команду java HelloWordDocker

Сборка образа

docker build -t java-hello-docker:demo .
-t - задаем имя через : тэг (НЕ обязательно)

Запуск контейнера (Запускаюв интерактивном режиме -it так как есть взаимодествие с программой)

docker run -it java-hello-docker:demo

