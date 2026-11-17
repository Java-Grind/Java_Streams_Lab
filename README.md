# Java Streams Lab

Небольшая лабораторная работа на Java о Stream API: фильтрация, преобразование, группировка, ленивость и границы parallelStream.

## Установка и запуск

Нужны JDK 26 и Maven 3.9+.

    git clone <repository-url>
    cd Java_Streams_Lab
    mvn compile

Запуск примеров:

    java -cp target/classes org.Lab_Main
    java -cp target/classes org.LazyPipeline_Main
    java -cp target/classes org.Grouping_Main
    java -cp target/classes org.ParallelStream_Main

Описание экспериментов — в [notes/lab_work.md](notes/lab_work.md).
