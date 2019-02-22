taskkill -F -IM 7zFM.exe
clear

set -e
mvn install
set +e

taskkill -F -IM iexplore.exe
taskkill -F -IM node.exe

http-server &
"C:\Program Files\internet explorer\iexplore.exe" "http://127.0.0.1:8080" &
