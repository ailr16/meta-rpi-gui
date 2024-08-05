DESCRIPTION = "Add gpio group"
LICENSE = "CLOSED"

SRC_URI = " file://99-gpio.rules "

inherit useradd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM:${PN} = "gpio"

do_install(){
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0755 ${WORKDIR}/99-gpio.rules ${D}${sysconfdir}/udev/rules.d/
}

pkg_postinst_ontarget:${PN}(){
    if ! groups weston | grep -q gpio; then
        usermod -a -G gpio weston
    fi
}


FILES:${PN} += "${datadir}/99-gpio.rules"