-- Создаем новую БД

CREATE DATABASE otus_demo_question;

-- создаем таблицу вопросов номер вопроса Первичный ключ
CREATE TABLE question
(
    question_id	   SERIAL          PRIMARY KEY,
    question            VARCHAR(100)    NOT NULL UNIQUE
);
-- SERIAL - целое число, автоинкремент
-- PRIMARY KEY - первичный ключ (автоматически NOT NULL и UNIQUE)
-- NOT NULL - поле не может быть NULL
-- UNIQUE - в поле не может быть повторяющихся значений

-- смотрим

SELECT * FROM question;
-- * - выбор всех колонок в таблице
-- но * в продакшн коде плохо

-- Заполним данными (INSERT)
-- Можно добавлять несколько строк
INSERT INTO question(question)
VALUES
('К какому виду операционных систем относиться Linux?'),
('Во что компилируется файл с исходым кодом класса в Java?'),
('Что такое компиляция?');

SELECT * FROM question;

-- создаем таблицу ответы атрибуты - уникальный номер, номер ответа в вопросе,
-- сам ответ, правильный или нет, и связь с первой таблицей по уникальному номеру вопроса

CREATE TABLE answer
(
    answer_id     SERIAL          PRIMARY KEY,
	answer_number INTEGER,
    answer       VARCHAR(100)    NOT NULL,
	is_checked_answer BOOLEAN NOT NULL,
    question_id   INTEGER         REFERENCES question (question_id)

);
-- REFERENCES departments (department_id) - внешний ключ
-- на таблицу departments, колонку department_id
-- DROP TABLE answer

SELECT * FROM answer;

-- заполним таблицу ответы

INSERT INTO answer(answer_number, answer, is_checked_answer, question_id)
VALUES
(1, 'Монолитное ядро', true, 1),
(2, 'Микро ядро', false, 1),
(3, 'Гибридное ядро', false, 1),

(1, 'В файл *.jar', false, 2),
(2, 'В файл *.class', true, 2),
(3, 'В файл *.exe', false, 2),
(4, 'В файл *.mp4', false, 2),

(1, 'Исполнение программы "на лету"', false, 3),
(2, 'Полное преобразование кода программы в машинный язык', true, 3),
(3, 'Компьютерная инсталляция', false, 3)
;

SELECT * FROM answer;

-- удаление конкретных записей

DELETE FROM answer
WHERE answer = 'Компьютерная инсталляция';

-- вернули запись

INSERT INTO answer(answer_number, answer, is_checked_answer, question_id)
VALUES
(3, 'Компьютерная инсталляция', false, 3);

-- UPDATE - Изменение записей

UPDATE answer
SET answer = 'Тестируем'
WHERE answer = 'В файл *.mp4';

UPDATE answer
SET answer = 'В файл *.mp4'
WHERE answer = 'Тестируем';

-- сортровка по возрастанию
SELECT *
FROM answer
ORDER BY answer_id;

-- сортировка по убыванию

SELECT *
FROM answer
ORDER BY answer_id DESC;

-- WHERE (фильтрация)
-- все ответы у которых номера ответов меньше 2
SELECT *
FROM answer
WHERE answer_number < 2;

-- Ищем конкретное поле
SELECT *
FROM answer
WHERE answer = 'Гибридное ядро';

-- Ищем НЕ конкртное
-- LIKE

-- Начинается с "В"
SELECT *
FROM answer
WHERE answer like 'В%';

-- Заканчивается на "exe"
SELECT *
FROM answer
WHERE answer  like '%exe';

-- Встречается в любом месте "ядро"
SELECT *
FROM answer
WHERE answer  like '%ядро%';
