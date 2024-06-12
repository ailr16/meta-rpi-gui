SUMMARY = "Copy script"
SRC_URI = " file://script.py "

LICENSE = "CLOSED"

do_install() {
    install -d ${D}${datadir}
    install -m 0755 ${WORKDIR}/script.py ${D}${datadir}/
}

FILES:${PN} += "${datadir}/script.py"
