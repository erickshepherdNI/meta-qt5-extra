SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d48aab54cfe78cfc74d0c8ba099a905b"
SRC_URI[sha256sum] = "5a82417c6904b0f97c50428d0540bd9895fe3332605b2fabbaebb15665d3efa1"

FILES_${PN} += "${datadir}/wallpapers"
