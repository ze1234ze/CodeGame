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

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `jobs`
--
ALTER TABLE `jobs`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `jobs`
--
ALTER TABLE `jobs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
