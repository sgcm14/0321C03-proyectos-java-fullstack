-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-05-2021 a las 04:52:39
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
-- Base de datos: `torneo_tenis`
--
CREATE DATABASE IF NOT EXISTS `torneo_tenis` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `torneo_tenis`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE `categorias` (
  `id_cat` int(10) NOT NULL,
  `nombre_cat` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `edad_min_cat` int(2) NOT NULL,
  `edad_max_cat` int(2) NOT NULL,
  `sexo_cat` varchar(1) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id_cat`, `nombre_cat`, `edad_min_cat`, `edad_max_cat`, `sexo_cat`) VALUES
(1, 'damas a', 18, 34, 'f'),
(2, 'damas b', 35, 45, 'f'),
(3, 'damas c', 46, 100, 'f'),
(4, 'caballeros a', 18, 34, 'm'),
(5, 'caballeros b', 35, 50, 'm'),
(6, 'caballeros c', 51, 100, 'm'),
(7, 'juveniles varones', 13, 17, 'm'),
(8, 'juveniles mujeres', 13, 17, 'f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripciones`
--

DROP TABLE IF EXISTS `inscripciones`;
CREATE TABLE `inscripciones` (
  `id_ins` int(10) NOT NULL,
  `fecha_ins` date NOT NULL,
  `abono_ins` double NOT NULL,
  `id_part` int(10) NOT NULL,
  `id_cat` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `inscripciones`
--

INSERT INTO `inscripciones` (`id_ins`, `fecha_ins`, `abono_ins`, `id_part`, `id_cat`) VALUES
(1, '2021-05-01', 50, 1, 2),
(2, '2021-04-08', 50, 2, 2),
(3, '2021-05-01', 30, 3, 2),
(4, '2021-05-02', 30, 4, 2),
(5, '2021-05-01', 20, 5, 3),
(6, '2021-05-01', 10, 6, 4),
(7, '2021-04-14', 30, 7, 5),
(8, '2021-05-01', 30, 8, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participantes`
--

DROP TABLE IF EXISTS `participantes`;
CREATE TABLE `participantes` (
  `id_part` int(10) NOT NULL,
  `dni_part` int(10) NOT NULL,
  `nombres_part` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos_part` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `edad_part` int(2) NOT NULL,
  `sexo_part` varchar(1) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_part` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_part` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `participantes`
--

INSERT INTO `participantes` (`id_part`, `dni_part`, `nombres_part`, `apellidos_part`, `edad_part`, `sexo_part`, `telefono_part`, `direccion_part`) VALUES
(1, 94685321, 'karina', 'torres', 35, 'f', '6579120', 'lima'),
(2, 94683157, 'maria', 'tello', 37, 'f', '9461852', 'la molina'),
(3, 45379124, 'susan', 'carhuaz', 38, 'f', '6719425', 'surquillo'),
(4, 94386172, 'sara', 'quispe', 40, 'f', '2769415', 'surco'),
(5, 94685312, 'claudia', 'parreño', 46, 'f', '9863152', 'lima'),
(6, 94683152, 'edgar', 'vans', 19, 'm', '9634851', 'surquillo'),
(7, 42106124, 'edward', 'garcia', 36, 'm', '7569420', 'san juan'),
(8, 94632105, 'edson', 'lolo', 28, 'm', '9463781', 'san isidro');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indices de la tabla `inscripciones`
--
ALTER TABLE `inscripciones`
  ADD PRIMARY KEY (`id_ins`),
  ADD KEY `id_cat` (`id_cat`),
  ADD KEY `id_part` (`id_part`);

--
-- Indices de la tabla `participantes`
--
ALTER TABLE `participantes`
  ADD PRIMARY KEY (`id_part`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripciones`
--
ALTER TABLE `inscripciones`
  ADD CONSTRAINT `id_cat` FOREIGN KEY (`id_cat`) REFERENCES `categorias` (`id_cat`),
  ADD CONSTRAINT `id_part` FOREIGN KEY (`id_part`) REFERENCES `participantes` (`id_part`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
