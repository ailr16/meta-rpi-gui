SUMMARY = "Copy script"
LICENSE = "CLOSED"

SRC_URI = "file://cronfile"


do_install() {
    install -d ${D}${sysconfdir}/cron.d
    install -m 0644 ${WORKDIR}/cronfile ${D}${sysconfdir}/cron.d/cronfile
}

FILES:${PN} += "${sysconfdir}/cron.d/cronfile"
