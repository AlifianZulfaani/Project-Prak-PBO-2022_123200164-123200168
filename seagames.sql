-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2022 at 03:36 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `seagames`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_seagames`
--

CREATE TABLE `jadwal_seagames` (
  `id` char(3) NOT NULL,
  `pertandingan` char(100) NOT NULL,
  `hari` char(30) NOT NULL,
  `jam` char(30) NOT NULL,
  `channel` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_seagames`
--

INSERT INTO `jadwal_seagames` (`id`, `pertandingan`, `hari`, `jam`, `channel`) VALUES
('002', 'BOLA fase grup Indonesia vs Timor Leste', 'Jumat, 13 Mei 2022', '16.00', 'MNC TV'),
('003', 'BOLA fase grup Indonesia vs Myanmar', 'Minggu, 15 Mei 2022', '16.00', 'MNC TV'),
('004', 'BASKET Indonesia vs Malaysia', 'Senin, 16 Mei 2022', '11.00', 'BEIN SPORT TV'),
('005', 'BASKET Indonesia vs Thailand', 'Rabu, 18 Mei 2022', '11.00', 'BEIN SPORT TV'),
('006', 'BASKET Indonesia vs Kamboja', 'Kamis, 19 Mei 2022', '11.00', 'BEIN SPORT TV'),
('007', 'BASKET Indonesia vs Singapura', 'Jumat, 20 Mei 2022', '17.00', 'BEIN SPORT TV'),
('008', 'BASKET Indonesia vs Vietnam', 'Sabtu, 21 Mei 2022', '19.00', 'BEIN SPORT TV'),
('009', 'BASKET Indonesia vs Filipina', 'Minggu, 22 Mei 2022', '15.00', 'BEIN SPORT TV'),
('010', 'Men Single Round 16', 'Kamis, 19 Mei 2022', '09.00', 'MNC TV'),
('011', 'Women Single Round 16', 'Kamis, 19 Mei 2022', '09.00', 'MNC TV'),
('012', 'Men Double Round 16', 'Kamis, 19 Mei 2022', '09.00', 'MNC TV'),
('013', 'Women Double Round 16', 'Kamis, 19 Mei 2022', '09.00', 'MNC TV'),
('014', 'Mixed Double Round 16', 'Kamis, 19 Mei 2022', '09.00', 'MNC TV'),
('015', 'Men Single Quarter Final', 'Jumat, 20 Mei 2022', '09.00', 'MNC TV'),
('016', 'Women Single Quarter Final', 'Jumat, 20 Mei 2022', '09.00', 'MNC TV'),
('017', 'Men Double Quarter Final', 'Jumat, 20 Mei 2022', '09.00', 'MNC TV'),
('018', 'Women Double Quarter Final', 'Jumat, 20 Mei 2022', '09.00', 'MNC TV'),
('019', 'Mixed Double Quarter Final', 'Jumat, 20 Mei 2022', '09.00', 'MNC TV');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal_seagames`
--
ALTER TABLE `jadwal_seagames`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
