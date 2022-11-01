-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 01. Nov 2022 um 15:33
-- Server-Version: 10.4.17-MariaDB
-- PHP-Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `codegame`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `codegamedata`
--

CREATE TABLE `codegamedata` (
  `id` int(11) NOT NULL,
  `codelabel` varchar(255) NOT NULL,
  `codeimage` varchar(255) NOT NULL,
  `codeimageD` varchar(255) NOT NULL,
  `codequestion` varchar(255) NOT NULL,
  `codekey` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `codegamedata`
--

INSERT INTO `codegamedata` (`id`, `codelabel`, `codeimage`, `codeimageD`, `codequestion`, `codekey`) VALUES
(1, 'First question', '/Images/Aufgabe1White.png', '/Images/Aufgabe1Dark.png', 'What would output the console?', '1'),
(2, 'Second question', '/Images/Aufgabe2White.png', '/Images/Aufgabe2Dark.png', 'What would output the console?', '0 0'),
(3, 'Third question', '/Images/Aufgabe3White.png', '/Images/Aufgabe3Dark.png', 'What would output the console?', '1'),
(4, 'Fourth question', '/Images/Aufgabe4White.png', '/Images/Aufgabe4Dark.png', 'True or false?', 'false'),
(5, 'Fifth question', '/Images/Aufgabe5White.png', '/Images/Aufgabe5Dark.png', 'True or false?', 'false');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `codegamedata`
--
ALTER TABLE `codegamedata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `codegamedata`
--
ALTER TABLE `codegamedata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
