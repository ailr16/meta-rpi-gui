SUMMARY = "Run python script at startup"
LICENSE = "CLOSED"

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "pyscript.service"

SRC_URI = " file://pyscript.service "

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/pyscript.service ${D}${systemd_system_unitdir}/
}

FILES:${PN} += "${systemd_system_unitdir}/pyscript.service"

SYSTEMD_SERVICE:${PN} = "pyscript.service"
SYSTEMD_AUTO_ENABLE = "enable"
