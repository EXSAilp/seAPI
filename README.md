seAPI เป็น API ส่วนของ Backend ทำหน้าที่เชื่อมกับฐานข้อมูลเพื่อส่งให้กับส่วน Front End
\
\
รายชื่อสมาชิกกลุ่ม\
นาย ศตายุ มณีกุล 6210450741\
นาย ภีรพัฒน์ กุลมงคลชัยศรี 6210451381\
นางสาว วารุณี เบ็ญจะนันท์ 6210451489\
นาย วีรภัทร ปัญญาธีระ 6210451497\
\
\
วิธีการใช้งาน API\
รันไฟล์ src/main/java/se/project/API/ApiApplication.java
\
\
\
( LocalHost )\
มีการใช้ jMeter ในการวัดประสิทธิภาพของการ GET และ POST ข้อมูลว่ามีค่า Throughput ค่า Error และค่าอื่นๆมากน้อยแค่ไหนในกรณีที่มีการใช้งานจากหลายๆ User\
\
\
ส่วนของ POST\
![image](https://user-images.githubusercontent.com/60596678/200640984-9ed11faf-462e-47de-9c6e-ed79491cd646.png)
\
\
ผลที่ได้จะได้ค่า Throughput = 100.8/sec\
![image](https://user-images.githubusercontent.com/60596678/200662588-0a55dc2d-0002-429f-b31d-6f89928e5c1f.png)
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
ผลที่ได้ Throughput = 100.8/sec\
![image](https://user-images.githubusercontent.com/60596678/200663231-db4a98c0-600e-43cb-87ce-721a7c039709.png)
