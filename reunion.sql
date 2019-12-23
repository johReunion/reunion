-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 22, 2019 at 10:41 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `reunion`
--

-- --------------------------------------------------------

--
-- Table structure for table `duree`
--

CREATE TABLE `duree` (
  `idduree` int(11) NOT NULL,
  `heure_debut` varchar(45) DEFAULT NULL,
  `heure_fin` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `groupereunion`
--

CREATE TABLE `groupereunion` (
  `idgroupereunion` int(11) NOT NULL,
  `libelle_groupereunion` varchar(45) DEFAULT NULL,
  `pole_idpole` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invitation`
--

CREATE TABLE `invitation` (
  `idinvitation` int(11) NOT NULL,
  `date_invitation` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `note`
--

CREATE TABLE `note` (
  `idnote` int(11) NOT NULL,
  `valeur` varchar(45) DEFAULT NULL,
  `structure_idstructure` int(11) NOT NULL,
  `pole_idpole` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notecnej`
--

CREATE TABLE `notecnej` (
  `idnotecnej` int(11) NOT NULL,
  `valeur_notecnej` varchar(45) DEFAULT NULL,
  `personnelcnej_idpersonnelcnej` int(11) NOT NULL,
  `reunion_idreunion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `participer`
--

CREATE TABLE `participer` (
  `Personne_idPersonne` int(11) NOT NULL,
  `date_reunion` varchar(45) DEFAULT NULL,
  `pole_idpole` int(11) NOT NULL,
  `structure_idstructure` int(11) NOT NULL,
  `notereunion` varchar(45) DEFAULT NULL,
  `note_idnote` int(11) NOT NULL,
  `invitation_idinvitation` int(11) NOT NULL,
  `reunion_idreunion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Personne`
--

CREATE TABLE `Personne` (
  `idPersonne` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `sexe` varchar(45) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Personne`
--

INSERT INTO `Personne` (`idPersonne`, `nom`, `prenom`, `sexe`, `tel`, `email`, `login`, `password`) VALUES
(1, 'nadjagou', 'lalle yempabe', 'm', '97857567', 'nadjagou.abdoulrazak@gmail.com', 'nadjagou', 'nadjagou1993'),
(2, 'nadjagou', 'lalle yentaguime', 'm', '99244767', 'nadjagou.yemtaguime@gmail.com', 'nadj', 'nadjagou');

-- --------------------------------------------------------

--
-- Table structure for table `personnelcnej`
--

CREATE TABLE `personnelcnej` (
  `idpersonnelcnej` int(11) NOT NULL,
  `nom_cnej` varchar(45) DEFAULT NULL,
  `prenom_cnej` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pole`
--

CREATE TABLE `pole` (
  `idpole` int(11) NOT NULL,
  `libelle_pole` varchar(45) DEFAULT NULL,
  `commentaire_pole` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `recevoir`
--

CREATE TABLE `recevoir` (
  `Personne_idPersonne` int(11) NOT NULL,
  `invitation_idinvitation` int(11) NOT NULL,
  `structure_idstructure` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reunion`
--

CREATE TABLE `reunion` (
  `idreunion` int(11) NOT NULL,
  `date_reunion` varchar(45) DEFAULT NULL,
  `duree_idduree` int(11) NOT NULL,
  `groupereunion_idgroupereunion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `structure`
--

CREATE TABLE `structure` (
  `idstructure` int(11) NOT NULL,
  `nom_structure` varchar(45) DEFAULT NULL,
  `description_structure` varchar(45) DEFAULT NULL,
  `tel_structure` varchar(45) DEFAULT NULL,
  `email_structure` varchar(45) DEFAULT NULL,
  `logo_structure` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `duree`
--
ALTER TABLE `duree`
  ADD PRIMARY KEY (`idduree`);

--
-- Indexes for table `groupereunion`
--
ALTER TABLE `groupereunion`
  ADD PRIMARY KEY (`idgroupereunion`),
  ADD KEY `fk_groupereunion_pole1` (`pole_idpole`);

--
-- Indexes for table `invitation`
--
ALTER TABLE `invitation`
  ADD PRIMARY KEY (`idinvitation`);

--
-- Indexes for table `note`
--
ALTER TABLE `note`
  ADD PRIMARY KEY (`idnote`),
  ADD KEY `fk_note_structure1` (`structure_idstructure`),
  ADD KEY `fk_note_pole1` (`pole_idpole`);

--
-- Indexes for table `notecnej`
--
ALTER TABLE `notecnej`
  ADD PRIMARY KEY (`idnotecnej`),
  ADD KEY `fk_notecnej_personnelcnej1` (`personnelcnej_idpersonnelcnej`),
  ADD KEY `fk_notecnej_reunion1` (`reunion_idreunion`);

--
-- Indexes for table `participer`
--
ALTER TABLE `participer`
  ADD PRIMARY KEY (`Personne_idPersonne`),
  ADD KEY `fk_participer_pole1` (`pole_idpole`),
  ADD KEY `fk_participer_structure1` (`structure_idstructure`),
  ADD KEY `fk_participer_note1` (`note_idnote`),
  ADD KEY `fk_participer_invitation1` (`invitation_idinvitation`),
  ADD KEY `fk_participer_reunion1` (`reunion_idreunion`);

--
-- Indexes for table `Personne`
--
ALTER TABLE `Personne`
  ADD PRIMARY KEY (`idPersonne`);

--
-- Indexes for table `personnelcnej`
--
ALTER TABLE `personnelcnej`
  ADD PRIMARY KEY (`idpersonnelcnej`);

--
-- Indexes for table `pole`
--
ALTER TABLE `pole`
  ADD PRIMARY KEY (`idpole`);

--
-- Indexes for table `recevoir`
--
ALTER TABLE `recevoir`
  ADD PRIMARY KEY (`Personne_idPersonne`,`invitation_idinvitation`,`structure_idstructure`),
  ADD KEY `fk_Personne_has_invitation_invitation1` (`invitation_idinvitation`),
  ADD KEY `fk_recevoir_structure1` (`structure_idstructure`);

--
-- Indexes for table `reunion`
--
ALTER TABLE `reunion`
  ADD PRIMARY KEY (`idreunion`),
  ADD KEY `fk_reunion_duree1` (`duree_idduree`),
  ADD KEY `fk_reunion_groupereunion1` (`groupereunion_idgroupereunion`);

--
-- Indexes for table `structure`
--
ALTER TABLE `structure`
  ADD PRIMARY KEY (`idstructure`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `groupereunion`
--
ALTER TABLE `groupereunion`
  MODIFY `idgroupereunion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `note`
--
ALTER TABLE `note`
  MODIFY `idnote` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Personne`
--
ALTER TABLE `Personne`
  MODIFY `idPersonne` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reunion`
--
ALTER TABLE `reunion`
  MODIFY `idreunion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `structure`
--
ALTER TABLE `structure`
  MODIFY `idstructure` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `groupereunion`
--
ALTER TABLE `groupereunion`
  ADD CONSTRAINT `fk_groupereunion_pole1` FOREIGN KEY (`pole_idpole`) REFERENCES `pole` (`idpole`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `fk_note_pole1` FOREIGN KEY (`pole_idpole`) REFERENCES `pole` (`idpole`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_note_structure1` FOREIGN KEY (`structure_idstructure`) REFERENCES `structure` (`idstructure`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `notecnej`
--
ALTER TABLE `notecnej`
  ADD CONSTRAINT `fk_notecnej_personnelcnej1` FOREIGN KEY (`personnelcnej_idpersonnelcnej`) REFERENCES `personnelcnej` (`idpersonnelcnej`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_notecnej_reunion1` FOREIGN KEY (`reunion_idreunion`) REFERENCES `reunion` (`idreunion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `participer`
--
ALTER TABLE `participer`
  ADD CONSTRAINT `fk_Personne_has_groupe_reunion_Personne` FOREIGN KEY (`Personne_idPersonne`) REFERENCES `Personne` (`idPersonne`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_participer_invitation1` FOREIGN KEY (`invitation_idinvitation`) REFERENCES `invitation` (`idinvitation`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_participer_note1` FOREIGN KEY (`note_idnote`) REFERENCES `note` (`idnote`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_participer_pole1` FOREIGN KEY (`pole_idpole`) REFERENCES `pole` (`idpole`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_participer_reunion1` FOREIGN KEY (`reunion_idreunion`) REFERENCES `reunion` (`idreunion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_participer_structure1` FOREIGN KEY (`structure_idstructure`) REFERENCES `structure` (`idstructure`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `recevoir`
--
ALTER TABLE `recevoir`
  ADD CONSTRAINT `fk_Personne_has_invitation_Personne1` FOREIGN KEY (`Personne_idPersonne`) REFERENCES `Personne` (`idPersonne`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Personne_has_invitation_invitation1` FOREIGN KEY (`invitation_idinvitation`) REFERENCES `invitation` (`idinvitation`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_recevoir_structure1` FOREIGN KEY (`structure_idstructure`) REFERENCES `structure` (`idstructure`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `reunion`
--
ALTER TABLE `reunion`
  ADD CONSTRAINT `fk_reunion_duree1` FOREIGN KEY (`duree_idduree`) REFERENCES `duree` (`idduree`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reunion_groupereunion1` FOREIGN KEY (`groupereunion_idgroupereunion`) REFERENCES `groupereunion` (`idgroupereunion`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
