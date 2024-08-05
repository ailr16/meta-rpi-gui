DESCRIPTION = "Add gpio group"
LICENSE = "CLOSED"

SRC_URI = " file://99-gpio.rules "

inherit useradd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM:${PN} = "gpio"
EXTRA_USERS_PARAMS = "usermod -a -G gpio weston"

do_install(){
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0755 ${WORKDIR}/99-gpio.rules ${D}${sysconfdir}/udev/rules.d/
}



FILES:${PN} += "${datadir}/99-gpio.rules"