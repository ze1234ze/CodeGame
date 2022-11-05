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
-- Datenbank: `codegame`
--
CREATE DATABASE IF NOT EXISTS `codegame` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `codegame`;

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

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `codegamedata2`
--

CREATE TABLE `codegamedata2` (
  `id` int(11) NOT NULL,
  `codelabel` varchar(255) NOT NULL,
  `codegameinhalt` varchar(255) NOT NULL,
  `codequestion` varchar(255) NOT NULL,
  `codekey` varchar(255) DEFAULT NULL,
  `codekey2` varchar(255) NOT NULL,
  `explanation` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `codegamedata2`
--

INSERT INTO `codegamedata2` (`id`, `codelabel`, `codegameinhalt`, `codequestion`, `codekey`, `codekey2`, `explanation`) VALUES
(1, 'question 2.1', 'a) Guido van Rossum\r\nb) James Gosling\r\nc) Dennis Ritchie\r\nd) Bjarne Stroustrup', 'Who invented Java Programming?', 'b', 'james gosling', 'Explanation: Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java.'),
(2, 'question 2.2', 'a) JRE\r\nb) JIT\r\nc) JDK\r\nd) JVM', 'Which component is used to compile, debug and execute the java programs?', 'c', 'jdk', 'Explanation: JDK is a core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.'),
(3, 'question 2.3', 'a) Polymorphism\r\nb) Inheritance\r\nc) Compilation\r\nd) Encapsulation', 'Which of the following is not an OOPS concept in Java?', 'c', 'compilation', 'Explanation: There are 4 OOPS concepts in Java. Inheritance, Encapsulation, Polymorphism and Abstraction.'),
(4, 'question 2.4', 'a) ArrayList\r\nb) Abstract class\r\nc) Object class\r\nd) String', 'Which of the following is a superclass of every class in Java?', 'c', 'object class', 'Explanation: Object class is superclass of every class in Java.'),
(5, 'question 2.5', 'a) Protected\r\nb) Void\r\nc) Public\r\nd) Private', 'Which one of the following is not an access modifier?', 'b', 'void', 'Explanation: Public, private, protected and default are the access modifiers.'),
(9, 'das', 'dfasd				', 'fdsaf', NULL, '1', NULL),
(10, 'mike', 'mike		', 'mike', NULL, 'mike', NULL);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `codegamedata`
--
ALTER TABLE `codegamedata`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `codegamedata2`
--
ALTER TABLE `codegamedata2`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `codegamedata`
--
ALTER TABLE `codegamedata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT für Tabelle `codegamedata2`
--
ALTER TABLE `codegamedata2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
