-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 20, 2022 at 06:31 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlycuahang`
--

-- --------------------------------------------------------

--
-- Table structure for table `cthoadon`
--

DROP TABLE IF EXISTS `cthoadon`;
CREATE TABLE IF NOT EXISTS `cthoadon` (
  `MaHD` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL,
  PRIMARY KEY (`MaHD`,`MaSP`),
  KEY `cthoadon_ibfk_1` (`MaHD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cthoadon`
--

INSERT INTO `cthoadon` (`MaHD`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
(18, 114, 2, 159000, 318000),
(18, 122, 3, 249000, 747000),
(18, 124, 6, 19000, 114000),
(18, 130, 2, 19000, 38000),
(18, 132, 2, 25000, 50000),
(19, 115, 2, 119000, 238000),
(19, 120, 1, 239000, 239000),
(19, 128, 4, 19000, 76000),
(19, 131, 5, 10000, 50000),
(20, 118, 1, 129000, 129000),
(20, 120, 2, 239000, 478000),
(20, 129, 5, 19000, 38000),
(20, 130, 5, 19000, 95000),
(20, 131, 10, 10000, 100000),
(21, 112, 3, 129000, 387000),
(21, 117, 2, 149000, 298000),
(21, 126, 10, 19000, 190000),
(21, 127, 3, 29000, 87000),
(21, 128, 15, 19000, 285000),
(21, 131, 6, 10000, 60000),
(22, 114, 5, 159000, 795000),
(22, 127, 10, 29000, 290000),
(22, 129, 6, 19000, 95000),
(22, 132, 3, 25000, 75000),
(23, 112, 3, 129000, 387000),
(23, 113, 1, 119000, 119000),
(23, 118, 1, 129000, 129000),
(23, 128, 6, 19000, 114000),
(23, 131, 5, 10000, 50000),
(23, 132, 2, 25000, 25000),
(24, 115, 1, 119000, 119000),
(24, 116, 1, 130000, 130000),
(24, 119, 1, 239000, 239000),
(24, 126, 6, 19000, 114000),
(24, 127, 3, 29000, 87000),
(24, 131, 7, 10000, 70000),
(24, 132, 4, 25000, 100000),
(25, 118, 1, 129000, 129000),
(25, 121, 1, 229000, 229000),
(25, 130, 4, 19000, 76000),
(25, 131, 5, 10000, 50000),
(25, 132, 3, 25000, 75000),
(27, 113, 1, 119000, 119000),
(27, 119, 1, 239000, 239000),
(27, 123, 1, 269000, 269000),
(27, 126, 1, 19000, 19000),
(27, 131, 1, 10000, 10000),
(29, 114, 4, 159000, 636000),
(29, 115, 1, 119000, 119000),
(29, 116, 1, 130000, 130000),
(29, 131, 2, 10000, 20000),
(32, 120, 5, 239000, 1195000),
(32, 121, 4, 229000, 916000),
(33, 116, 1, 130000, 130000),
(33, 119, 30, 239000, 7170000),
(35, 113, 1, 119000, 119000),
(35, 117, 1, 149000, 149000),
(35, 131, 8, 10000, 70000),
(37, 116, 1, 130000, 130000),
(38, 114, 2, 159000, 159000),
(38, 118, 3, 129000, 387000),
(38, 119, 1, 239000, 239000),
(39, 113, 1, 119000, 119000),
(39, 115, 1, 119000, 119000),
(39, 118, 1, 129000, 129000),
(41, 112, 1, 129000, 129000),
(41, 116, 1, 130000, 130000),
(41, 117, 1, 149000, 149000),
(42, 112, 1, 129000, 129000),
(42, 116, 1, 150000, 150000),
(43, 113, 1, 119000, 119000),
(43, 114, 1, 159000, 159000),
(43, 117, 3, 149000, 447000),
(43, 136, 1, 23000, 23000),
(44, 114, 1, 159000, 159000),
(44, 116, 1, 150000, 150000),
(45, 115, 3, 119000, 119000),
(45, 119, 2, 239000, 239000),
(46, 113, 1, 119000, 119000),
(46, 114, 1, 159000, 159000),
(47, 132, 6, 25000, 150000),
(48, 115, 2, 9090000, 18180000),
(49, 114, 2, 8490000, 16980000),
(49, 116, 1, 2990000, 2990000),
(50, 128, 20, 700000, 14000000);

-- --------------------------------------------------------

--
-- Table structure for table `ctphieunhap`
--

DROP TABLE IF EXISTS `ctphieunhap`;
CREATE TABLE IF NOT EXISTS `ctphieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL,
  PRIMARY KEY (`MaPN`,`MaSP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ctphieunhap`
--

INSERT INTO `ctphieunhap` (`MaPN`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
(4, 128, 100, 10000, 1000000),
(4, 129, 3, 9000, 27000),
(5, 124, 6, 10000, 60000),
(5, 125, 3, 15000, 45000),
(5, 126, 7, 10000, 70000),
(5, 127, 2, 15000, 30000),
(5, 130, 3, 9000, 27000),
(5, 131, 9, 4000, 36000),
(7, 126, 9, 10000, 90000),
(8, 124, 30, 10000, 300000),
(8, 126, 50, 10000, 500000),
(8, 129, 30, 9000, 270000),
(9, 135, 100, 10000, 1000000),
(10, 136, 200, 23000, 4600000),
(10, 137, 80, 84500, 6760000),
(11, 113, 1, 102000, 102000),
(11, 114, 12, 103000, 1236000),
(12, 127, 12, 100000, 1200000),
(13, 127, 12, 10000, 120000),
(14, 124, 1, 10000, 10000),
(15, 119, 2, 5000000, 10000000),
(16, 119, 1, 6000000, 6000000),
(17, 111, 67, 3000000, 201000000);

-- --------------------------------------------------------

--
-- Table structure for table `giamgia`
--

DROP TABLE IF EXISTS `giamgia`;
CREATE TABLE IF NOT EXISTS `giamgia` (
  `MaGiam` int(11) NOT NULL AUTO_INCREMENT,
  `TenGiamGia` text NOT NULL,
  `PhanTramGiam` int(11) NOT NULL,
  `DieuKien` int(11) NOT NULL,
  `NgayBD` date NOT NULL,
  `NgayKT` date NOT NULL,
  PRIMARY KEY (`MaGiam`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `giamgia`
--

INSERT INTO `giamgia` (`MaGiam`, `TenGiamGia`, `PhanTramGiam`, `DieuKien`, `NgayBD`, `NgayKT`) VALUES
(1, 'Không giảm giá', 0, 0, '2020-01-01', '2042-12-31'),
(2, 'Giảm 20% đơn hàng từ 150.000đ', 10, 2000000, '2021-04-22', '2021-05-13'),
(4, 'Giảm 10% đơn hàng từ 80.000đ', 10, 1000000, '2021-03-26', '2021-05-31'),
(6, '30/04-01/05 giảm 30% đơn hàng từ 300.000đ', 15, 3000000, '2022-05-01', '2022-05-30'),
(7, 'Giảm 30% cho hóa đơn 500.000đ', 20, 5000000, '2022-05-01', '2022-05-31');

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
CREATE TABLE IF NOT EXISTS `hoadon` (
  `MaHD` int(11) NOT NULL AUTO_INCREMENT,
  `MaKH` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL,
  `GhiChu` text NOT NULL,
  PRIMARY KEY (`MaHD`),
  KEY `hoadon_ibfk_1` (`MaNV`),
  KEY `hoadon_ibfk_2` (`MaKH`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaKH`, `MaNV`, `NgayLap`, `TongTien`, `GhiChu`) VALUES
(18, 4, 3, '2021-01-18', 1013600, 'Đã thanh toán'),
(19, 1, 1, '2021-01-20', 482400, 'Đã thanh toán'),
(20, 2, 1, '2021-01-28', 840000, 'Đã thanh toán'),
(21, 3, 2, '2021-02-07', 1045600, 'Đã thanh toán'),
(22, 1, 1, '2021-02-14', 1004000, 'Đã thanh toán'),
(23, 7, 3, '2021-02-16', 576800, 'Đã thanh toán'),
(24, 7, 2, '2021-03-08', 601300, 'Đã thanh toán'),
(25, 2, 2, '2021-03-09', 391300, 'Đã thanh toán'),
(27, 8, 3, '2021-03-24', 590400, 'Đã thanh toán'),
(29, 9, 2, '2021-04-10', 633500, 'Đã thanh toán'),
(32, 11, 0, '2021-05-03', 1477700, 'Đã thanh toán'),
(33, 9, 0, '2021-05-06', 5110000, 'Đã thanh toán'),
(35, 3, 0, '2021-05-08', 304200, 'Đã thanh toán'),
(37, 2, 0, '2021-05-08', 117000, 'Đã thanh toán'),
(38, 2, 0, '2022-05-18', 785000, 'Đã thanh toán'),
(39, 2, 0, '2022-05-18', 367000, 'Đã thanh toán'),
(41, 2, 0, '2022-05-20', 408000, 'Đã thanh toán'),
(42, 7, 1, '2022-05-23', 924000, 'Đã thanh toán'),
(43, 2, 1, '2022-05-23', 748000, 'Đã thanh toán'),
(44, 2, 1, '2022-05-24', 321300, 'Đã thanh toán'),
(45, 2, 0, '2022-05-24', 250600, 'Đã thanh toán'),
(46, 2, 1, '2022-05-24', 500500, 'Đã thanh toán'),
(47, 2, 1, '2022-05-25', 150000, 'Đã thanh toán'),
(48, 10, 0, '2022-05-25', 15453000, 'Đã thanh toán'),
(49, 2, 0, '2022-05-25', 15976000, 'Đã thanh toán'),
(50, 3, 0, '2022-05-25', 14000000, 'Đã thanh toán');

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
CREATE TABLE IF NOT EXISTS `khachhang` (
  `MaKH` int(11) NOT NULL AUTO_INCREMENT,
  `Ho` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `GioiTinh` varchar(3) NOT NULL,
  `TongChiTieu` int(11) NOT NULL DEFAULT '0',
  `TinhTrang` int(11) NOT NULL,
  PRIMARY KEY (`MaKH`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `Ho`, `Ten`, `GioiTinh`, `TongChiTieu`, `TinhTrang`) VALUES
(1, 'Nguyễn Văn', 'An', 'Nam', 1486400, 1),
(2, 'Trần Ngọc', 'Bình', 'Nữ', 21003700, 1),
(3, 'Lê Thị', 'Giải', 'Nữ', 15468800, 1),
(4, 'Hà Thanh', 'Thoát', 'Nam', 1013600, 1),
(7, 'Trịnh Thị', 'Yên', 'Nữ', 4143700, 1),
(8, 'Trương Đình', 'Vui', 'Nam', 1877000, 1),
(9, 'Lại Thị Ngọc', 'Miền', 'Nữ', 5743500, 1),
(10, 'Trần Quang', 'Cực', 'Nam', 18589800, 1),
(11, 'Nguyễn Ngọc', 'Lạc', 'Nam', 2260300, 1),
(15, 'Cao Thanh', 'Sơn', 'Nam', 0, 0),
(17, 'Nguyễn Thị', 'Mai', 'Nữ', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `loai`
--

DROP TABLE IF EXISTS `loai`;
CREATE TABLE IF NOT EXISTS `loai` (
  `MaLoai` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoai` text NOT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loai`
--

INSERT INTO `loai` (`MaLoai`, `TenLoai`) VALUES
(1, 'Vivo'),
(2, 'Samsung'),
(3, 'Xiaomi'),
(4, 'Oppo');

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
CREATE TABLE IF NOT EXISTS `nhacungcap` (
  `MaNCC` int(11) NOT NULL AUTO_INCREMENT,
  `TenNCC` varchar(255) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `DienThoai` text NOT NULL,
  PRIMARY KEY (`MaNCC`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`, `DiaChi`, `DienThoai`) VALUES
(1, 'Công Ty TNHH SAMSUNG', '273 An Dương Vương, phường 3, quận 5, TP.HCM', '0396527908'),
(2, 'Apple Inc.', '12/49/2 Võ Văn Kiệt, P. Cô Giang, Q1', '0902669733'),
(5, 'Công Ty TNHH Vivo Smartphone', '492 Xô Viết Nghệ Tĩnh, P.25, Q. Bình Thạnh', '0397682193');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE IF NOT EXISTS `nhanvien` (
  `MaNV` int(11) NOT NULL AUTO_INCREMENT,
  `Ho` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `GioiTinh` varchar(3) NOT NULL,
  `ChucVu` varchar(255) NOT NULL,
  PRIMARY KEY (`MaNV`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `GioiTinh`, `ChucVu`) VALUES
(0, 'Admin', '', '', 'Admin'),
(1, 'Nguyễn Quang', 'Phước', 'Nam', 'Quản Lý'),
(2, 'Trần Quang', 'Vinh', 'Nam', 'Quản Lý'),
(3, 'Mai Công', 'Đại', 'Nam', 'Quản Lý'),
(12, 'Trịnh Thu', 'Huyền', 'Nữ', 'Nhân Viên'),
(13, 'Nguyễn Ngọc Mai', 'Linh', 'Nữ', 'Nhân Viên'),
(14, 'Hà Văn', 'Hùng', 'Nam', 'Nhân Viên'),
(15, 'Lê Thị Thuý', 'Diễm', 'Nữ', 'Quản Lý'),
(17, 'Nguyễn Quốc', 'An', 'Nam', 'Nhân viên'),
(18, 'Nguyen Van', 'Test', 'Nam', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `phanquyen`
--

DROP TABLE IF EXISTS `phanquyen`;
CREATE TABLE IF NOT EXISTS `phanquyen` (
  `Quyen` varchar(255) NOT NULL,
  `NhapHang` int(1) NOT NULL,
  `QLSanPham` int(1) NOT NULL,
  `QLNhanVien` int(1) NOT NULL,
  `QLKhachHang` int(1) NOT NULL,
  `ThongKe` int(1) NOT NULL,
  PRIMARY KEY (`Quyen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phanquyen`
--

INSERT INTO `phanquyen` (`Quyen`, `NhapHang`, `QLSanPham`, `QLNhanVien`, `QLKhachHang`, `ThongKe`) VALUES
('Nhân viên', 0, 0, 0, 1, 0),
('Quản lý', 1, 0, 1, 1, 1),
('Quản trị', 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

DROP TABLE IF EXISTS `phieunhap`;
CREATE TABLE IF NOT EXISTS `phieunhap` (
  `MaPN` int(11) NOT NULL AUTO_INCREMENT,
  `MaNCC` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL,
  PRIMARY KEY (`MaPN`),
  KEY `phieunhap_ibfk_1` (`MaNCC`),
  KEY `phieunhap_ibfk_2` (`MaNV`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `MaNCC`, `MaNV`, `NgayLap`, `TongTien`) VALUES
(4, 2, 0, '2021-04-19', 1027000),
(5, 2, 0, '2021-04-23', 268000),
(7, 2, 0, '2021-04-26', 90000),
(8, 2, 0, '2021-05-02', 1070000),
(9, 1, 0, '2021-05-04', 1000000),
(10, 5, 0, '2021-05-07', 11360000),
(11, 1, 1, '2022-05-24', 1338000),
(12, 2, 0, '2022-05-24', 1200000),
(13, 5, 0, '2022-05-24', 120000),
(14, 5, 0, '2022-05-24', 10000),
(15, 1, 0, '2022-05-25', 10000000),
(16, 1, 0, '2022-05-25', 6000000),
(17, 5, 0, '2022-05-25', 201000000);

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
CREATE TABLE IF NOT EXISTS `sanpham` (
  `MaSP` int(11) NOT NULL AUTO_INCREMENT,
  `TenSP` varchar(255) NOT NULL,
  `MaLoai` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonViTinh` varchar(255) NOT NULL,
  `HinhAnh` varchar(255) NOT NULL,
  `DonGia` int(11) NOT NULL,
  PRIMARY KEY (`MaSP`),
  KEY `sanpham_ibfk_1` (`MaLoai`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8mb4 COMMENT='Bang San Pham';

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `TenSP`, `MaLoai`, `SoLuong`, `DonViTinh`, `HinhAnh`, `DonGia`) VALUES
(111, 'Vivo Y15', 1, 100, '32GB, 3GB', 'vivo1.png', 3490000),
(112, 'Vivo Y01', 1, 28, '32GB,2GB', 'vivo2.png', 2990000),
(113, 'Vivo Y55', 1, 17, '128GB, 8GB', 'vivo3.png', 6990000),
(114, 'Vivo V23', 1, 25, '128GB, 8GB', 'vivo4.png', 8490000),
(115, 'Vivo V21', 1, 22, '128GB 8GB', 'vivo5.png', 9090000),
(116, 'Samsung Galaxy A03', 2, 17, '32GB, 3GB', 'samsung1.png', 2990000),
(117, 'Samsung Galaxy A22', 2, 27, '128GB, 6GB', 'samsung2.png', 4990000),
(118, 'Samsung Galaxy A32', 2, 30, '128GB, 6GB', 'samsung3.png', 6490000),
(119, 'Samsung Galaxy M33', 2, 5, '128GB, 6GB', 'samsung4.png', 7690000),
(120, 'Samsung Galaxy S20 FE', 2, 37, '256GB, 8GB', 'samsung5.png', 12900000),
(121, 'Xiaomi Redmi 9A', 3, 20, '32GB, 2GB', 'xiaomi1.png', 2490000),
(122, 'Xiaomi Redmi 10C', 3, 20, '64GB, 4GB', 'xiaomi2.png', 3490000),
(123, 'Xiaomi Redmi Note 11', 3, 9, '64GB, 4GB', 'xiaomi3.png', 4690000),
(124, 'Xiaomi Mi 11 Lite', 3, 10, '128GB, 8GB', 'xiaomi4.png', 7990000),
(125, 'Xiaomi Mi 11T', 3, 12, '128GB, 8GB', 'xiaomi5.png', 10990000),
(126, 'Oppo A16', 4, 12, '32GB, 3GB', 'oppo1.png', 3990000),
(127, 'Oppo A74 5G', 4, 12, '128GB/6Gb', 'oppo2.png', 5700000),
(128, 'Oppo Sạc Dự Phòng', 4, 2, '10000mAh', 'oppo3.png', 700000),
(129, 'Samsung Galaxy Ear Buds', 2, 22, 'R177', 'tainghess1.png', 2990000),
(150, 'Iphone', 2, 13, 'abc', 'TEST1.jpg', 3000000),
(151, 'Iphone', 2, 13, 'abc', 'TEST1.jpg', 3000000),
(152, 'Iphone', 2, 13, 'abc', 'TEST1.jpg', 3000000),
(153, 'Iphone', 2, 13, 'abc', 'TEST1.jpg', 3000000),
(154, 'Iphone', 2, 13, 'abc', 'TEST1.jpg', 3000000),
(155, 'Vivo Y15', 1, 100, '32GB 3GB', 'vivo1.png', 3490000);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `MaNV` int(11) NOT NULL AUTO_INCREMENT,
  `TenDangNhap` varchar(255) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `Quyen` varchar(255) NOT NULL,
  `TrangThai` int(11) NOT NULL,
  PRIMARY KEY (`MaNV`),
  KEY `taikhoan_ibfk_2` (`Quyen`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`MaNV`, `TenDangNhap`, `MatKhau`, `Quyen`, `TrangThai`) VALUES
(0, 'admin', 'admin', 'Quản trị', 1),
(1, 'ql01', 'ql01', 'Quản lý', 1),
(2, 'ql02', 'ql02', 'Quản lý', 0),
(3, 'ql03', 'ql03', 'Nhân viên', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ctphieunhap`
--
ALTER TABLE `ctphieunhap`
  ADD CONSTRAINT `ctphieunhap_ibfk_2` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `loai` (`MaLoai`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`Quyen`) REFERENCES `phanquyen` (`Quyen`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
