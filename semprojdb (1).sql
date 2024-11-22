-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2024 at 02:13 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `semprojdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `apartmentunit`
--

CREATE TABLE `apartmentunit` (
  `ApateuID` int(11) NOT NULL,
  `UnitNo` varchar(255) DEFAULT NULL,
  `Capacity` int(11) DEFAULT NULL,
  `MRate` decimal(10,2) DEFAULT NULL,
  `UnitID` int(11) DEFAULT NULL,
  `UnitType` varchar(255) NOT NULL,
  `Description` text DEFAULT NULL,
  `UnitStatus` varchar(20) DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartmentunit`
--

INSERT INTO `apartmentunit` (`ApateuID`, `UnitNo`, `Capacity`, `MRate`, `UnitID`, `UnitType`, `Description`, `UnitStatus`) VALUES
(3, '301', 2, 17000.00, 3, '', 'A budget-friendly 2-bedroom apartment perfect for small families or even roommates.\nEach bedroom can accommodate a double bed and basic furniture like a wardrobe and study desk.\nThe kitchen is small but functional, with a gas stove, sink, and fridge.\nA simple living area with a small dining table and basic seating.\nThe bathroom is simple but well-maintained, with a shower and water heater.', 'Occupied'),
(5, '501', 3, 20000.00, 5, '', 'A budget-friendly 4-bedroom apartment for larger groups of friends or families.\nSpacious common areas with enough room for a shared living space and kitchen.\nEach bedroom can accommodate 1-2 people with basic furniture (single/double beds and wardrobes).\nTwo bathrooms make it easier for the group to share.\nSimple kitchen with a stove, sink, and fridge.', 'Occupied'),
(7, '202', 1, 15000.00, 2, '', 'A cozy and affordable studio apartment perfect for young professionals or couples.\nOffers a compact layout with a separate kitchenette (sink, stove) and a small refrigerator.\nThe living area features a foldable dining table and a basic sofa, ideal for relaxing after work.\nA well-maintained bathroom with a shower.\nSuitable for those who need simplicity and affordability without sacrificing comfort.', 'Occupied');

-- --------------------------------------------------------

--
-- Table structure for table `appusers`
--

