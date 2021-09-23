-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-05-2021 a las 04:58:13
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `emple_dep`
--
CREATE DATABASE IF NOT EXISTS `emple_dep` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `emple_dep`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
CREATE TABLE `departamentos` (
  `id_dpt` int(10) NOT NULL,
  `nombre_dpt` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_dpt` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`id_dpt`, `nombre_dpt`, `direccion_dpt`) VALUES
(1, 'marketing', 'lima'),
(2, 'sistemas', 'la molina'),
(3, 'contabilidad', 'san isidro'),
(4, 'recursos humano', 'lima'),
(5, 'ventas', 'gamarra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE `empleados` (
  `id_legajo_emp` int(11) NOT NULL,
  `dni_emp` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombres_emp` varchar(35) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos_emp` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nac_emp` date NOT NULL,
  `fecha_incorporacion_emp` date NOT NULL,
  `cargo_emp` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `sueldo_neto_emp` double NOT NULL,
  `id_dpt` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_legajo_emp`, `dni_emp`, `nombres_emp`, `apellidos_emp`, `fecha_nac_emp`, `fecha_incorporacion_emp`, `cargo_emp`, `sueldo_neto_emp`, `id_dpt`) VALUES
(1, '85962301', 'juan', 'perez', '1980-05-02', '2000-05-02', 'secretario', 30000, 3),
(2, '95681324', 'john', 'torres', '1988-05-14', '2013-05-14', 'secretario', 39000, 4),
(3, '46231095', 'ana', 'garcia', '1990-05-14', '2000-02-14', 'secretario', 26000, 2),
(4, '94623851', 'priscila', 'guzman', '2000-08-14', '2020-05-14', 'vendedor', 27000, 5),
(5, '21069752', 'patricia', 'castillo', '1998-09-14', '2001-05-14', 'vendedor', 29000, 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`id_dpt`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_legajo_emp`),
  ADD KEY `id_dpt` (`id_dpt`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `id_dpt` FOREIGN KEY (`id_dpt`) REFERENCES `departamentos` (`id_dpt`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
