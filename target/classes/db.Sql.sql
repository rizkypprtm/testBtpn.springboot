CREATE DATABASE  IF NOT EXISTS `jpa_onetomany`;
USE `jpa_onetomany`;


---Generate Tabel mahasiswa
DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE `mahasiswa` (
  `nim` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `tanggallahir` datetime NOT NULL,
  PRIMARY KEY (`id`,`name`,`tanggallahir`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


--
-- Table structure for table `khs`
--

DROP TABLE IF EXISTS `khs`;
CREATE TABLE `khs` (
  `idkhs` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `namamatakuliah` varchar(255) DEFAULT NULL,
  `nilai` varchar(10) DEFAULT NULL,
  `nimmahasiswa` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idkhs`),
  KEY `fk_nimmahasiswa_idx` (`nimmahasiswa`),
  CONSTRAINT `fk_nimmahasiswa` FOREIGN KEY (`nimmahasiswa`) REFERENCES `mahasiswa` (`nim`) 
  ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
