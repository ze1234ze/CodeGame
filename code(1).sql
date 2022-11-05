-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 03. Nov 2022 um 13:43
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
CREATE DATABASE IF NOT EXISTS `code` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `code`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `contacts`
--

CREATE TABLE `contacts` (
  `id` int(11) NOT NULL,
  `contactname` varchar(255) NOT NULL,
  `contactsurname` varchar(255) NOT NULL,
  `contactemail` varchar(255) NOT NULL,
  `contacttext` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `contacts`
--

INSERT INTO `contacts` (`id`, `contactname`, `contactsurname`, `contactemail`, `contacttext`) VALUES
(1, 'ContactName', 'ContactSurname', 'Mail to contact', 'Text To the contact'),
(2, 'dawdw', 'dwad', 'dwad', 'dawd'),
(3, 'dsad', 'dsad', 'dsa', 'dsa'),
(4, 'gvfdsg', 'fgdsf', 'fsd', 'fdsf'),
(5, 'dsad', 'dsad', 'das', 'das');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `jobs`
--

CREATE TABLE `jobs` (
  `id` int(11) NOT NULL,
  `jobname` varchar(255) NOT NULL,
  `jobinfo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `jobs`
--

INSERT INTO `jobs` (`id`, `jobname`, `jobinfo`) VALUES
(1, 'Software-Entwickler', 'Hardwarenahe C-Programmierkenntnisse sind erforderlich,\r\n Assembler und Java Erfahrung wünschenswert,\r\n Kenntnisse Microcontroller Funktionalität inkl.\r\n Peripherieeinheiten, Steuergeräte, Schaltungstechnik,\r\n idealerweise haben Sie Erfahrung im Bereich A'),
(2, 'AMG Software Entwickler Engineering', 'Mehrjährige, praxisnahe Erfahrungen in der Entwicklung von\r\nMicroservices mit Docker und Web-Technologien wie REST,\r\nSOAP, WSDL, OIDC und Websockets. Erfahrungen mit AWS\r\nund Terraform sind von Vorteil\r\n'),
(3, 'Fullstack in Voll- oder Teilzeit', 'Du hast fundierte Kenntnisse in Java und\r\nJava Enterprise. Du stellst Dich Herausforderungen,\r\n denn Du hast keine Scheu vor Legacy Anwendungen \r\nund möchtest die IT-Vision der Creditreform mit \r\nmodernen Technologien wie Spring, \r\nDocker und Kubernetes i'),
(4, 'Cloud Anwendungen', 'Sie besitzen langjährige Berufserfahrung in der\r\n IT-Branche und können Programmierkenntnisse sowie\r\n Fertigkeiten im Projektmanagement vorweisen.\r\nSie verfügen außerdem über internationale Erfahrung\r\n und können mit MS Azure / MS Office sicher umgehen.\r\n');

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
(9, 'Software-Entwickler', 'Oli ', 'Oli', 'My message', 'Oli@maikl', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert CBM new.pdf'),
(10, 'Software-Entwickler', 'dasd', 'dsad', 'dasd', 'das', 'E:\\Bewerbung und Lebenslauf\\Lebensablauf Michael Seifert Hermes.pdf');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `player`
--

CREATE TABLE `player` (
  `id` int(11) NOT NULL,
  `playername` varchar(255) NOT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `player`
--

INSERT INTO `player` (`id`, `playername`, `score`) VALUES
(138, 'MIke', 80),
(139, 'mike', 100),
(140, 'mike', NULL),
(141, 'MikeFast', 100),
(142, 'MikeOne', 80),
(143, 'mike', 90),
(144, 'dw', NULL),
(145, 'mikeTR', 90),
(146, 'ds', 100),
(147, 'Miek', 110),
(148, 'MikeHew', NULL),
(149, 'Mike', NULL),
(150, 'mike', NULL),
(151, 'mike', NULL),
(152, 'mike', 110),
(153, 'mikeOne', 110),
(154, 'Mike', 100),
(155, 'Mike', 100),
(156, 'MikeD', NULL),
(157, 'mike', 80),
(158, 'mike', 100),
(159, 'daw', 100),
(160, 'cds', 110),
(161, 'das', 110),
(162, 'dsa', 90),
(163, 'das', 110),
(164, 'dasd', NULL);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `jobs`
--
ALTER TABLE `jobs`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `jobskandidate`
--
ALTER TABLE `jobskandidate`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `contacts`
--
ALTER TABLE `contacts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT für Tabelle `jobs`
--
ALTER TABLE `jobs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `jobskandidate`
--
ALTER TABLE `jobskandidate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT für Tabelle `player`
--
ALTER TABLE `player`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=165;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
