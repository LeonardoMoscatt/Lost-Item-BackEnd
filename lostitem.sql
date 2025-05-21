-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 21, 2025 alle 09:46
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lostitem`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `lost_items`
--

CREATE TABLE `lost_items` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text DEFAULT NULL,
  `lost_date` date NOT NULL,
  `location` varchar(255) NOT NULL,
  `found` tinyint(1) DEFAULT 0,
  `found_date` date DEFAULT NULL,
  `found_location` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `lost_items`
--

INSERT INTO `lost_items` (`id`, `name`, `description`, `lost_date`, `location`, `found`, `found_date`, `found_location`) VALUES
(1, 'Portafoglio Nero', 'Portafoglio in pelle contenente documenti e carte di credito.', '2025-05-10', 'Piazza Garibaldi, Napoli', 1, '2123-03-23', 'Bologna'),
(2, 'Ombrello Blu', 'Ombrello pieghevole lasciato sull’autobus.', '2025-04-28', 'Fermata Bus Via Roma, Milano', 1, '2025-05-01', 'Deposito oggetti smarriti ATM, Milano'),
(7, 'Bacchetta del puzzo', 'dadsada', '1212-12-12', 'Napoli', 1, '2101-02-23', 'Bologna');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `lost_items`
--
ALTER TABLE `lost_items`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `lost_items`
--
ALTER TABLE `lost_items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
