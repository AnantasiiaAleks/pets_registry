*1. Используя команду cat в терминале операционной системы Linux, создать*
*два файла Домашние животные (заполнив файл собаками, кошками,*
*хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и*
*ослы), а затем объединить их. Просмотреть содержимое созданного файла.*
*Переименовать файл, дав ему новое имя (Друзья человека).*

`cat > home_animals.txt`
dog
cat
hamster
`cat > pack_animals.txt`
horse
camel
donkey
`cat home_animals.txt pack_animals.txt > pets.txt`
`more pets.txt`
dog
cat
hamster
horse
camel
donkey
`mv pets.txt human_friends.txt`
*2. Создать директорию, переместить файл туда*
`mv pets.txt human_friends.txt`
`mkdir workfolder`
`mv human_friends.txt workfolder/`
*3. Подключить дополнительный репозиторий MySQL. Установить любой пакет*
*из этого репозитория.*
`sudo apt update`
`sudo gpg --import mysql_pubkey.asc`
`sudo apt-add-repository 'https://dev.mysql.com/get/mysql-apt-config_0.8.30-1_all.deb'`
`sudo apt update`
`sudo apt-get install mysql-server`
`sudo systemctl status mysql`
*4. Установить и удалить deb-пакет с помощью dpkg.*
`sudo dpkg -i apache2_2.4.59-1~deb12u1_amd64.deb`
`dpkg -l`
`sudo dpkg -r apache2`
