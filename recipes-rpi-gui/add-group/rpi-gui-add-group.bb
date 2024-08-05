DESCRIPTION = "Add weston user to memaccess group"
LICENSE = "CLOSED"

SRC_URI = " file://99-mem.rules "

inherit useradd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM:${PN} = "memaccess"

do_install(){
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0755 ${WORKDIR}/99-mem.rules ${D}${sysconfdir}/udev/rules.d/
}

FILES:${PN} += "${datadir}/99-mem.rules"