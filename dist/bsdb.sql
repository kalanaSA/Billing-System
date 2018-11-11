-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2018 at 02:55 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `id` int(11) NOT NULL,
  `chrome` double NOT NULL,
  `copper` double NOT NULL,
  `plastic` double NOT NULL,
  `travel` double NOT NULL,
  `labour` double NOT NULL,
  `totalCostofItems` varchar(500) NOT NULL,
  `totalCostofLabour` varchar(500) NOT NULL,
  `totalCostofMileage` varchar(500) NOT NULL,
  `taxable` varchar(500) NOT NULL,
  `vat` varchar(500) NOT NULL,
  `tax` varchar(500) NOT NULL,
  `subTotal` varchar(500) NOT NULL,
  `total` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`id`, `chrome`, `copper`, `plastic`, `travel`, `labour`, `totalCostofItems`, `totalCostofLabour`, `totalCostofMileage`, `taxable`, `vat`, `tax`, `subTotal`, `total`) VALUES
(1896, 1, 2, 3, 4, 5, 'Rs 29.30', 'Rs 225.00', 'Rs 20.00', 'Rs 34.51', 'Rs 0.35', 'Rs 3.45', 'Rs 34.51', 'Rs 38.31'),
(2495, 2, 2, 0, 0, 2, 'Rs 26.60', 'Rs 90.00', 'Rs 0.00', 'Rs 21.28', 'Rs 0.21', 'Rs 2.13', 'Rs 21.28', 'Rs 23.62'),
(3012, 56, 0, 0, 0, 0, 'Rs 436.80', 'Rs 0.00', 'Rs 0.00', 'Rs 436.80', 'Rs 4.37', 'Rs 43.68', 'Rs 436.80', 'Rs 484.85'),
(3930, 1, 4, 2, 7, 1, 'Rs 36.80', 'Rs 45.00', 'Rs 35.00', 'Rs 50.26', 'Rs 0.50', 'Rs 5.03', 'Rs 50.26', 'Rs 55.79');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
