seAPI เป็น API ส่วนของ Backend ทำหน้าที่เชื่อมกับฐานข้อมูลเพื่อส่งให้กับส่วน Front End
\
\
รายชื่อสมาชิกกลุ่ม\
นาย ศตายุ มณีกุล 6210450741\
นาย ภีรพัฒน์ กุลมงคลชัยศรี 6210441381\
นาย วารุณี เบ็ญจะนันท์ 6210451489\
นาย วีรภัทร ปัญญาธีระ 6210451497\
\
\
วิธีการรัน API\
รันไฟล์ src/main/java/se/project/API/ApiApplication.java
\
\
\
( LocalHost )\
มีการใช้ jMeter ในการวัดประสิทธิภาพของการ GET และ POST ข้อมูลว่ามีค่า Throughput ค่า Error และค่าอื่นๆมากน้อยแค่ไหนในกรณีที่มีการใช้งานจากหลายๆ User\
\
\
ส่วนของ POST\
![image](https://user-images.githubusercontent.com/60596678/200633626-5fae7259-108c-437c-9d73-0bf8f55fa44f.png)
\
\
ผลที่ได้จะได้ค่า Throughput = 10.5/sec\
![image](https://user-images.githubusercontent.com/60596678/200633513-8d5c4cad-3f25-4692-9637-e09e0d12307f.png)
\
\
รูปแบบของข้อมูลที่ POST (JSON)\
![image](https://user-images.githubusercontent.com/60596678/200633803-f85cbd10-b0ca-406d-a13e-6fdeeb388f93.png)
\
\
\
ส่วนของ GET\
![image](https://user-images.githubusercontent.com/60596678/200640984-9ed11faf-462e-47de-9c6e-ed79491cd646.png)
\
\
ผลที่ได้ Throughput = 1.1/sec\
![image](https://user-images.githubusercontent.com/60596678/200640917-b34cde42-3567-4cbc-afa6-dea05a20fc26.png)
