-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: doancoso
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `phanloaigiadinh`
--

DROP TABLE IF EXISTS `phanloaigiadinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `phanloaigiadinh` (
  `Full Name` varchar(45) NOT NULL,
  `Phone Number` int(11) DEFAULT NULL,
  `Date of Birth` varchar(45) DEFAULT NULL,
  `Email Address` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Most Favorite Hobby` varchar(45) NOT NULL,
  `Company` varchar(45) DEFAULT NULL,
  `Position` varchar(45) DEFAULT NULL,
  `Dream` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Full Name`,`Most Favorite Hobby`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phanloaigiadinh`
--

LOCK TABLES `phanloaigiadinh` WRITE;
/*!40000 ALTER TABLE `phanloaigiadinh` DISABLE KEYS */;
INSERT INTO `phanloaigiadinh` VALUES ('Bà Nội',987654321,'09/07/2013','leconghung@gmail.com','Quảng Nam','Male','Listen to music','Home','NO','NO'),('Lê Công Hiếu',123456789,'11/05/2008','leconghieu@gmail.com','Quảng Nam','Male','Jogging','FPT','Employee','NO'),('Lê Công Hùng',987654321,'09/07/2013','leconghung@gmail.com','Quảng Nam','Male','Listen to music','Home','NO','NO'),('Mẹ',987654321,'09/07/2013','leconghung@gmail.com','Quảng Nam','Male','Listen to music','Home','NO','NO');
/*!40000 ALTER TABLE `phanloaigiadinh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-13 16:49:31
