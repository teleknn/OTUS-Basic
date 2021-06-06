Создаем Докер файл
```bash

FROM openjdk:16-jdk-alpine
ADD HelloWordDocker.java .
RUN javac HelloWordDocker.java
CMD ["java" , "HelloWordDocker"]
```
```bash
Первая строка - скачивает образ openjdk:16-jdk-alpine
```
```bash
Вторая строка - добавляет мой файл java в образ
```
```bash
Третья строка - запускает компелятор javac
```
```bash
Четвертая - запускает команду java HelloWordDocker
```
```bash
Сборка образа
```
```bash
docker build -t java-hello-docker:demo . 

-t - задаем имя через : тэг (НЕ обязательно)
```
```bash
Запуск контейнера (Запускаю в интерактивном режиме -it так как есть взаимодествие с программой)
```
```bash
docker run -it java-hello-docker:demo
```