CREATE TABLE `appusers` (
  `UserID` int(11) NOT NULL,
  `Username` text NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appusers`
--

INSERT INTO `appusers` (`UserID`, `Username`, `Email`, `Password`) VALUES
(1, 'injelmey', 'injelmey@gmail.com', 'injelmey143'),
(2, 'apol', 'apol@gmail.com', 'apol'),
(3, 'ully', 'ully@gmail.com', 'ully');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `BillID` int(11) NOT NULL,
  `TenantID` int(11) NOT NULL,
  `WaterBillingID` int(11) NOT NULL,
  `ElectricityBillingID` int(11) NOT NULL,
  `PMID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `electricitybilling`
--

CREATE TABLE `electricitybilling` (
  `ElectricityBillingID` int(11) NOT NULL,
  `UnitID` int(11) NOT NULL,
  `ElectricityRate` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `parkingmanagement`
--

CREATE TABLE `parkingmanagement` (
  `PMID` int(11) NOT NULL,
  `TenantID` int(11) NOT NULL,
  `Amount` double NOT NULL,
  `PMType` text NOT NULL,
  `PlateNo` varchar(20) NOT NULL,
  `VehicleName` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(11) NOT NULL,
  `TenantID` int(11) NOT NULL,
  `PaymentDate` date NOT NULL,
  `AmountPaid` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tenant`
--

CREATE TABLE `tenant` (
  `TenantID` int(11) NOT NULL,
  `LastName` text NOT NULL,
  `FirstName` text NOT NULL,
  `ContactInfo` bigint(20) NOT NULL,
  `Email` text NOT NULL,
  `ApateuID` int(11) NOT NULL,
  `UnitNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tenant`
--

INSERT INTO `tenant` (`TenantID`, `LastName`, `FirstName`, `ContactInfo`, `Email`, `ApateuID`, `UnitNo`) VALUES
(7, 'Cortino', 'Angel', 432412, 'a@gmail.com', 3, 301),
(9, 'Templa', 'Apple', 45234, 'apol@gmail.com', 7, 202),
(10, 'Cortino', 'Angel', 432412, 'a@gmail.com', 5, 501);

-- --------------------------------------------------------

--
-- Table structure for table `unitcategories`
--

CREATE TABLE `unitcategories` (
  `UnitID` int(11) NOT NULL,
  `UnitType` varchar(255) NOT NULL,
  `Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `unitcategories`
--

INSERT INTO `unitcategories` (`UnitID`, `UnitType`, `Description`) VALUES
(1, 'Unit A1 - Budget Studio Apartment', 'A small yet functional studio designed for individuals or couples.\nThe space is a simple open-plan layout that integrates the kitchen, living, and sleeping areas.\nComes with basic furniture: a small bed, a dining table, and essential kitchen appliances (2-burner stove, fridge).\nThe bathroom is straightforward but clean, with a shower and modern fixtures.\nIdeal for working professionals or students looking for affordability.'),
(2, 'Unit B2 - Cozy and Affordable Studio', 'A cozy and affordable studio apartment perfect for young professionals or couples.\nOffers a compact layout with a separate kitchenette (sink, stove) and a small refrigerator.\nThe living area features a foldable dining table and a basic sofa, ideal for relaxing after work.\nA well-maintained bathroom with a shower.\nSuitable for those who need simplicity and affordability without sacrificing comfort.'),
(3, 'Unit C3 - Simple 2-Bedroom Family Apartment', 'A budget-friendly 2-bedroom apartment perfect for small families or even roommates.\nEach bedroom can accommodate a double bed and basic furniture like a wardrobe and study desk.\nThe kitchen is small but functional, with a gas stove, sink, and fridge.\nA simple living area with a small dining table and basic seating.\nThe bathroom is simple but well-maintained, with a shower and water heater.'),
(4, 'Unit D4 - 2-Bedroom Shared Apartment', 'A practical and affordable 2-bedroom apartment, perfect for two or three friends sharing the space.\nEach bedroom can fit two single beds or a double bed with minimal furniture like a wardrobe.\nA functional kitchen with basic amenities (gas stove, small fridge, sink).\nThe bathroom is simple, with a shower and a toilet.\nA basic living and dining area with room for a small table and chairs.\n'),
(5, 'Unit E5 - 4-Bedroom Shared Apartment', 'A budget-friendly 4-bedroom apartment for larger groups of friends or families.\nSpacious common areas with enough room for a shared living space and kitchen.\nEach bedroom can accommodate 1-2 people with basic furniture (single/double beds and wardrobes).\nTwo bathrooms make it easier for the group to share.\nSimple kitchen with a stove, sink, and fridge.');

-- --------------------------------------------------------

--
-- Table structure for table `waterbilling`
--

CREATE TABLE `waterbilling` (
  `WaterBillingID` int(11) NOT NULL,
  `UnitID` int(11) NOT NULL,
  `ElectricityRate` int(11) NOT NULL,
  `WaterRate` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apartmentunit`
--
ALTER TABLE `apartmentunit`
  ADD PRIMARY KEY (`ApateuID`),
  ADD KEY `UnitID` (`UnitID`);

--
-- Indexes for table `appusers`
--
ALTER TABLE `appusers`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`BillID`),
  ADD UNIQUE KEY `TenantID` (`TenantID`),
  ADD UNIQUE KEY `WaterBillingID` (`WaterBillingID`),
  ADD UNIQUE KEY `ElectricityBillingID` (`ElectricityBillingID`),
  ADD UNIQUE KEY `PMID` (`PMID`);

--
-- Indexes for table `electricitybilling`
--
ALTER TABLE `electricitybilling`
  ADD PRIMARY KEY (`ElectricityBillingID`),
  ADD UNIQUE KEY `UnitID` (`UnitID`);

--
-- Indexes for table `parkingmanagement`
--
ALTER TABLE `parkingmanagement`
  ADD PRIMARY KEY (`PMID`),
  ADD UNIQUE KEY `TenantID` (`TenantID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`);

--
-- Indexes for table `tenant`
--
ALTER TABLE `tenant`
  ADD PRIMARY KEY (`TenantID`),
  ADD KEY `fk_unit_id` (`ApateuID`);

--
-- Indexes for table `unitcategories`
--
ALTER TABLE `unitcategories`
  ADD PRIMARY KEY (`UnitID`);

--
-- Indexes for table `waterbilling`
--
ALTER TABLE `waterbilling`
  ADD PRIMARY KEY (`WaterBillingID`),
  ADD UNIQUE KEY `UnitID` (`UnitID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apartmentunit`
--
ALTER TABLE `apartmentunit`
  MODIFY `ApateuID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `appusers`
--
ALTER TABLE `appusers`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `BillID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `electricitybilling`
--
ALTER TABLE `electricitybilling`
  MODIFY `ElectricityBillingID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `parkingmanagement`
--
ALTER TABLE `parkingmanagement`
  MODIFY `PMID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `PaymentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tenant`
--
ALTER TABLE `tenant`
  MODIFY `TenantID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `unitcategories`
--
ALTER TABLE `unitcategories`
  MODIFY `UnitID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `waterbilling`
--
ALTER TABLE `waterbilling`
  MODIFY `WaterBillingID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `apartmentunit`
--
ALTER TABLE `apartmentunit`
  ADD CONSTRAINT `apartmentunit_ibfk_1` FOREIGN KEY (`UnitID`) REFERENCES `unitcategories` (`UnitID`);

--
-- Constraints for table `tenant`
--
ALTER TABLE `tenant`
  ADD CONSTRAINT `fk_unit_id` FOREIGN KEY (`ApateuID`) REFERENCES `apartmentunit` (`ApateuID`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
