# Copyright (C) 2016 FEDEVEL
# Released under the MIT license (see COPYING.MIT for the terms)
 
SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"
 
require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc
 
DEPENDS += "lzop-native bc-native"
 
include linux-fslc.inc
 
#PV .= "+git${SRCPV}"
PV .= ""
 
SRCBRANCH = "jethro"
LOCALVERSION = "-yocto"
 
#Always update SRCREV based on your last commit
SRCREV = "5f7c9495dc3ce5e7e85c311e27c47358dd136f04"
 
KERNEL_SRC ?= "git://github.com/heikolabs/openrex-linux-3.14.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} file://defconfig"
 
COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"


