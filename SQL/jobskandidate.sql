-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 01. Nov 2022 um 15:34
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
-- Datenbank: `code`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `jobskandidate`
--

CREATE TABLE `jobskandidate` (
  `id` int(11) NOT NULL,
  `kandidateposition` varchar(255) NOT NULL,
  `kandidatename` varchar(255) NOT NULL,
  `kandidatesurname` varchar(255) NOT NULL,
  `kandidateemail` varchar(255) NOT NULL,
  `kandidatemessage` varchar(255) NOT NULL,
  `kandidatecv` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `jobskandidate`
--

INSERT INTO `jobskandidate` (`id`, `kandidateposition`, `kandidatename`, `kandidatesurname`, `kandidateemail`, `kandidatemessage`, `kandidatecv`) VALUES
(1, 'Label[id=jobsTitel1, styleClass=label]\'Software-Entwickler\'', 'Hi ', 'There', 'My text', 'firstmail@mail.com', ' '),
(2, 'Label[id=jobsTitel1, styleClass=label]\'Software-Entwickler\'', 'hrth', 'hr', 'htrh', ' zt', ' '),
(3, 'Label[id=jobsTitel1, styleClass=label]\'Software-Entwickler\'', 'hjhj', 'hjhjh', 'hjhjhjhjhjhjhjhj', 'hjhjh', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert CBM.pdf'),
(4, 'Software-Entwickler', 'fdsf', 'fds', 'fsd', 'fsd', ''),
(5, 'Fullstack in Voll- oder Teilzeit', 'Tom ', 'Shapakov', 'dsadas', 'tom@mail.com', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert initions.pdf'),
(6, 'Software-Entwickler', 'dsad', 'dsa', 'dsa', 'dsa', ''),
(7, 'AMG Software Entwickler Engineering', 'dsad', 'dsad', 'das', 'dsad', ''),
(8, 'AMG Software Entwickler Engineering', 'Tom', 'Schapakov', 'TextField', 'testmail@mail.com', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert New Work SE .pdf'),
(9, 'Software-Entwickler', 'Oli ', 'Oli', 'My message', 'Oli@maikl', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert CBM new.pdf');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `jobskandidate`
--
ALTER TABLE `jobskandidate`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `jobskandidate`
--
ALTER TABLE `jobskandidate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
