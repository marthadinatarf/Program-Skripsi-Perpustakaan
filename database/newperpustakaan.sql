-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2021 at 06:54 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newperpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kode` varchar(6) NOT NULL,
  `namaBuku` varchar(120) NOT NULL,
  `jenisBuku` varchar(100) NOT NULL,
  `penerbit` varchar(120) NOT NULL,
  `jumlah` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `nis` varchar(8) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempatTanggalLahir` date NOT NULL,
  `kelas` varchar(15) NOT NULL,
  `jenisKelamin` varchar(50) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `telpon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `noPeminjaman` varchar(6) NOT NULL,
  `nis` varchar(8) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `kode` varchar(6) NOT NULL,
  `buku` varchar(120) NOT NULL,
  `jenisBuku` varchar(70) NOT NULL,
  `penerbit` varchar(120) NOT NULL,
  `tanggalPeminjaman` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `noPengembalian` varchar(6) NOT NULL,
  `noPeminjaman` varchar(6) NOT NULL,
  `nis` varchar(8) NOT NULL,
  `nama` varchar(120) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `kode` varchar(6) NOT NULL,
  `buku` varchar(120) NOT NULL,
  `jenisBuku` varchar(70) NOT NULL,
  `penerbit` varchar(120) NOT NULL,
  `tanggalPengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`noPeminjaman`),
  ADD KEY `peminjaman_ibfk_1` (`nis`),
  ADD KEY `peminjaman_ibfk_2` (`kode`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`noPengembalian`),
  ADD KEY `noPeminjaman` (`noPeminjaman`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `member` (`nis`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`kode`) REFERENCES `buku` (`kode`) ON UPDATE NO ACTION;

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`noPeminjaman`) REFERENCES `peminjaman` (`noPeminjaman`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
