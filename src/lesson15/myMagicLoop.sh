#!/bin/bash
for i in {1..10} ;
do
mkdir "lesson" ./lesson-$i
mkdir ./lesson-$i/homework
touch ./lesson-$ihomework-task.md
echo "Hello Magic Programming$i" >> ./lesson-$ihomework-task.md
echo "lesson-"$i
done