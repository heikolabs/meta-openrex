# Copyright (C) 2015, 2017 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

#Always update SRCREV based on your last commit
SRCREV = "d77d6f4985cc55d13f3c227efbb441f2bf18958e"

SRC_URI = "git://github.com/heikolabs/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

# PV .= "+git${SRCPV}"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
